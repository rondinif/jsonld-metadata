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
class AnatomicalStructureOrAnatomicalSystem {
  @JsonValue
  public Object getJsonLdValue() {
    if (myAnatomicalStructure != null) return myAnatomicalStructure;
    if (myAnatomicalSystem != null) return myAnatomicalSystem;
    return null;
  }
  public Thing getThing() {
    if (myAnatomicalStructure != null) return myAnatomicalStructure;
    if (myAnatomicalSystem != null) return myAnatomicalSystem;
    return null;
  }
  public void setAnatomicalStructure(AnatomicalStructure anatomicalStructure) { clear(); myAnatomicalStructure = anatomicalStructure; }
  public AnatomicalStructure getAnatomicalStructure() { return myAnatomicalStructure; }
  private AnatomicalStructure myAnatomicalStructure;
  public void setAnatomicalSystem(AnatomicalSystem anatomicalSystem) { clear(); myAnatomicalSystem = anatomicalSystem; }
  public AnatomicalSystem getAnatomicalSystem() { return myAnatomicalSystem; }
  private AnatomicalSystem myAnatomicalSystem;
  private void clear() {
    myAnatomicalStructure = null;
    myAnatomicalSystem = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAnatomicalStructure != null ? myAnatomicalStructure.hashCode() : 0);
    result = 31 * result + (myAnatomicalSystem != null ? myAnatomicalSystem.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnatomicalStructureOrAnatomicalSystem anatomicalStructureOrAnatomicalSystem = (AnatomicalStructureOrAnatomicalSystem) o;
    if (myAnatomicalStructure != null ? !myAnatomicalStructure.equals(anatomicalStructureOrAnatomicalSystem.myAnatomicalStructure) : anatomicalStructureOrAnatomicalSystem.myAnatomicalStructure != null) return false;
    if (myAnatomicalSystem != null ? !myAnatomicalSystem.equals(anatomicalStructureOrAnatomicalSystem.myAnatomicalSystem) : anatomicalStructureOrAnatomicalSystem.myAnatomicalSystem != null) return false;
    return true;
  }

}
