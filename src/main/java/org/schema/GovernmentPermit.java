/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A permit issued by a government agency.
 */
public class GovernmentPermit extends Permit {
  /**
   * Builder for {@see GovernmentPermit}
   */
  public static final class Builder {
    public GovernmentPermit build() {
      return new GovernmentPermit(issuedThrough, mainEntityOfPage, issuedBy, alternateName, potentialAction, url, additionalType, sameAs, validFrom, permitAudience, image, name, validFor, validUntil, validIn, description);
    }
    /**
     * The service through with the permit was granted.
     */
    public Builder issuedThrough(Service value) {
      issuedThrough = value;
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
     * The organization issuing the ticket or permit.
     */
    public Builder issuedBy(Organization value) {
      issuedBy = value;
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
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
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
    /**
     * The target audience for this permit.
     */
    public Builder permitAudience(Audience value) {
      permitAudience = value;
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
     * The time validity of the permit.
     */
    public Builder validFor(Duration value) {
      validFor = value;
      return this;
    }
    /**
     * The date when the item is no longer valid.
     */
    public Builder validUntil(java.util.Date value) {
      validUntil = value;
      return this;
    }
    /**
     * The geographic area where the permit is valid.
     */
    public Builder validIn(AdministrativeArea value) {
      validIn = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private Service issuedThrough;
    private CreativeWork mainEntityOfPage;
    private Organization issuedBy;
    private String alternateName;
    private Action potentialAction;
    private String url;
    private String additionalType;
    private String sameAs;
    private java.util.Date validFrom;
    private Audience permitAudience;
    private Image image;
    private String name;
    private Duration validFor;
    private java.util.Date validUntil;
    private AdministrativeArea validIn;
    private String description;
  }

  protected GovernmentPermit(Service issuedThrough, CreativeWork mainEntityOfPage, Organization issuedBy, String alternateName, Action potentialAction, String url, String additionalType, String sameAs, java.util.Date validFrom, Audience permitAudience, Image image, String name, Duration validFor, java.util.Date validUntil, AdministrativeArea validIn, String description) {
    super(issuedThrough, mainEntityOfPage, issuedBy, potentialAction, alternateName, url, additionalType, sameAs, validFrom, permitAudience, image, name, validFor, validUntil, description, validIn);
  }
}