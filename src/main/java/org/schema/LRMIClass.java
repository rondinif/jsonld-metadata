/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * This class is based on the work of the LRMI project, see lrmi.net for details.
 */
public class LRMIClass {
  protected LRMIClass() {
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LRMIClass lRMIClass = (LRMIClass) o;
    if (!super.equals(o)) return false;
    return true;
  }
  
  /**
   * Builder for {@link LRMIClass}
   */
  public static class Builder implements ThingBuilder<LRMIClass> {
    public LRMIClass build() {
      return new LRMIClass();
    }
    @Override public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
      }
    }
  }
  
}
