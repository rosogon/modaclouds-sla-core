/**
 * Copyright 2015 Atos
 * Contact: Atos <roman.sosa@atos.net>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package eu.atos.sla.parser.data.wsag;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * A POJO Object that stores all the information from a Template
 * 
 * @author Pedro Rey - Atos
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Template")
public class Template {

	@XmlAttribute(name = "TemplateId")
	private String templateId;
	@XmlElement(name = "Name")
	private String Name;
	@XmlElement(name = "Context")
	private Context context;
	@XmlElement(name = "Terms")
	private Terms Terms;

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public Terms getTerms() {
		return Terms;
	}

	public void setTerms(Terms terms) {
		Terms = terms;
	}

	@Override
	public String toString() {

		return "Template[id='" + templateId + "']";
	}	
}