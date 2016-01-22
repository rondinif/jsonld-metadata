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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class IntegerOrQuantitativeValue {
  @JsonValue
  public Object getJsonLdValue() {
    if (myInteger != null) return myInteger;
    if (myQuantitativeValue != null) return myQuantitativeValue;
    return null;
  }
  public Thing getThing() {
    if (myQuantitativeValue != null) return myQuantitativeValue;
    return null;
  }
  void setInteger(Integer integer) { clear(); myInteger = integer; }
  public Integer getInteger() { return myInteger; }
  private Integer myInteger;
  void setQuantitativeValue(QuantitativeValue quantitativeValue) { clear(); myQuantitativeValue = quantitativeValue; }
  public QuantitativeValue getQuantitativeValue() { return myQuantitativeValue; }
  private QuantitativeValue myQuantitativeValue;
  private void clear() {
    myInteger = null;
    myQuantitativeValue = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myInteger != null ? myInteger.hashCode() : 0);
    result = 31 * result + (myQuantitativeValue != null ? myQuantitativeValue.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IntegerOrQuantitativeValue integerOrQuantitativeValue = (IntegerOrQuantitativeValue) o;
    if (myInteger != null ? !myInteger.equals(integerOrQuantitativeValue.myInteger) : integerOrQuantitativeValue.myInteger != null) return false;
    if (myQuantitativeValue != null ? !myQuantitativeValue.equals(integerOrQuantitativeValue.myQuantitativeValue) : integerOrQuantitativeValue.myQuantitativeValue != null) return false;
    return true;
  }

}