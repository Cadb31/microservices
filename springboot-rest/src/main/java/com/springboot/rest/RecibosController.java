package com.springboot.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.CabeceraRecibo;
import com.springboot.rest.model.OpenLegacy;
import com.springboot.rest.model.Recibo;
import com.springboot.rest.model.ReciboDao;
import com.springboot.rest.model.ReciboDaoImpl;

@RestController
public class RecibosController {
 
    @RequestMapping("/cabecera")
    public List<CabeceraRecibo> getCabeceraAll() {
    	ReciboDao reciboDao = new ReciboDaoImpl();
    	List<CabeceraRecibo> cabeceraList = reciboDao.getCabeceraAll();    	
        return cabeceraList;
    }
    
    @RequestMapping("/recibos")
    public List<Recibo> getRecibosAll() {
    	ReciboDao reciboDao = new ReciboDaoImpl();
    	List<Recibo> recibosList = reciboDao.getRecibosAll();    	
        return recibosList;
    }
    
    @RequestMapping("/openLegacyJson")
    public OpenLegacy getOpenLegacyJson() {
    	ReciboDao reciboDao = new ReciboDaoImpl();
    	OpenLegacy olJson = reciboDao.getOpenLegacyJson();    	
        return olJson;
    }
}
