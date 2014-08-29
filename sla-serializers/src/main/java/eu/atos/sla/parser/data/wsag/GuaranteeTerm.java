package eu.atos.sla.parser.data.wsag;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GuaranteeTerm")
public class GuaranteeTerm {

	@XmlAttribute(name = "Name")
	private String name;
	@XmlElement(name = "ServiceScope")
	private ServiceScope serviceScope;
	@XmlElement(name = "ServiceLevelObjective")
	private ServiceLevelObjective serviceLevelObjective;

	public GuaranteeTerm() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceScope getServiceScope() {
		return serviceScope;
	}

	public void setServiceScope(ServiceScope serviceScope) {
		this.serviceScope = serviceScope;
	}

	public ServiceLevelObjective getServiceLevelObjetive() {
		return serviceLevelObjective;
	}

	public void setServiceLevelObjetive(
			ServiceLevelObjective serviceLevelObjetive) {
		this.serviceLevelObjective = serviceLevelObjetive;
	}

}
