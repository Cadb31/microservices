package com.springboot.rest.model;

import java.util.ArrayList;
import java.util.List;

public class ReciboDaoImpl implements ReciboDao {

	@Override
	public List<Recibo> getRecibosAll() {
		List<Recibo> recibosList = new ArrayList<Recibo>();
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		recibosList.add(new Recibo("333.333.333", "120,20", "B", "1-08-2016", "1-01-2017", "Cobrado 99", "2-08-2017"));
		
		
		return recibosList;
	}

	@Override
	public List<CabeceraRecibo> getCabeceraAll() {
		List<CabeceraRecibo> cabeceraList = new ArrayList<CabeceraRecibo>();
		
		cabeceraList.add(new CabeceraRecibo("Ramo:", "30 Automovil"));		
		cabeceraList.add(new CabeceraRecibo("Mutualista:", "3.413.148 ESPEJO SERRANO, JESUS"));		
		cabeceraList.add(new CabeceraRecibo("O.Asegurado:", "C3980BTH-YAMAHA Neo's 50 YN IRC Snow"));
		cabeceraList.add(new CabeceraRecibo("Modalidad:", "M.B. CICLOMOTOR"));		
		cabeceraList.add(new CabeceraRecibo("Dir. Pago:", "SANTANDER CENTRAL HISPANO S.A."));
		cabeceraList.add(new CabeceraRecibo("N. Poliza:", "301.223.915"));
		cabeceraList.add(new CabeceraRecibo("NIF:", "00271796M"));		
		cabeceraList.add(new CabeceraRecibo("Fec. Efecto:", "6-08-2016"));		
		cabeceraList.add(new CabeceraRecibo("Franquicia:", "0"));
		cabeceraList.add(new CabeceraRecibo("Vencimiento:", "5-08-2017"));
		cabeceraList.add(new CabeceraRecibo("CCC:", "0049 6109 09 2293031231"));
		
		return cabeceraList;
	}

	@Override
	public OpenLegacy getOpenLegacyJson() {
		
		OpenLegacyJson olJson = new OpenLegacyJson();

		olJson.setFocusField("");
		olJson.setPcCommand("");
		olJson.setActions("");
		olJson.setMutualista("1.119.171");
		olJson.setProf("M?dico/a");
		olJson.setLocalidad(28223);
		olJson.setNiF("00279801Y");
		olJson.setTlfn("915.188.735");
		olJson.setF3("Fin");
		olJson.setF7("Alta/Baja 41");
		olJson.setF10("Nueva P?liza");
		olJson.setTipo("Lic. Sanitar.");

		List<ReciboJson> recibos = new ArrayList<>();
		recibos.add(new ReciboJson("", "", "11", "9-03-2011", "9-03-2011", "P", "TRAMONTANA 2. 4?D", "110.040.254", "A", ""));
		recibos.add(new ReciboJson("", "", "30", "5-08-2007", "6-08-2006", "03", "M 5114FL-YAMAHA 250-SR", "300.335.033", "A", "40"));
		recibos.add(new ReciboJson("", "", "52", "27-01-2013", "27-01-2013", "6M", "--  EL  MUTUALISTA   --", "520.003.370", "A", ""));

		olJson.setConsultas2Records(recibos);
		
		OpenLegacy openLegacy = new OpenLegacy(olJson);
		
		return openLegacy;
	}
}
