/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.jod;

import com.app.jod.CourierApp;
import com.dao.jod.TarifFileDao;
import java.util.List;

/**
 *
 * @author user
 */public class Paket {
    
    private String noPaket;
    private Tarif pakatTarif;

    public Paket() {
    }

    public Paket(String noPaket, Tarif pakatTarif) {
        this.noPaket = noPaket;
        this.pakatTarif = pakatTarif;
    }

    /**
     * @return the noPaket
     */
    public String getNoPaket() {
        return noPaket;
    }

    /**
     * @param noPaket the noPaket to set
     */
    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
    }

    /**
     * @return the pakatTarif
     */
    public Tarif getPakatTarif() {
        return pakatTarif;
    }

    /**
     * @param pakatTarif the pakatTarif to set
     */
    public void setPakatTarif(Tarif pakatTarif) {
        this.pakatTarif = pakatTarif;
    }
   
    
 }
