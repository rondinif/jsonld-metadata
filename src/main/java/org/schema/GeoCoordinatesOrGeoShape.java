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

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class GeoCoordinatesOrGeoShape {
  void setGeoCoordinates(GeoCoordinates geoCoordinates) { clear(); myGeoCoordinates = geoCoordinates; }
  public GeoCoordinates getGeoCoordinates() { return myGeoCoordinates; }
  void setGeoShape(GeoShape geoShape) { clear(); myGeoShape = geoShape; }
  public GeoShape getGeoShape() { return myGeoShape; }
  @com.fasterxml.jackson.annotation.JsonValue public Object getJsonLdValue() {
    if (myGeoCoordinates != null) return myGeoCoordinates;
    if (myGeoShape != null) return myGeoShape;
    return null;
  }
  public Thing getThing() {
    if (myGeoCoordinates != null) return myGeoCoordinates;
    if (myGeoShape != null) return myGeoShape;
    return null;
  }
  public void clear() {
    myGeoCoordinates = null;
    myGeoShape = null;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myGeoCoordinates != null ? myGeoCoordinates.hashCode() : 0);
    result = 31 * result + (myGeoShape != null ? myGeoShape.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GeoCoordinatesOrGeoShape geoCoordinatesOrGeoShape = (GeoCoordinatesOrGeoShape) o;
    if (myGeoCoordinates != null ? !myGeoCoordinates.equals(geoCoordinatesOrGeoShape.myGeoCoordinates) : geoCoordinatesOrGeoShape.myGeoCoordinates != null) return false;
    if (myGeoShape != null ? !myGeoShape.equals(geoCoordinatesOrGeoShape.myGeoShape) : geoCoordinatesOrGeoShape.myGeoShape != null) return false;
    return true;
  }
  private GeoCoordinates myGeoCoordinates;
  private GeoShape myGeoShape;
}
