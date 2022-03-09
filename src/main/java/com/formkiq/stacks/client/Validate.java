/**
 * Copyright [2020] FormKiQ Inc. Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License
 * at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.formkiq.stacks.client;

/**
 * 
 * Validation Helper.
 *
 */
public final class Validate {

  /**
   * private constructor.
   */
  private Validate() {}

  /**
   * Verifies object is Not Null.
   * 
   * @param <T> Type of
   * @param object {@link Object}
   * @param message Error Message
   * @param values Object Value.
   */
  public static <T> void notNull(final T object, final String message, final Object... values) {
    if (object == null) {
      throw new NullPointerException(String.format(message, values));
    }
  }

  /**
   * Verifies object0 OR object1 is Not Null.
   * 
   * @param <T> Type of
   * @param object0 {@link Object}
   * @param object1 {@link Object}
   * @param message Error Message
   * @param values Object Value.
   */
  public static <T> void notNull(final T object0, final T object1, final String message,
      final Object... values) {
    if (object0 == null && object1 == null) {
      throw new NullPointerException(String.format(message, values));
    }
  }
}
