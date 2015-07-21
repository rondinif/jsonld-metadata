/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A statement of the money due for goods or services; a bill.
 */
public class Invoice extends Intangible {
  /**
   * A number that confirms the given order or payment has been received.
   */
  public String getConfirmationNumber() {
    return myConfirmationNumber;
  }
  /**
   * Party placing the order or paying the invoice.
   */
  public Organization getCustomer() {
    return myCustomer;
  }
  /**
   * The date that payment is due.
   */
  public java.util.Date getPaymentDue() {
    return myPaymentDue;
  }
  /**
   * The name of the credit card or other method of payment for the order.
   */
  public PaymentMethod getPaymentMethod() {
    return myPaymentMethod;
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   */
  public String getPaymentMethodId() {
    return myPaymentMethodId;
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public Person getProvider() {
    return myProvider;
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  public Person getBroker() {
    return myBroker;
  }
  /**
   * The total amount due.
   */
  public PriceSpecification getTotalPaymentDue() {
    return myTotalPaymentDue;
  }
  /**
   * The minimum payment required at this time.
   */
  public PriceSpecification getMinimumPaymentDue() {
    return myMinimumPaymentDue;
  }
  /**
   * The identifier for the account the payment will be applied to.
   */
  public String getAccountId() {
    return myAccountId;
  }
  /**
   * The date the invoice is scheduled to be paid.
   */
  public java.util.Date getScheduledPaymentDate() {
    return myScheduledPaymentDate;
  }
  /**
   * The time interval used to compute the invoice.
   */
  public Duration getBillingPeriod() {
    return myBillingPeriod;
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  public String getPaymentStatus() {
    return myPaymentStatus;
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   */
  public Order getReferencesOrder() {
    return myReferencesOrder;
  }
  /**
   * Builder for {@see Invoice}
   */
  public static final class Builder {
    public Invoice build() {
      return new Invoice(paymentMethodId, accountId, mainEntityOfPage, referencesOrder, alternateName, potentialAction, customer, url, additionalType, sameAs, name, image, totalPaymentDue, paymentDue, paymentMethod, billingPeriod, broker, confirmationNumber, description, minimumPaymentDue, paymentStatus, scheduledPaymentDate, provider);
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    public Builder paymentMethodId(String value) {
      paymentMethodId = value;
      return this;
    }
    /**
     * The identifier for the account the payment will be applied to.
     */
    public Builder accountId(String value) {
      accountId = value;
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
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    public Builder referencesOrder(Order value) {
      referencesOrder = value;
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
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Organization value) {
      customer = value;
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
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The total amount due.
     */
    public Builder totalPaymentDue(PriceSpecification value) {
      totalPaymentDue = value;
      return this;
    }
    /**
     * The date that payment is due.
     */
    public Builder paymentDue(java.util.Date value) {
      paymentDue = value;
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    public Builder paymentMethod(PaymentMethod value) {
      paymentMethod = value;
      return this;
    }
    /**
     * The time interval used to compute the invoice.
     */
    public Builder billingPeriod(Duration value) {
      billingPeriod = value;
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person value) {
      broker = value;
      return this;
    }
    /**
     * A number that confirms the given order or payment has been received.
     */
    public Builder confirmationNumber(String value) {
      confirmationNumber = value;
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
     * The minimum payment required at this time.
     */
    public Builder minimumPaymentDue(PriceSpecification value) {
      minimumPaymentDue = value;
      return this;
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     */
    public Builder paymentStatus(String value) {
      paymentStatus = value;
      return this;
    }
    /**
     * The date the invoice is scheduled to be paid.
     */
    public Builder scheduledPaymentDate(java.util.Date value) {
      scheduledPaymentDate = value;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person value) {
      provider = value;
      return this;
    }
    private String paymentMethodId;
    private String accountId;
    private CreativeWork mainEntityOfPage;
    private Order referencesOrder;
    private String alternateName;
    private Action potentialAction;
    private Organization customer;
    private String url;
    private String additionalType;
    private String sameAs;
    private String name;
    private Image image;
    private PriceSpecification totalPaymentDue;
    private java.util.Date paymentDue;
    private PaymentMethod paymentMethod;
    private Duration billingPeriod;
    private Person broker;
    private String confirmationNumber;
    private String description;
    private PriceSpecification minimumPaymentDue;
    private String paymentStatus;
    private java.util.Date scheduledPaymentDate;
    private Person provider;
  }

  protected Invoice(String paymentMethodId, String accountId, CreativeWork mainEntityOfPage, Order referencesOrder, String alternateName, Action potentialAction, Organization customer, String url, String additionalType, String sameAs, String name, Image image, PriceSpecification totalPaymentDue, java.util.Date paymentDue, PaymentMethod paymentMethod, Duration billingPeriod, Person broker, String confirmationNumber, String description, PriceSpecification minimumPaymentDue, String paymentStatus, java.util.Date scheduledPaymentDate, Person provider) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myConfirmationNumber = confirmationNumber;
    myCustomer = customer;
    myPaymentDue = paymentDue;
    myPaymentMethod = paymentMethod;
    myPaymentMethodId = paymentMethodId;
    myProvider = provider;
    myBroker = broker;
    myTotalPaymentDue = totalPaymentDue;
    myMinimumPaymentDue = minimumPaymentDue;
    myAccountId = accountId;
    myScheduledPaymentDate = scheduledPaymentDate;
    myBillingPeriod = billingPeriod;
    myPaymentStatus = paymentStatus;
    myReferencesOrder = referencesOrder;
  }
  private String myConfirmationNumber;
  private Organization myCustomer;
  private java.util.Date myPaymentDue;
  private PaymentMethod myPaymentMethod;
  private String myPaymentMethodId;
  private Person myProvider;
  private Person myBroker;
  private PriceSpecification myTotalPaymentDue;
  private PriceSpecification myMinimumPaymentDue;
  private String myAccountId;
  private java.util.Date myScheduledPaymentDate;
  private Duration myBillingPeriod;
  private String myPaymentStatus;
  private Order myReferencesOrder;
}