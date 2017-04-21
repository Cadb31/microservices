package com.springboot.rest.model;

public class OpenLegacy {

	private OpenLegacyJson consultas2;

	public OpenLegacy() {
		super();
	}

	public OpenLegacy(OpenLegacyJson consultas2) {
		super();
		this.consultas2 = consultas2;
	}

	public OpenLegacyJson getConsultas2() {
		return consultas2;
	}

	public void setConsultas2(OpenLegacyJson consultas2) {
		this.consultas2 = consultas2;
	}

	@Override
	public String toString() {
		return "OpenLegacy [consultas2=" + consultas2 + "]";
	}

}
