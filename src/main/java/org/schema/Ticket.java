/*
 * Copyright 2015 JetBrains s.r.o.
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

/**
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 */
public class Ticket extends Intangible {
  /**
   * The person or organization the reservation or ticket is for.
   */
  public OrganizationOrPerson getUnderName() {
    return myUnderName;
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  public NumberOrPriceSpecificationOrString getTotalPrice() {
    return myTotalPrice;
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
   */
  public String getPriceCurrency() {
    return myPriceCurrency;
  }
  /**
   * The organization issuing the ticket or permit.
   */
  public Organization getIssuedBy() {
    return myIssuedBy;
  }
  /**
   * The date the ticket was issued.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDateIssued() {
    return myDateIssued;
  }
  /**
   * The seat associated with the ticket.
   */
  public Seat getTicketedSeat() {
    return myTicketedSeat;
  }
  /**
   * The unique identifier for the ticket.
   */
  public String getTicketNumber() {
    return myTicketNumber;
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   */
  public String getTicketToken() {
    return myTicketToken;
  }
  /**
   * Builder for {@link Ticket}
   */
  public static final class Builder {
    /**
     * Creates new {@link Ticket} instance.
     */
    public Ticket build() {
      return new Ticket(underName, totalPrice, priceCurrency, issuedBy, dateIssued, ticketedSeat, ticketNumber, ticketToken, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Organization organization) {
      if(this.underName == null) this.underName = new OrganizationOrPerson();
      this.underName.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Person person) {
      if(this.underName == null) this.underName = new OrganizationOrPerson();
      this.underName.setPerson(person);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(Number number) {
      if(this.totalPrice == null) this.totalPrice = new NumberOrPriceSpecificationOrString();
      this.totalPrice.setNumber(number);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(PriceSpecification priceSpecification) {
      if(this.totalPrice == null) this.totalPrice = new NumberOrPriceSpecificationOrString();
      this.totalPrice.setPriceSpecification(priceSpecification);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(String totalPrice) {
      if(this.totalPrice == null) this.totalPrice = new NumberOrPriceSpecificationOrString();
      this.totalPrice.setString(totalPrice);
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    public Builder priceCurrency(String priceCurrency) {
      this.priceCurrency = priceCurrency;
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    public Builder issuedBy(Organization organization) {
      this.issuedBy = organization;
      return this;
    }
    /**
     * The date the ticket was issued.
     */
    public Builder dateIssued(java.util.Date date) {
      this.dateIssued = date;
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    public Builder ticketedSeat(Seat seat) {
      this.ticketedSeat = seat;
      return this;
    }
    /**
     * The unique identifier for the ticket.
     */
    public Builder ticketNumber(String ticketNumber) {
      this.ticketNumber = ticketNumber;
      return this;
    }
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     */
    public Builder ticketToken(String ticketToken) {
      this.ticketToken = ticketToken;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
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
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    private OrganizationOrPerson underName;
    private NumberOrPriceSpecificationOrString totalPrice;
    private String priceCurrency;
    private Organization issuedBy;
    private java.util.Date dateIssued;
    private Seat ticketedSeat;
    private String ticketNumber;
    private String ticketToken;
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

  protected Ticket(OrganizationOrPerson underName, NumberOrPriceSpecificationOrString totalPrice, String priceCurrency, Organization issuedBy, java.util.Date dateIssued, Seat ticketedSeat, String ticketNumber, String ticketToken, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myUnderName = underName;
    myTotalPrice = totalPrice;
    myPriceCurrency = priceCurrency;
    myIssuedBy = issuedBy;
    myDateIssued = dateIssued;
    myTicketedSeat = ticketedSeat;
    myTicketNumber = ticketNumber;
    myTicketToken = ticketToken;
  }
  private OrganizationOrPerson myUnderName;
  private NumberOrPriceSpecificationOrString myTotalPrice;
  private String myPriceCurrency;
  private Organization myIssuedBy;
  private java.util.Date myDateIssued;
  private Seat myTicketedSeat;
  private String myTicketNumber;
  private String myTicketToken;
}
