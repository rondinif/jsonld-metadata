/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * The price asked for a given offer by the respective organization or person.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class UnitPriceSpecification extends PriceSpecification {
  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
   */
  public Number getBillingIncrement() {
    return myBillingIncrement;
  }
  /**
   * A short text or acronym indicating multiple price specifications for the same offer, e.g. SRP for the suggested retail price or INVOICE for the invoice price, mostly used in the car industry.
   */
  public String getPriceType() {
    return myPriceType;
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  public String getUnitCode() {
    return myUnitCode;
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>.
   */
  public String getUnitText() {
    return myUnitText;
  }
  /**
   * Builder for {@see UnitPriceSpecification}
   */
  public static final class Builder {
    public UnitPriceSpecification build() {
      return new UnitPriceSpecification(valueAddedTaxIncluded, mainEntityOfPage, billingIncrement, priceCurrency, eligibleTransactionVolume, alternateName, potentialAction, unitCode, additionalType, url, sameAs, validFrom, image, name, validThrough, maxPrice, unitText, priceType, minPrice, eligibleQuantity, description, price);
    }
    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     */
    public Builder valueAddedTaxIncluded(Boolean value) {
      valueAddedTaxIncluded = value;
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
      <br /><br />
      Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
      example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
      represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
      between the page and the primary entity.
      <br /><br />

      Related properties include sameAs, about, and url.
      <br /><br />

      The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
      official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
      to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
      serves more to clarify which of several entities is the main one for that page.
      <br /><br />

      mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
      for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
      mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
      <br /><br />

      about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
      while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
      describes some other entity. For example, one web page may display a news article about a particular person.
      Another page may display a product review for a particular product. In these cases, mainEntity for the pages
      should refer to the news article or review, respectively, while about would more properly refer to the person or product.
      
     */
    public Builder mainEntityOfPage(CreativeWork value) {
      mainEntityOfPage = value;
      return this;
    }
    /**
     * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
     */
    public Builder billingIncrement(Number value) {
      billingIncrement = value;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    public Builder priceCurrency(String value) {
      priceCurrency = value;
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    public Builder eligibleTransactionVolume(PriceSpecification value) {
      eligibleTransactionVolume = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    public Builder unitCode(String value) {
      unitCode = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    public Builder validFrom(java.util.Date value) {
      validFrom = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    /**
     * The end of the validity of offer, price specification, or opening hours data.
     */
    public Builder validThrough(java.util.Date value) {
      validThrough = value;
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    public Builder maxPrice(Number value) {
      maxPrice = value;
      return this;
    }
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>.
     */
    public Builder unitText(String value) {
      unitText = value;
      return this;
    }
    /**
     * A short text or acronym indicating multiple price specifications for the same offer, e.g. SRP for the suggested retail price or INVOICE for the invoice price, mostly used in the car industry.
     */
    public Builder priceType(String value) {
      priceType = value;
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    public Builder minPrice(Number value) {
      minPrice = value;
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    public Builder eligibleQuantity(QuantitativeValue value) {
      eligibleQuantity = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
<br />
<br />
      Usage guidelines:
<br />
<ul>
<li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
      including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
</li>
<li>
      Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
</li>
<li>
      Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
      alongside more human-friendly formatting.
</li>
<li>
      Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
</li>
</ul>
      
     */
    public Builder price(Number value) {
      price = value;
      return this;
    }
    private Boolean valueAddedTaxIncluded;
    private CreativeWork mainEntityOfPage;
    private Number billingIncrement;
    private String priceCurrency;
    private PriceSpecification eligibleTransactionVolume;
    private String alternateName;
    private Action potentialAction;
    private String unitCode;
    private String additionalType;
    private String url;
    private String sameAs;
    private java.util.Date validFrom;
    private Image image;
    private String name;
    private java.util.Date validThrough;
    private Number maxPrice;
    private String unitText;
    private String priceType;
    private Number minPrice;
    private QuantitativeValue eligibleQuantity;
    private String description;
    private Number price;
  }

  protected UnitPriceSpecification(Boolean valueAddedTaxIncluded, CreativeWork mainEntityOfPage, Number billingIncrement, String priceCurrency, PriceSpecification eligibleTransactionVolume, String alternateName, Action potentialAction, String unitCode, String additionalType, String url, String sameAs, java.util.Date validFrom, Image image, String name, java.util.Date validThrough, Number maxPrice, String unitText, String priceType, Number minPrice, QuantitativeValue eligibleQuantity, String description, Number price) {
    super(valueAddedTaxIncluded, mainEntityOfPage, priceCurrency, eligibleTransactionVolume, alternateName, potentialAction, additionalType, url, sameAs, validFrom, name, image, maxPrice, validThrough, minPrice, eligibleQuantity, description, price);
    myBillingIncrement = billingIncrement;
    myPriceType = priceType;
    myUnitCode = unitCode;
    myUnitText = unitText;
  }
  private Number myBillingIncrement;
  private String myPriceType;
  private String myUnitCode;
  private String myUnitText;
}