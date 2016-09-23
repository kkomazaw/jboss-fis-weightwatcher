package com.mycompany.fxtest;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InsertElement {
	
	private boolean returnObjet=false;
	
	Prices prices;

	@XmlAttribute(name="return-object")
	public boolean isReturnObjet() {
		return returnObjet;
	}

	public void setReturnObjet(boolean returnObjet) {
		this.returnObjet = returnObjet;
	}

	@XmlElement(name="com.mycompany.fxtest.Prices")
	public Prices getPrices() {
		return prices;
	}

	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	
	
}
