/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.jod;

import com.app.jod.CourierApp;

/**
 *
 * @author user
 */public class Paket {
    
    private String noPaket;
    private int berat;
    private Tarif pakatTarif;

    public Paket() {
    }

    public Paket(String noPaket, int berat, Tarif pakatTarif) {
        this.noPaket = noPaket;
        this.berat = berat;
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
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
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
    
    public double hitungBiaya (String namaKota, String namaPaket) {
        Tarif tarif = new Tarif();
 
        double biaya = 0;
        if (namaKota.equalsIgnoreCase(tarif.getKotaTujuan())) {
            if (namaPaket.equalsIgnoreCase("Reguler")) {
                biaya = berat * tarif.getReguler();
            } else if (namaPaket.equalsIgnoreCase("Kilat")) {
                biaya = berat * tarif.getKilat();
            } else if (namaPaket.equalsIgnoreCase("Sds")) {
                biaya = berat * tarif.getSds();
            } else if (namaPaket.equalsIgnoreCase("Ons")) {
                biaya = berat * tarif.getOns();
            }else if (namaPaket.equalsIgnoreCase("Hds")) {
                biaya = berat * tarif.getHds();
            }  else {
                System.out.println("Paket Tidak Ada");
            }
        
        } else {
            System.out.println("Tujuan Tidak Ada");
        }
        
        return biaya;
    }
   
    
    
}
