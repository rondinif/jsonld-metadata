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
 * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class TypeAndQuantityNode extends StructuredValue {
  /**
   * The quantity of the goods included in the offer.
   */
  public Number getAmountOfThisGood() { return myAmountOfThisGood; }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  public BusinessFunction getBusinessFunction() { return myBusinessFunction; }
  /**
   * The product that this structured value is referring to.
   */
  public Product getTypeOfGood() { return myTypeOfGood; }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  public String getUnitCode() { return myUnitCode; }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>.
   */
  public String getUnitText() { return myUnitText; }
  protected TypeAndQuantityNode(Number amountOfThisGood, BusinessFunction businessFunction, Product typeOfGood, String unitCode, String unitText, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAmountOfThisGood = amountOfThisGood;
    myBusinessFunction = businessFunction;
    myTypeOfGood = typeOfGood;
    myUnitCode = unitCode;
    myUnitText = unitText;
    myAmountOfThisGood = amountOfThisGood;
    myBusinessFunction = businessFunction;
    myTypeOfGood = typeOfGood;
    myUnitCode = unitCode;
    myUnitText = unitText;
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAmountOfThisGood != null ? myAmountOfThisGood.hashCode() : 0);
    result = 31 * result + (myBusinessFunction != null ? myBusinessFunction.hashCode() : 0);
    result = 31 * result + (myTypeOfGood != null ? myTypeOfGood.hashCode() : 0);
    result = 31 * result + (myUnitCode != null ? myUnitCode.hashCode() : 0);
    result = 31 * result + (myUnitText != null ? myUnitText.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TypeAndQuantityNode typeAndQuantityNode = (TypeAndQuantityNode) o;
    if (!super.equals(o)) return false;
    if (myAmountOfThisGood != null ? !myAmountOfThisGood.equals(typeAndQuantityNode.myAmountOfThisGood) : typeAndQuantityNode.myAmountOfThisGood != null) return false;
    if (myBusinessFunction != null ? !myBusinessFunction.equals(typeAndQuantityNode.myBusinessFunction) : typeAndQuantityNode.myBusinessFunction != null) return false;
    if (myTypeOfGood != null ? !myTypeOfGood.equals(typeAndQuantityNode.myTypeOfGood) : typeAndQuantityNode.myTypeOfGood != null) return false;
    if (myUnitCode != null ? !myUnitCode.equals(typeAndQuantityNode.myUnitCode) : typeAndQuantityNode.myUnitCode != null) return false;
    if (myUnitText != null ? !myUnitText.equals(typeAndQuantityNode.myUnitText) : typeAndQuantityNode.myUnitText != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link TypeAndQuantityNode}
   */
  public static class Builder implements ThingBuilder<TypeAndQuantityNode> {
    public TypeAndQuantityNode build() {
      return new TypeAndQuantityNode(amountOfThisGood, businessFunction, typeOfGood, unitCode, unitText, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Integer integer) {
      if (this.amountOfThisGood == null) this.amountOfThisGood = new Number();
      this.amountOfThisGood.setInteger(integer);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Long amountOfThisGood) {
      if (this.amountOfThisGood == null) this.amountOfThisGood = new Number();
      this.amountOfThisGood.setLong(amountOfThisGood);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Float amountOfThisGood) {
      if (this.amountOfThisGood == null) this.amountOfThisGood = new Number();
      this.amountOfThisGood.setFloat(amountOfThisGood);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull Double amountOfThisGood) {
      if (this.amountOfThisGood == null) this.amountOfThisGood = new Number();
      this.amountOfThisGood.setDouble(amountOfThisGood);
      return this;
    }
    /**
     * The quantity of the goods included in the offer.
     */
    @NotNull public Builder amountOfThisGood(@NotNull String amountOfThisGood) {
      if (this.amountOfThisGood == null) this.amountOfThisGood = new Number();
      this.amountOfThisGood.setString(amountOfThisGood);
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction businessFunction) {
      this.businessFunction = businessFunction;
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction.Builder businessFunction) {
      return this.businessFunction(businessFunction.build());
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product product) {
      this.typeOfGood = product;
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product.Builder product) {
      return this.typeOfGood(product.build());
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @NotNull public Builder unitCode(@NotNull String unitCode) {
      this.unitCode = unitCode;
      return this;
    }
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     */
    @NotNull public Builder unitText(@NotNull String unitText) {
      this.unitText = unitText;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      this.description = description;
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
        if ("amountOfThisGood".equals(key) && value instanceof Integer) { amountOfThisGood((Integer)value); continue; }
        if ("amountOfThisGood".equals(key) && value instanceof Long) { amountOfThisGood((Long)value); continue; }
        if ("amountOfThisGood".equals(key) && value instanceof Float) { amountOfThisGood((Float)value); continue; }
        if ("amountOfThisGood".equals(key) && value instanceof Double) { amountOfThisGood((Double)value); continue; }
        if ("amountOfThisGood".equals(key) && value instanceof String) { amountOfThisGood((String)value); continue; }
        if ("businessFunction".equals(key) && value instanceof BusinessFunction) { businessFunction((BusinessFunction)value); continue; }
        if ("typeOfGood".equals(key) && value instanceof Product) { typeOfGood((Product)value); continue; }
        if ("unitCode".equals(key) && value instanceof String) { unitCode((String)value); continue; }
        if ("unitText".equals(key) && value instanceof String) { unitText((String)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private Number amountOfThisGood;
    private BusinessFunction businessFunction;
    private Product typeOfGood;
    private String unitCode;
    private String unitText;
    private String additionalType;
    private String alternateName;
    private String description;
    private CreativeWorkOrString mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;
    private Action potentialAction;
    private String id;
  }
  
  private Number myAmountOfThisGood;
  private BusinessFunction myBusinessFunction;
  private Product myTypeOfGood;
  private String myUnitCode;
  private String myUnitText;
}
