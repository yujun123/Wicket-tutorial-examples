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
package org.wicketTutorial.callbackurl;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.wicketTutorial.callbackurl.behaviors.OnChangeSingleChoiceBehavior;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.wicketTutorial.commons.bootstrap.layout.BootstrapBasePage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class HomePage extends BootstrapBasePage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
		
		List colors = Arrays.asList(new String[] { "Red", "Blue", "Green", "Yellow"});
		IModel radioModel = Model.of();
		IModel selectModel = Model.of();
		
		add(new RadioChoice("choices", radioModel, colors)
		 		 .add(new OnChangeSingleChoiceBehavior()));
		 
		add(new DropDownChoice("drpDwnChoices", selectModel, colors)
		 		 .add(new OnChangeSingleChoiceBehavior()));	
		
		add(new Label("radioModel", radioModel));
		add(new Label("selectModel", selectModel));
    }
}
