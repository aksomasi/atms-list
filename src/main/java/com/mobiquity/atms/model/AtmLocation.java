package com.mobiquity.atms.model;

public class AtmLocation {

	private String city ;
	private String postalcode;
	private String street;
	private String functionality;

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

	public AtmLocation(String city, String postalcode, String street, String functionality) {
		super();
		this.city = city;
		this.postalcode = postalcode;
		this.street = street;
		this.functionality = functionality;
	}
	
	
	
	
}
