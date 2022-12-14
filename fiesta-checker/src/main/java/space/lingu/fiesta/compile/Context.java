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

package space.lingu.fiesta.compile;

import com.sun.source.util.Trees;

import javax.annotation.processing.ProcessingEnvironment;

/**
 * @author RollW
 */
public class Context {
    private final Log log;
    private final Trees trees;

    Context(ProcessingEnvironment environment, Trees trees) {
        log = new Log(environment.getMessager(), trees);
        this.trees = trees;
    }

    public static Context createContext(ProcessingEnvironment environment, Trees trees) {
        return new Context(environment, trees);
    }

    public Log getLog() {
        return log;
    }

    public Trees getTrees() {
        return trees;
    }
}
