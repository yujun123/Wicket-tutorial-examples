/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wicketTutorial.listview;

import java.util.Arrays;
import java.util.List;

import org.wicketTutorial.commons.bootstrap.layout.BootstrapBasePage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends BootstrapBasePage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
		List<Person> persons = Arrays.asList(new Person("John", "Smith"), new Person("Dan", "Wang"));
		
		add(new ListView<Person>("persons", persons) {
			@Override
			protected void populateItem(ListItem<Person> item) {
				item.add(new Label("fullName", new PropertyModel(item.getModel(), "fullName")));								
			}			
		});
    }
}
