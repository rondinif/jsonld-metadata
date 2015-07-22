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

@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
class MedicalDevicePurposeOrThing {
  @com.fasterxml.jackson.annotation.JsonValue
  public Object getJsonLdValue() {
    if (myMedicalDevicePurpose != null) return myMedicalDevicePurpose;
    if (myThing != null) return myThing;
    return null;
  }
  public void setMedicalDevicePurpose(MedicalDevicePurpose medicalDevicePurpose) { clear(); myMedicalDevicePurpose = medicalDevicePurpose; }
  public MedicalDevicePurpose getMedicalDevicePurpose() { return myMedicalDevicePurpose; }
  private MedicalDevicePurpose myMedicalDevicePurpose;
  public void setThing(Thing thing) { clear(); myThing = thing; }
  public Thing getThing() { return myThing; }
  private Thing myThing;
  private void clear() {
    myMedicalDevicePurpose = null;
    myThing = null;
  }
}