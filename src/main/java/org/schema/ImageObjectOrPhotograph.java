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

@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
class ImageObjectOrPhotograph {
  @com.fasterxml.jackson.annotation.JsonValue
  public Object getJsonLdValue() {
    if (myImageObject != null) return myImageObject;
    if (myPhotograph != null) return myPhotograph;
    return null;
  }
  public Thing getThing() {
    if (myImageObject != null) return myImageObject;
    if (myPhotograph != null) return myPhotograph;
    return null;
  }
  public void setImageObject(ImageObject imageObject) { clear(); myImageObject = imageObject; }
  public ImageObject getImageObject() { return myImageObject; }
  private ImageObject myImageObject;
  public void setPhotograph(Photograph photograph) { clear(); myPhotograph = photograph; }
  public Photograph getPhotograph() { return myPhotograph; }
  private Photograph myPhotograph;
  private void clear() {
    myImageObject = null;
    myPhotograph = null;
  }
}
