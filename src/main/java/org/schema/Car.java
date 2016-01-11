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

/**
 * A car is a wheeled, self-powered motor vehicle used for transportation.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group
 */
public class Car extends Vehicle {
  /**
   * Builder for {@link Car}
   */
  public static final class CarThingBuilder implements Builder {
    /**
     * Creates new {@link Car} instance.
     */
    public Car build() {
      return new Car(numberOfDoors, numberOfAirbags, numberOfAxles, vehicleEngine, fuelConsumption, fuelEfficiency, numberOfForwardGears, vin, cargoVolume, vehicleConfiguration, knownVehicleDamages, dateVehicleFirstRegistered, driveWheelConfiguration, fuelType, vehicleInteriorColor, vehicleInteriorType, mileageFromOdometer, vehicleModelDate, numberOfPreviousOwners, productionDate, purchaseDate, vehicleSeatingCapacity, vehicleTransmission, steeringPosition, aggregateRating, audience, award, brand, category, color, depth, gtin12, gtin13, gtin14, gtin8, height, isAccessoryOrSparePartFor, isConsumableFor, isRelatedTo, isSimilarTo, itemCondition, logo, manufacturer, model, mpn, offers, productID, releaseDate, review, sku, weight, width, additionalProperty, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The number of doors.<br />
Typical unit code(s): C62
     */
    public Builder numberOfDoors(Number number) {
      if (this.numberOfDoors == null) this.numberOfDoors = new NumberOrQuantitativeValue();
      this.numberOfDoors.setNumber(number);
      return this;
    }
    /**
     * The number of doors.<br />
Typical unit code(s): C62
     */
    public Builder numberOfDoors(QuantitativeValue quantitativeValue) {
      if (this.numberOfDoors == null) this.numberOfDoors = new NumberOrQuantitativeValue();
      this.numberOfDoors.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The number of doors.<br />
Typical unit code(s): C62
     */
    public Builder numberOfDoors(QuantitativeValue.Builder quantitativeValue) {
      return this.numberOfDoors(quantitativeValue.build());
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    public Builder numberOfAirbags(Number number) {
      if (this.numberOfAirbags == null) this.numberOfAirbags = new NumberOrString();
      this.numberOfAirbags.setNumber(number);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    public Builder numberOfAirbags(String numberOfAirbags) {
      if (this.numberOfAirbags == null) this.numberOfAirbags = new NumberOrString();
      this.numberOfAirbags.setString(numberOfAirbags);
      return this;
    }
    /**
     * The number of axles.<br />
Typical unit code(s): C62
     */
    public Builder numberOfAxles(Number number) {
      if (this.numberOfAxles == null) this.numberOfAxles = new NumberOrQuantitativeValue();
      this.numberOfAxles.setNumber(number);
      return this;
    }
    /**
     * The number of axles.<br />
Typical unit code(s): C62
     */
    public Builder numberOfAxles(QuantitativeValue quantitativeValue) {
      if (this.numberOfAxles == null) this.numberOfAxles = new NumberOrQuantitativeValue();
      this.numberOfAxles.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The number of axles.<br />
Typical unit code(s): C62
     */
    public Builder numberOfAxles(QuantitativeValue.Builder quantitativeValue) {
      return this.numberOfAxles(quantitativeValue.build());
    }
    /**
     * Information about the engine or engines of the vehicle.
     */
    public Builder vehicleEngine(EngineSpecification engineSpecification) {
      this.vehicleEngine = engineSpecification;
      return this;
    }
    /**
     * Information about the engine or engines of the vehicle.
     */
    public Builder vehicleEngine(EngineSpecification.Builder engineSpecification) {
      return this.vehicleEngine(engineSpecification.build());
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).<br />
Note 1: There are unfortunately no standard unit codes for liters per 100 km.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel consumption to another value.
     */
    public Builder fuelConsumption(QuantitativeValue quantitativeValue) {
      this.fuelConsumption = quantitativeValue;
      return this;
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).<br />
Note 1: There are unfortunately no standard unit codes for liters per 100 km.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel consumption to another value.
     */
    public Builder fuelConsumption(QuantitativeValue.Builder quantitativeValue) {
      return this.fuelConsumption(quantitativeValue.build());
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).<br />
Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel economy to another value.
     */
    public Builder fuelEfficiency(QuantitativeValue quantitativeValue) {
      this.fuelEfficiency = quantitativeValue;
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).<br />
Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel economy to another value.
     */
    public Builder fuelEfficiency(QuantitativeValue.Builder quantitativeValue) {
      return this.fuelEfficiency(quantitativeValue.build());
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.<br />
Typical unit code(s): C62
     */
    public Builder numberOfForwardGears(Number number) {
      if (this.numberOfForwardGears == null) this.numberOfForwardGears = new NumberOrQuantitativeValue();
      this.numberOfForwardGears.setNumber(number);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.<br />
Typical unit code(s): C62
     */
    public Builder numberOfForwardGears(QuantitativeValue quantitativeValue) {
      if (this.numberOfForwardGears == null) this.numberOfForwardGears = new NumberOrQuantitativeValue();
      this.numberOfForwardGears.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.<br />
Typical unit code(s): C62
     */
    public Builder numberOfForwardGears(QuantitativeValue.Builder quantitativeValue) {
      return this.numberOfForwardGears(quantitativeValue.build());
    }
    /**
     * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
     */
    public Builder vin(String vin) {
      this.vin = vin;
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.<br />
Typical unit code(s): LTR for liters, FTQ for cubic foot/feet<br />

Note: You can use <a href="minValue">minValue</a> and <a href="maxValue">maxValue</a> to indicate ranges.
     */
    public Builder cargoVolume(QuantitativeValue quantitativeValue) {
      this.cargoVolume = quantitativeValue;
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.<br />
Typical unit code(s): LTR for liters, FTQ for cubic foot/feet<br />

Note: You can use <a href="minValue">minValue</a> and <a href="maxValue">maxValue</a> to indicate ranges.
     */
    public Builder cargoVolume(QuantitativeValue.Builder quantitativeValue) {
      return this.cargoVolume(quantitativeValue.build());
    }
    /**
     * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
     */
    public Builder vehicleConfiguration(String vehicleConfiguration) {
      this.vehicleConfiguration = vehicleConfiguration;
      return this;
    }
    /**
     * A textual description of known damages, both repaired and unrepaired.
     */
    public Builder knownVehicleDamages(String knownVehicleDamages) {
      this.knownVehicleDamages = knownVehicleDamages;
      return this;
    }
    /**
     * The date of the first registration of the vehicle with the respective public authorities.
     */
    public Builder dateVehicleFirstRegistered(java.util.Date date) {
      this.dateVehicleFirstRegistered = date;
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    public Builder driveWheelConfiguration(DriveWheelConfigurationValue driveWheelConfigurationValue) {
      if (this.driveWheelConfiguration == null) this.driveWheelConfiguration = new DriveWheelConfigurationValueOrString();
      this.driveWheelConfiguration.setDriveWheelConfigurationValue(driveWheelConfigurationValue);
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    public Builder driveWheelConfiguration(DriveWheelConfigurationValue.Builder driveWheelConfigurationValue) {
      return this.driveWheelConfiguration(driveWheelConfigurationValue.build());
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    public Builder driveWheelConfiguration(String driveWheelConfiguration) {
      if (this.driveWheelConfiguration == null) this.driveWheelConfiguration = new DriveWheelConfigurationValueOrString();
      this.driveWheelConfiguration.setString(driveWheelConfiguration);
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    public Builder fuelType(QualitativeValue qualitativeValue) {
      if (this.fuelType == null) this.fuelType = new QualitativeValueOrString();
      this.fuelType.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    public Builder fuelType(QualitativeValue.Builder qualitativeValue) {
      return this.fuelType(qualitativeValue.build());
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    public Builder fuelType(String fuelType) {
      if (this.fuelType == null) this.fuelType = new QualitativeValueOrString();
      this.fuelType.setString(fuelType);
      return this;
    }
    /**
     * The color or color combination of the interior of the vehicle.
     */
    public Builder vehicleInteriorColor(String vehicleInteriorColor) {
      this.vehicleInteriorColor = vehicleInteriorColor;
      return this;
    }
    /**
     * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
     */
    public Builder vehicleInteriorType(String vehicleInteriorType) {
      this.vehicleInteriorType = vehicleInteriorType;
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.<br />
Typical unit code(s): KMT for kilometers, SMI for statute miles
     */
    public Builder mileageFromOdometer(QuantitativeValue quantitativeValue) {
      this.mileageFromOdometer = quantitativeValue;
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.<br />
Typical unit code(s): KMT for kilometers, SMI for statute miles
     */
    public Builder mileageFromOdometer(QuantitativeValue.Builder quantitativeValue) {
      return this.mileageFromOdometer(quantitativeValue.build());
    }
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     */
    public Builder vehicleModelDate(java.util.Date date) {
      this.vehicleModelDate = date;
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.<br />
Typical unit code(s): C62
     */
    public Builder numberOfPreviousOwners(Number number) {
      if (this.numberOfPreviousOwners == null) this.numberOfPreviousOwners = new NumberOrQuantitativeValue();
      this.numberOfPreviousOwners.setNumber(number);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.<br />
Typical unit code(s): C62
     */
    public Builder numberOfPreviousOwners(QuantitativeValue quantitativeValue) {
      if (this.numberOfPreviousOwners == null) this.numberOfPreviousOwners = new NumberOrQuantitativeValue();
      this.numberOfPreviousOwners.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.<br />
Typical unit code(s): C62
     */
    public Builder numberOfPreviousOwners(QuantitativeValue.Builder quantitativeValue) {
      return this.numberOfPreviousOwners(quantitativeValue.build());
    }
    /**
     * The date of production of the item, e.g. vehicle.
     */
    public Builder productionDate(java.util.Date date) {
      this.productionDate = date;
      return this;
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    public Builder purchaseDate(java.util.Date date) {
      this.purchaseDate = date;
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br />
Typical unit code(s): C62 for persons 
     */
    public Builder vehicleSeatingCapacity(Number number) {
      if (this.vehicleSeatingCapacity == null) this.vehicleSeatingCapacity = new NumberOrQuantitativeValue();
      this.vehicleSeatingCapacity.setNumber(number);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br />
Typical unit code(s): C62 for persons 
     */
    public Builder vehicleSeatingCapacity(QuantitativeValue quantitativeValue) {
      if (this.vehicleSeatingCapacity == null) this.vehicleSeatingCapacity = new NumberOrQuantitativeValue();
      this.vehicleSeatingCapacity.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br />
Typical unit code(s): C62 for persons 
     */
    public Builder vehicleSeatingCapacity(QuantitativeValue.Builder quantitativeValue) {
      return this.vehicleSeatingCapacity(quantitativeValue.build());
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
     */
    public Builder vehicleTransmission(QualitativeValue qualitativeValue) {
      if (this.vehicleTransmission == null) this.vehicleTransmission = new QualitativeValueOrString();
      this.vehicleTransmission.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
     */
    public Builder vehicleTransmission(QualitativeValue.Builder qualitativeValue) {
      return this.vehicleTransmission(qualitativeValue.build());
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
     */
    public Builder vehicleTransmission(String vehicleTransmission) {
      if (this.vehicleTransmission == null) this.vehicleTransmission = new QualitativeValueOrString();
      this.vehicleTransmission.setString(vehicleTransmission);
      return this;
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     */
    public Builder steeringPosition(SteeringPositionValue steeringPositionValue) {
      this.steeringPosition = steeringPositionValue;
      return this;
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     */
    public Builder steeringPosition(SteeringPositionValue.Builder steeringPositionValue) {
      return this.steeringPosition(steeringPositionValue.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String award) {
      this.award = award;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Brand brand) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setBrand(brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Brand.Builder brand) {
      return this.brand(brand.build());
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Organization organization) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setOrganization(organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Organization.Builder organization) {
      return this.brand(organization.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory physicalActivityCategory) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setPhysicalActivityCategory(physicalActivityCategory);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory.Builder physicalActivityCategory) {
      return this.category(physicalActivityCategory.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(String category) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setString(category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(Thing thing) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setThing(thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(Thing.Builder thing) {
      return this.category(thing.build());
    }
    /**
     * The color of the product.
     */
    public Builder color(String color) {
      this.color = color;
      return this;
    }
    /**
     * The depth of the item.
     */
    public Builder depth(Distance distance) {
      if (this.depth == null) this.depth = new DistanceOrQuantitativeValue();
      this.depth.setDistance(distance);
      return this;
    }
    /**
     * The depth of the item.
     */
    public Builder depth(Distance.Builder distance) {
      return this.depth(distance.build());
    }
    /**
     * The depth of the item.
     */
    public Builder depth(QuantitativeValue quantitativeValue) {
      if (this.depth == null) this.depth = new DistanceOrQuantitativeValue();
      this.depth.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     */
    public Builder depth(QuantitativeValue.Builder quantitativeValue) {
      return this.depth(quantitativeValue.build());
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin12(String gtin12) {
      this.gtin12 = gtin12;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin13(String gtin13) {
      this.gtin13 = gtin13;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin14(String gtin14) {
      this.gtin14 = gtin14;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin8(String gtin8) {
      this.gtin8 = gtin8;
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(Distance distance) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setDistance(distance);
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(Distance.Builder distance) {
      return this.height(distance.build());
    }
    /**
     * The height of the item.
     */
    public Builder height(QuantitativeValue quantitativeValue) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(QuantitativeValue.Builder quantitativeValue) {
      return this.height(quantitativeValue.build());
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    public Builder isAccessoryOrSparePartFor(Product product) {
      this.isAccessoryOrSparePartFor = product;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    public Builder isAccessoryOrSparePartFor(Product.Builder product) {
      return this.isAccessoryOrSparePartFor(product.build());
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    public Builder isConsumableFor(Product product) {
      this.isConsumableFor = product;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    public Builder isConsumableFor(Product.Builder product) {
      return this.isConsumableFor(product.build());
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    public Builder isRelatedTo(Product product) {
      this.isRelatedTo = product;
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    public Builder isRelatedTo(Product.Builder product) {
      return this.isRelatedTo(product.build());
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    public Builder isSimilarTo(Product product) {
      this.isSimilarTo = product;
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    public Builder isSimilarTo(Product.Builder product) {
      return this.isSimilarTo(product.build());
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    public Builder itemCondition(OfferItemCondition offerItemCondition) {
      this.itemCondition = offerItemCondition;
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    public Builder itemCondition(OfferItemCondition.Builder offerItemCondition) {
      return this.itemCondition(offerItemCondition.build());
    }
    /**
     * An associated logo.
     */
    public Builder logo(ImageObject imageObject) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(ImageObject.Builder imageObject) {
      return this.logo(imageObject.build());
    }
    /**
     * An associated logo.
     */
    public Builder logo(String logo) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setString(logo);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    public Builder manufacturer(Organization organization) {
      this.manufacturer = organization;
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    public Builder manufacturer(Organization.Builder organization) {
      return this.manufacturer(organization.build());
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    public Builder model(ProductModel productModel) {
      if (this.model == null) this.model = new ProductModelOrString();
      this.model.setProductModel(productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    public Builder model(ProductModel.Builder productModel) {
      return this.model(productModel.build());
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    public Builder model(String model) {
      if (this.model == null) this.model = new ProductModelOrString();
      this.model.setString(model);
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    public Builder mpn(String mpn) {
      this.mpn = mpn;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer.Builder offer) {
      return this.offers(offer.build());
    }
    /**
     * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
     */
    public Builder productID(String productID) {
      this.productID = productID;
      return this;
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    public Builder releaseDate(java.util.Date date) {
      this.releaseDate = date;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    public Builder weight(QuantitativeValue quantitativeValue) {
      this.weight = quantitativeValue;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    public Builder weight(QuantitativeValue.Builder quantitativeValue) {
      return this.weight(quantitativeValue.build());
    }
    /**
     * The width of the item.
     */
    public Builder width(Distance distance) {
      if (this.width == null) this.width = new DistanceOrQuantitativeValue();
      this.width.setDistance(distance);
      return this;
    }
    /**
     * The width of the item.
     */
    public Builder width(Distance.Builder distance) {
      return this.width(distance.build());
    }
    /**
     * The width of the item.
     */
    public Builder width(QuantitativeValue quantitativeValue) {
      if (this.width == null) this.width = new DistanceOrQuantitativeValue();
      this.width.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     */
    public Builder width(QuantitativeValue.Builder quantitativeValue) {
      return this.width(quantitativeValue.build());
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue.Builder propertyValue) {
      return this.additionalProperty(propertyValue.build());
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
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
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
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private NumberOrQuantitativeValue numberOfDoors;
    private NumberOrString numberOfAirbags;
    private NumberOrQuantitativeValue numberOfAxles;
    private EngineSpecification vehicleEngine;
    private QuantitativeValue fuelConsumption;
    private QuantitativeValue fuelEfficiency;
    private NumberOrQuantitativeValue numberOfForwardGears;
    private String vin;
    private QuantitativeValue cargoVolume;
    private String vehicleConfiguration;
    private String knownVehicleDamages;
    private java.util.Date dateVehicleFirstRegistered;
    private DriveWheelConfigurationValueOrString driveWheelConfiguration;
    private QualitativeValueOrString fuelType;
    private String vehicleInteriorColor;
    private String vehicleInteriorType;
    private QuantitativeValue mileageFromOdometer;
    private java.util.Date vehicleModelDate;
    private NumberOrQuantitativeValue numberOfPreviousOwners;
    private java.util.Date productionDate;
    private java.util.Date purchaseDate;
    private NumberOrQuantitativeValue vehicleSeatingCapacity;
    private QualitativeValueOrString vehicleTransmission;
    private SteeringPositionValue steeringPosition;
    private AggregateRating aggregateRating;
    private Audience audience;
    private String award;
    private BrandOrOrganization brand;
    private PhysicalActivityCategoryOrStringOrThing category;
    private String color;
    private DistanceOrQuantitativeValue depth;
    private String gtin12;
    private String gtin13;
    private String gtin14;
    private String gtin8;
    private DistanceOrQuantitativeValue height;
    private Product isAccessoryOrSparePartFor;
    private Product isConsumableFor;
    private Product isRelatedTo;
    private Product isSimilarTo;
    private OfferItemCondition itemCondition;
    private ImageObjectOrString logo;
    private Organization manufacturer;
    private ProductModelOrString model;
    private String mpn;
    private Offer offers;
    private String productID;
    private java.util.Date releaseDate;
    private Review review;
    private String sku;
    private QuantitativeValue weight;
    private DistanceOrQuantitativeValue width;
    private PropertyValue additionalProperty;
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
  public interface Builder extends ThingBuilder<Car> {
  Builder numberOfDoors(Number number);
  Builder numberOfDoors(QuantitativeValue quantitativeValue);
  Builder numberOfDoors(QuantitativeValue.Builder quantitativeValue);
  Builder numberOfAirbags(Number number);
  Builder numberOfAirbags(String numberOfAirbags);
  Builder numberOfAxles(Number number);
  Builder numberOfAxles(QuantitativeValue quantitativeValue);
  Builder numberOfAxles(QuantitativeValue.Builder quantitativeValue);
  Builder vehicleEngine(EngineSpecification engineSpecification);
  Builder vehicleEngine(EngineSpecification.Builder engineSpecification);
  Builder fuelConsumption(QuantitativeValue quantitativeValue);
  Builder fuelConsumption(QuantitativeValue.Builder quantitativeValue);
  Builder fuelEfficiency(QuantitativeValue quantitativeValue);
  Builder fuelEfficiency(QuantitativeValue.Builder quantitativeValue);
  Builder numberOfForwardGears(Number number);
  Builder numberOfForwardGears(QuantitativeValue quantitativeValue);
  Builder numberOfForwardGears(QuantitativeValue.Builder quantitativeValue);
  Builder vin(String vin);
  Builder cargoVolume(QuantitativeValue quantitativeValue);
  Builder cargoVolume(QuantitativeValue.Builder quantitativeValue);
  Builder vehicleConfiguration(String vehicleConfiguration);
  Builder knownVehicleDamages(String knownVehicleDamages);
  Builder dateVehicleFirstRegistered(java.util.Date date);
  Builder driveWheelConfiguration(DriveWheelConfigurationValue driveWheelConfigurationValue);
  Builder driveWheelConfiguration(DriveWheelConfigurationValue.Builder driveWheelConfigurationValue);
  Builder driveWheelConfiguration(String driveWheelConfiguration);
  Builder fuelType(QualitativeValue qualitativeValue);
  Builder fuelType(QualitativeValue.Builder qualitativeValue);
  Builder fuelType(String fuelType);
  Builder vehicleInteriorColor(String vehicleInteriorColor);
  Builder vehicleInteriorType(String vehicleInteriorType);
  Builder mileageFromOdometer(QuantitativeValue quantitativeValue);
  Builder mileageFromOdometer(QuantitativeValue.Builder quantitativeValue);
  Builder vehicleModelDate(java.util.Date date);
  Builder numberOfPreviousOwners(Number number);
  Builder numberOfPreviousOwners(QuantitativeValue quantitativeValue);
  Builder numberOfPreviousOwners(QuantitativeValue.Builder quantitativeValue);
  Builder productionDate(java.util.Date date);
  Builder purchaseDate(java.util.Date date);
  Builder vehicleSeatingCapacity(Number number);
  Builder vehicleSeatingCapacity(QuantitativeValue quantitativeValue);
  Builder vehicleSeatingCapacity(QuantitativeValue.Builder quantitativeValue);
  Builder vehicleTransmission(QualitativeValue qualitativeValue);
  Builder vehicleTransmission(QualitativeValue.Builder qualitativeValue);
  Builder vehicleTransmission(String vehicleTransmission);
  Builder steeringPosition(SteeringPositionValue steeringPositionValue);
  Builder steeringPosition(SteeringPositionValue.Builder steeringPositionValue);
  Builder aggregateRating(AggregateRating aggregateRating);
  Builder aggregateRating(AggregateRating.Builder aggregateRating);
  Builder audience(Audience audience);
  Builder audience(Audience.Builder audience);
  Builder award(String award);
  Builder brand(Brand brand);
  Builder brand(Brand.Builder brand);
  Builder brand(Organization organization);
  Builder brand(Organization.Builder organization);
  Builder category(PhysicalActivityCategory physicalActivityCategory);
  Builder category(PhysicalActivityCategory.Builder physicalActivityCategory);
  Builder category(String category);
  Builder category(Thing thing);
  Builder category(Thing.Builder thing);
  Builder color(String color);
  Builder depth(Distance distance);
  Builder depth(Distance.Builder distance);
  Builder depth(QuantitativeValue quantitativeValue);
  Builder depth(QuantitativeValue.Builder quantitativeValue);
  Builder gtin12(String gtin12);
  Builder gtin13(String gtin13);
  Builder gtin14(String gtin14);
  Builder gtin8(String gtin8);
  Builder height(Distance distance);
  Builder height(Distance.Builder distance);
  Builder height(QuantitativeValue quantitativeValue);
  Builder height(QuantitativeValue.Builder quantitativeValue);
  Builder isAccessoryOrSparePartFor(Product product);
  Builder isAccessoryOrSparePartFor(Product.Builder product);
  Builder isConsumableFor(Product product);
  Builder isConsumableFor(Product.Builder product);
  Builder isRelatedTo(Product product);
  Builder isRelatedTo(Product.Builder product);
  Builder isSimilarTo(Product product);
  Builder isSimilarTo(Product.Builder product);
  Builder itemCondition(OfferItemCondition offerItemCondition);
  Builder itemCondition(OfferItemCondition.Builder offerItemCondition);
  Builder logo(ImageObject imageObject);
  Builder logo(ImageObject.Builder imageObject);
  Builder logo(String logo);
  Builder manufacturer(Organization organization);
  Builder manufacturer(Organization.Builder organization);
  Builder model(ProductModel productModel);
  Builder model(ProductModel.Builder productModel);
  Builder model(String model);
  Builder mpn(String mpn);
  Builder offers(Offer offer);
  Builder offers(Offer.Builder offer);
  Builder productID(String productID);
  Builder releaseDate(java.util.Date date);
  Builder review(Review review);
  Builder review(Review.Builder review);
  Builder sku(String sku);
  Builder weight(QuantitativeValue quantitativeValue);
  Builder weight(QuantitativeValue.Builder quantitativeValue);
  Builder width(Distance distance);
  Builder width(Distance.Builder distance);
  Builder width(QuantitativeValue quantitativeValue);
  Builder width(QuantitativeValue.Builder quantitativeValue);
  Builder additionalProperty(PropertyValue propertyValue);
  Builder additionalProperty(PropertyValue.Builder propertyValue);
  Builder additionalType(String additionalType);
  Builder alternateName(String alternateName);
  Builder description(String description);
  Builder mainEntityOfPage(CreativeWork creativeWork);
  Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
  Builder mainEntityOfPage(String mainEntityOfPage);
  Builder name(String name);
  Builder sameAs(String sameAs);
  Builder url(String url);
  Builder potentialAction(Action action);
  Builder potentialAction(Action.Builder action);
  Builder id(String id);
  }

  protected Car(NumberOrQuantitativeValue numberOfDoors, NumberOrString numberOfAirbags, NumberOrQuantitativeValue numberOfAxles, EngineSpecification vehicleEngine, QuantitativeValue fuelConsumption, QuantitativeValue fuelEfficiency, NumberOrQuantitativeValue numberOfForwardGears, String vin, QuantitativeValue cargoVolume, String vehicleConfiguration, String knownVehicleDamages, java.util.Date dateVehicleFirstRegistered, DriveWheelConfigurationValueOrString driveWheelConfiguration, QualitativeValueOrString fuelType, String vehicleInteriorColor, String vehicleInteriorType, QuantitativeValue mileageFromOdometer, java.util.Date vehicleModelDate, NumberOrQuantitativeValue numberOfPreviousOwners, java.util.Date productionDate, java.util.Date purchaseDate, NumberOrQuantitativeValue vehicleSeatingCapacity, QualitativeValueOrString vehicleTransmission, SteeringPositionValue steeringPosition, AggregateRating aggregateRating, Audience audience, String award, BrandOrOrganization brand, PhysicalActivityCategoryOrStringOrThing category, String color, DistanceOrQuantitativeValue depth, String gtin12, String gtin13, String gtin14, String gtin8, DistanceOrQuantitativeValue height, Product isAccessoryOrSparePartFor, Product isConsumableFor, Product isRelatedTo, Product isSimilarTo, OfferItemCondition itemCondition, ImageObjectOrString logo, Organization manufacturer, ProductModelOrString model, String mpn, Offer offers, String productID, java.util.Date releaseDate, Review review, String sku, QuantitativeValue weight, DistanceOrQuantitativeValue width, PropertyValue additionalProperty, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(numberOfDoors, numberOfAirbags, numberOfAxles, vehicleEngine, fuelConsumption, fuelEfficiency, numberOfForwardGears, vin, cargoVolume, vehicleConfiguration, knownVehicleDamages, dateVehicleFirstRegistered, driveWheelConfiguration, fuelType, vehicleInteriorColor, vehicleInteriorType, mileageFromOdometer, vehicleModelDate, numberOfPreviousOwners, productionDate, purchaseDate, vehicleSeatingCapacity, vehicleTransmission, steeringPosition, aggregateRating, audience, award, brand, category, color, depth, gtin12, gtin13, gtin14, gtin8, height, isAccessoryOrSparePartFor, isConsumableFor, isRelatedTo, isSimilarTo, itemCondition, logo, manufacturer, model, mpn, offers, productID, releaseDate, review, sku, weight, width, additionalProperty, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
  }
}
