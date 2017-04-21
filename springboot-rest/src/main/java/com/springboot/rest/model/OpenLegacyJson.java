package com.springboot.rest.model;

import java.util.List;

public class OpenLegacyJson {

	private String focusField;
	private String pcCommand;
	private String actions;
	private String mutualista;
	private String prof;
	private int localidad;
	private String niF;
	private String tlfn;
	private String f3;
	private String f7;
	private String f10;
	private String tipo;
	private List<ReciboJson> consultas2Records;

	public OpenLegacyJson() {
		super();
	}

	public OpenLegacyJson(String focusField, String pcCommand, String actions, String mutualista, String prof,
			int localidad, String niF, String tlfn, String f3, String f7, String f10, String tipo,
			List<ReciboJson> consultas2Records) {
		super();
		this.focusField = focusField;
		this.pcCommand = pcCommand;
		this.actions = actions;
		this.mutualista = mutualista;
		this.prof = prof;
		this.localidad = localidad;
		this.niF = niF;
		this.tlfn = tlfn;
		this.f3 = f3;
		this.f7 = f7;
		this.f10 = f10;
		this.tipo = tipo;
		this.consultas2Records = consultas2Records;
	}

	public String getFocusField() {
		return focusField;
	}

	public void setFocusField(String focusField) {
		this.focusField = focusField;
	}

	public String getPcCommand() {
		return pcCommand;
	}

	public void setPcCommand(String pcCommand) {
		this.pcCommand = pcCommand;
	}

	public String getActions() {
		return actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public String getMutualista() {
		return mutualista;
	}

	public void setMutualista(String mutualista) {
		this.mutualista = mutualista;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public int getLocalidad() {
		return localidad;
	}

	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}

	public String getNiF() {
		return niF;
	}

	public void setNiF(String niF) {
		this.niF = niF;
	}

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}

	public String getF3() {
		return f3;
	}

	public void setF3(String f3) {
		this.f3 = f3;
	}

	public String getF7() {
		return f7;
	}

	public void setF7(String f7) {
		this.f7 = f7;
	}

	public String getF10() {
		return f10;
	}

	public void setF10(String f10) {
		this.f10 = f10;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<ReciboJson> getConsultas2Records() {
		return consultas2Records;
	}

	public void setConsultas2Records(List<ReciboJson> consultas2Records) {
		this.consultas2Records = consultas2Records;
	}

	@Override
	public String toString() {
		return "OpenLegacyJson [focusField=" + focusField + ", pcCommand=" + pcCommand + ", actions=" + actions
				+ ", mutualista=" + mutualista + ", prof=" + prof + ", localidad=" + localidad + ", niF=" + niF
				+ ", tlfn=" + tlfn + ", f3=" + f3 + ", f7=" + f7 + ", f10=" + f10 + ", tipo=" + tipo
				+ ", consultas2Records=" + consultas2Records + "]";
	}

}
