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
package com.arnaudpiroelle.marvel.api;

import com.arnaudpiroelle.marvel.api.services.CharactersService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Piroelle on 04/03/14.
 */
public class MarvelApiBuilderTest {
    @Before
    public void setUp() throws Exception {
        MarvelApiBuilder.initMarvelApiBuilder("", "");
    }

    @Test
    public void testApiGetService() throws Exception {
        CharactersService charactersService = MarvelApiBuilder.getService(CharactersService.class);
        Assert.assertNotNull(charactersService);
    }
}