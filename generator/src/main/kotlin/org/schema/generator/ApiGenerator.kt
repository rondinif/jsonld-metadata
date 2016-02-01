package org.schema.generator

/**
 * @author Victor Kropp
 */

class ApiGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(p: Package) {
        p.writeClass("SchemaOrg") {
            appendln(banner)
            appendln()
            appendln("package ${p.name};")
            appendln()
            appendln("import com.fasterxml.jackson.core.JsonProcessingException;")
            appendln("import com.fasterxml.jackson.databind.JsonNode;")
            appendln("import com.fasterxml.jackson.databind.ObjectMapper;")
            appendln("import org.jetbrains.annotations.NotNull;")
            appendln()
            appendln("public class SchemaOrg {")

            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || sink.shouldSkip(type.name!!))
                    continue

                val typeName = type.name!!.capitalize()

                type.comment?.let {
                    appendln("  /**")
                    appendln("   * $it")
                    appendln("   */")
                }
                appendln("  public static $typeName.Builder ${typeName.decapitalize()}() { return new $typeName.Builder(); }")
            }
            appendln()
            appendln("  public static ThingBuilder getBuilder(@NotNull String type) {")
            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || sink.shouldSkip(type.name!!))
                    continue

                val typeName = type.name!!.capitalize()

                appendln("    if (\"$typeName\".equals(type)) { return new $typeName.Builder(); }")
            }
            appendln("    return null;")
            appendln("  }")
            appendln()
            appendln("  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {")
            appendln("    return new ObjectMapper().writeValueAsString(thing);")
            appendln("  }")
            appendln("  public static Thing readJson(String json) throws java.io.IOException {")
            appendln("    final ObjectMapper objectMapper = new ObjectMapper();")
            appendln("    objectMapper.registerModule(new JsonLdModule());")
            appendln("    return objectMapper.readValue(json, Thing.class);")
            appendln("  }")
            appendln("  public static Thing readJson(JsonNode node) {")
            appendln("    final ObjectMapper objectMapper = new ObjectMapper();")
            appendln("    return ThingDeserializer.fromMap(objectMapper.convertValue(node, java.util.Map.class));")
            appendln("  }")
            appendln("}")
        }

        p.writeClass("ThingBuilder", """$banner

package ${p.name};

public interface ThingBuilder<T> {
  void fromMap(java.util.Map<String,Object> map);
  T build();
}""")
        p.writeClass("JsonLdModule", """$banner

package ${p.name};

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonLdModule extends SimpleModule {
    public JsonLdModule() {
        super("JsonLD Module", new Version(1, 0, 0, null, null, null));
        addDeserializer(Thing.class, new ThingDeserializer());
    }
}""")
        p.writeClass("ThingDeserializer", """$banner

package ${p.name};

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.jetbrains.annotations.Nullable;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.text.*;

/**
 * Typed deserializer for {@link org.schema.Thing}
 */
class ThingDeserializer extends JsonDeserializer<Thing> {
    private static final DateFormat dateFormat = new ISO8601DateFormat();

    @Override
    public Thing deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        return fromMap(p.<HashMap<String, Object>>readValueAs(new TypeReference<HashMap<String, Object>>() {
        }));
    }

    @Nullable
    static Thing fromMap(Map<String, Object> result) {
        if (!"http://schema.org/".equals(result.get("@context"))) {
            return null;
        }

        final Object type = result.get("@type");
        if (type == null || !(type instanceof String)) {
            return null;
        }

        final ThingBuilder builder = SchemaOrg.getBuilder((String) type);
        if (builder == null) {
            return null;
        }

        for (Map.Entry<String, Object> entry : result.entrySet()) {
            if (entry.getValue() instanceof String) {
                try {
                    final Date date = dateFormat.parse((String) entry.getValue());
                    result.put(entry.getKey(), date);
                } catch (ParseException ignored) {
                }
            }
        }

        builder.fromMap(result);
        return (Thing) builder.build();
    }
}""")
    }
}