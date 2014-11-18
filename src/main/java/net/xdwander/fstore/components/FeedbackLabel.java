/*
 *  Copyright 2008 Daan, StuQ.nl
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package net.xdwander.fstore.components;

import java.io.Serializable;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;


@SuppressWarnings("rawtypes")
public class FeedbackLabel extends Label {

	private static final long serialVersionUID = 1L;
	private FormComponent component;
    private IModel text = null;

    public FeedbackLabel(String id, FormComponent component) {
        super(id);
        this.component = component;
    }

    public FeedbackLabel(String id, FormComponent component, String text) {
        this(id, component, new Model<String>(text));
    }

    public FeedbackLabel(String id, FormComponent component, IModel iModel) {
        super(id);
        this.component = component;
        this.text=iModel;
    }


    @Override
    protected void onBeforeRender() {
        super.onBeforeRender();
        this.setDefaultModel(null);
        if(component.getFeedbackMessage() !=null ){
            if(this.text!=null){
                this.setDefaultModel(text);
            } else {
                this.setDefaultModel(new Model<Serializable>(component.getFeedbackMessage().getMessage()));
            }

            this.add(new AttributeModifier("class", new Model<String>("feedbacklabel " + component.getFeedbackMessage().getLevelAsString())));
        } else {
            this.setDefaultModel(null);
        }
    }
}
