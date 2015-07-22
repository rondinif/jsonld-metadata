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
 * Generated on Jul 22, 2015.
 */

package org.schema;

class PlaceOrPostalAddressOrString {
  public Thing getThing() {
    if (myPlace != null) return myPlace;
    if (myPostalAddress != null) return myPostalAddress;
    return null;
  }
  public void setPlace(Place place) { clear(); myPlace = place; }
  public Place getPlace() { return myPlace; }
  private Place myPlace;
  public void setPostalAddress(PostalAddress postalAddress) { clear(); myPostalAddress = postalAddress; }
  public PostalAddress getPostalAddress() { return myPostalAddress; }
  private PostalAddress myPostalAddress;
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private String myString;
  private void clear() {
    myPlace = null;
    myPostalAddress = null;
    myString = null;
  }
}