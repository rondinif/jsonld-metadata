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
 * Indicates that the item is new.
 */
public class NewCondition {
  /**
   * Builder for {@link NewCondition}
   */
  public static final class NewConditionThingBuilder implements Builder {
    /**
     * Creates new {@link NewCondition} instance.
     */
    public NewCondition build() {
      return new NewCondition();
    }
  }
  public interface Builder extends ThingBuilder<NewCondition> {
  
  }

  protected NewCondition() {
  }
}
