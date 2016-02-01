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
public class BrandOrOrganization {
  void setBrand(Brand brand) { clear(); myBrand = brand; }
  public Brand getBrand() { return myBrand; }
  void setOrganization(Organization organization) { clear(); myOrganization = organization; }
  public Organization getOrganization() { return myOrganization; }
  @com.fasterxml.jackson.annotation.JsonValue public Object getJsonLdValue() {
    if (myBrand != null) return myBrand;
    if (myOrganization != null) return myOrganization;
    return null;
  }
  public Thing getThing() {
    if (myBrand != null) return myBrand;
    if (myOrganization != null) return myOrganization;
    return null;
  }
  public void clear() {
    myBrand = null;
    myOrganization = null;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myBrand != null ? myBrand.hashCode() : 0);
    result = 31 * result + (myOrganization != null ? myOrganization.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BrandOrOrganization brandOrOrganization = (BrandOrOrganization) o;
    if (myBrand != null ? !myBrand.equals(brandOrOrganization.myBrand) : brandOrOrganization.myBrand != null) return false;
    if (myOrganization != null ? !myOrganization.equals(brandOrOrganization.myOrganization) : brandOrOrganization.myOrganization != null) return false;
    return true;
  }
  private Brand myBrand;
  private Organization myOrganization;
}
