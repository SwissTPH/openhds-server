package org.openhds.domain.model.wrappers;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.openhds.domain.model.Visit;

@XmlRootElement(name="visits")
public class Visits implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2734798986104165931L;
	private List<Visit> visits;

    @XmlElement(name = "visit")
    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}
