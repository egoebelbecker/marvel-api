/**
 * Copyright (C) 2014 Arnaud Piroelle (contact@arnaudpiroelle.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.apir.marvel.api.params.name.creator;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCreatorEventsParamName {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    CHARACTERS("characters"),
    SERIES("series"),
    COMICS("comics"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCreatorEventsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
