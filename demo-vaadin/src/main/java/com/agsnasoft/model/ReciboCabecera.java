package com.agsnasoft.model;

import java.util.List;

public class ReciboCabecera {

	private List<CabeceraRecibo> cabeceraList;

	private List<Recibo> recibos;

	public ReciboCabecera() {
		super();
	}

	public ReciboCabecera(List<CabeceraRecibo> cabeceraList, List<Recibo> recibos) {
		super();
		this.cabeceraList = cabeceraList;
		this.recibos = recibos;
	}

	public List<CabeceraRecibo> getCabeceraList() {
		return cabeceraList;
	}

	public void setCabeceraList(List<CabeceraRecibo> cabeceraList) {
		this.cabeceraList = cabeceraList;
	}

	public List<Recibo> getRecibos() {
		return recibos;
	}

	public void setRecibos(List<Recibo> recibos) {
		this.recibos = recibos;
	}

}
