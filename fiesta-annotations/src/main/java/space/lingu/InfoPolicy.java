/*
 * Copyright (C) 2022 Lingu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package space.lingu;

/**
 * Compile output info policy.
 *
 * @author RollW
 */
public enum InfoPolicy {
    /**
     * With no output.
     */
    NONE,

    /**
     * The Caller will produce a message.
     */
    CALLER,

    /**
     * Annotated will produce a message.
     */
    SELF,

    /**
     * With {@link #CALLER} and {@link #SELF} effects.
     */
    ALL;

    public boolean shouldOutput(InfoPolicy policy) {
        if (this == NONE) {
            return false;
        }
        return this == ALL || this == policy;
    }
}
