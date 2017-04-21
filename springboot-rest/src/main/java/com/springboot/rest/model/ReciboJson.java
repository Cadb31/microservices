package com.springboot.rest.model;

public class ReciboJson {

	private String focus;
	private String selection;
	private String ra;
	private String fecVcto;
	private String fecEfecto;
	private String mo;
	private String objetoAsegurado;
	private String numPoliza;
	private String t;
	private String bn;

	public ReciboJson() {
		super();
	}

	public ReciboJson(String focus, String selection, String ra, String fecVcto, String fecEfecto, String mo,
			String objetoAsegurado, String numPoliza, String t, String bn) {
		super();
		this.focus = focus;
		this.selection = selection;
		this.ra = ra;
		this.fecVcto = fecVcto;
		this.fecEfecto = fecEfecto;
		this.mo = mo;
		this.objetoAsegurado = objetoAsegurado;
		this.numPoliza = numPoliza;
		this.t = t;
		this.bn = bn;
	}

	public String getFocus() {
		return focus;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getFecVcto() {
		return fecVcto;
	}

	public void setFecVcto(String fecVcto) {
		this.fecVcto = fecVcto;
	}

	public String getFecEfecto() {
		return fecEfecto;
	}

	public void setFecEfecto(String fecEfecto) {
		this.fecEfecto = fecEfecto;
	}

	public String getMo() {
		return mo;
	}

	public void setMo(String mo) {
		this.mo = mo;
	}

	public String getObjetoAsegurado() {
		return objetoAsegurado;
	}

	public void setObjetoAsegurado(String objetoAsegurado) {
		this.objetoAsegurado = objetoAsegurado;
	}

	public String getNumPoliza() {
		return numPoliza;
	}

	public void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getBn() {
		return bn;
	}

	public void setBn(String bn) {
		this.bn = bn;
	}

	@Override
	public String toString() {
		return "ReciboJson [focus=" + focus + ", selection=" + selection + ", ra=" + ra + ", fecVcto=" + fecVcto
				+ ", fecEfecto=" + fecEfecto + ", mo=" + mo + ", objetoAsegurado=" + objetoAsegurado + ", numPoliza="
				+ numPoliza + ", t=" + t + ", bn=" + bn + "]";
	}

}
