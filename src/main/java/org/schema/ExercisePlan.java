/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class ExercisePlan extends PhysicalActivity {
  /**
   * Length of time to engage in the activity.
   */
  public Duration getActivityDuration() {
    return myActivityDuration;
  }
  /**
   * How often one should engage in the activity.
   */
  public String getActivityFrequency() {
    return myActivityFrequency;
  }
  /**
   * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
   */
  public String getAdditionalVariable() {
    return myAdditionalVariable;
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  public String getExerciseType() {
    return myExerciseType;
  }
  /**
   * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
   */
  public String getIntensity() {
    return myIntensity;
  }
  /**
   * Number of times one should repeat the activity.
   */
  public Number getRepetitions() {
    return myRepetitions;
  }
  /**
   * How often one should break from the activity.
   */
  public String getRestPeriods() {
    return myRestPeriods;
  }
  /**
   * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
   */
  public Energy getWorkload() {
    return myWorkload;
  }
  /**
   * Builder for {@see ExercisePlan}
   */
  public static final class Builder {
    public ExercisePlan build() {
      return new ExercisePlan(indication, adverseOutcome, workload, potentialAction, additionalType, medicineSystem, restPeriods, code, exerciseType, epidemiology, activityDuration, image, guideline, description, associatedAnatomy, pathophysiology, mainEntityOfPage, contraindication, intensity, alternateName, url, sameAs, recognizingAuthority, study, additionalVariable, activityFrequency, name, duplicateTherapy, relevantSpecialty, repetitions, seriousAdverseOutcome, category);
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    public Builder indication(MedicalIndication value) {
      indication = value;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    public Builder adverseOutcome(MedicalEntity value) {
      adverseOutcome = value;
      return this;
    }
    /**
     * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
     */
    public Builder workload(Energy value) {
      workload = value;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    public Builder medicineSystem(MedicineSystem value) {
      medicineSystem = value;
      return this;
    }
    /**
     * How often one should break from the activity.
     */
    public Builder restPeriods(String value) {
      restPeriods = value;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode value) {
      code = value;
      return this;
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    public Builder exerciseType(String value) {
      exerciseType = value;
      return this;
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    public Builder epidemiology(String value) {
      epidemiology = value;
      return this;
    }
    /**
     * Length of time to engage in the activity.
     */
    public Builder activityDuration(Duration value) {
      activityDuration = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline value) {
      guideline = value;
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
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalStructure value) {
      associatedAnatomy = value;
      return this;
    }
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    public Builder pathophysiology(String value) {
      pathophysiology = value;
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
     * A contraindication for this therapy.
     */
    public Builder contraindication(MedicalContraindication value) {
      contraindication = value;
      return this;
    }
    /**
     * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
     */
    public Builder intensity(String value) {
      intensity = value;
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
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization value) {
      recognizingAuthority = value;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    public Builder study(MedicalStudy value) {
      study = value;
      return this;
    }
    /**
     * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
     */
    public Builder additionalVariable(String value) {
      additionalVariable = value;
      return this;
    }
    /**
     * How often one should engage in the activity.
     */
    public Builder activityFrequency(String value) {
      activityFrequency = value;
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
     * A therapy that duplicates or overlaps this one.
     */
    public Builder duplicateTherapy(MedicalTherapy value) {
      duplicateTherapy = value;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty value) {
      relevantSpecialty = value;
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    public Builder repetitions(Number value) {
      repetitions = value;
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    public Builder seriousAdverseOutcome(MedicalEntity value) {
      seriousAdverseOutcome = value;
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory value) {
      category = value;
      return this;
    }
    private MedicalIndication indication;
    private MedicalEntity adverseOutcome;
    private Energy workload;
    private Action potentialAction;
    private String additionalType;
    private MedicineSystem medicineSystem;
    private String restPeriods;
    private MedicalCode code;
    private String exerciseType;
    private String epidemiology;
    private Duration activityDuration;
    private Image image;
    private MedicalGuideline guideline;
    private String description;
    private AnatomicalStructure associatedAnatomy;
    private String pathophysiology;
    private CreativeWork mainEntityOfPage;
    private MedicalContraindication contraindication;
    private String intensity;
    private String alternateName;
    private String url;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalStudy study;
    private String additionalVariable;
    private String activityFrequency;
    private String name;
    private MedicalTherapy duplicateTherapy;
    private MedicalSpecialty relevantSpecialty;
    private Number repetitions;
    private MedicalEntity seriousAdverseOutcome;
    private PhysicalActivityCategory category;
  }

  protected ExercisePlan(MedicalIndication indication, MedicalEntity adverseOutcome, Energy workload, Action potentialAction, String additionalType, MedicineSystem medicineSystem, String restPeriods, MedicalCode code, String exerciseType, String epidemiology, Duration activityDuration, Image image, MedicalGuideline guideline, String description, AnatomicalStructure associatedAnatomy, String pathophysiology, CreativeWork mainEntityOfPage, MedicalContraindication contraindication, String intensity, String alternateName, String url, String sameAs, Organization recognizingAuthority, MedicalStudy study, String additionalVariable, String activityFrequency, String name, MedicalTherapy duplicateTherapy, MedicalSpecialty relevantSpecialty, Number repetitions, MedicalEntity seriousAdverseOutcome, PhysicalActivityCategory category) {
    super(indication, adverseOutcome, mainEntityOfPage, contraindication, alternateName, potentialAction, additionalType, url, medicineSystem, sameAs, recognizingAuthority, code, study, epidemiology, image, name, relevantSpecialty, duplicateTherapy, seriousAdverseOutcome, category, guideline, description, pathophysiology, associatedAnatomy);
    myActivityDuration = activityDuration;
    myActivityFrequency = activityFrequency;
    myAdditionalVariable = additionalVariable;
    myExerciseType = exerciseType;
    myIntensity = intensity;
    myRepetitions = repetitions;
    myRestPeriods = restPeriods;
    myWorkload = workload;
  }
  private Duration myActivityDuration;
  private String myActivityFrequency;
  private String myAdditionalVariable;
  private String myExerciseType;
  private String myIntensity;
  private Number myRepetitions;
  private String myRestPeriods;
  private Energy myWorkload;
}