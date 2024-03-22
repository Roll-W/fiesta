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

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * An annotation to remind you of the thing to do.
 *
 * @author RollW
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(value = {
        CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD,
        PACKAGE, PARAMETER, TYPE, TYPE_USE, TYPE_PARAMETER
})
@Repeatable(Todos.class)
public @interface Todo {
    /**
     * The message of the thing to do.
     */
    String value();

    /**
     * @deprecated Replace with {@link #value()}
     */
    @java.lang.Deprecated
    @Deprecated(value = "")
    String todo() default "";

    /**
     * Returns the version in which the annotated element was added.
     * The version string is in the same format and namespace as the value of
     * the {@code @since} javadoc tag.
     * <p>
     * The default value is the empty string.
     *
     * @return the version string
     */
    String since() default "";

    /**
     * The log level of the annotation.
     *
     * @return the level.
     * @see Level
     */
    Level level() default Level.NOTE;

    /**
     * Policy for the information of this annotation at compile time.
     *
     * @return the policy.
     * @see InfoPolicy
     */
    InfoPolicy policy() default InfoPolicy.SELF;
}
