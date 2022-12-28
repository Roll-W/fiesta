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

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Like {@link Experimental}, this annotation
 * is to remind you that this is a preview api.
 *
 * @see Experimental
 * @author RollW
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {
        CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD,
        PACKAGE, PARAMETER, TYPE, TYPE_USE, TYPE_PARAMETER}
)
@Experimental(info = "This annotation is not stable yet.", policy = InfoPolicy.NONE)
public @interface Preview {
    String value() default "";

    InfoPolicy policy() default InfoPolicy.CALLER;
}
