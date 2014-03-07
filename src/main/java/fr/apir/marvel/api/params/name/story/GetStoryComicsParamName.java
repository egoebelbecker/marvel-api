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
package fr.apir.marvel.api.params.name.story;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetStoryComicsParamName {
    FORMAT("format"),
    FORMAT_TYPE("formatType"),
    NO_VARIANTS("noVariants"),
    DATE_DESCRIPTOR("dateDescriptor"),
    DATE_RANGE("dateRange"),
    HAS_DIGITAL_ISSUE("hasDigitalIssue"),
    MODIFIED_SINCE("modifiedSince"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    SERIES("series"),
    EVENTS("events"),
    SHARED_APPEARANCES("sharedAppearances"),
    COLLABORATORS("collaborators"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetStoryComicsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
