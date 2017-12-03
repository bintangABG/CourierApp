/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.jod;

/**
 *
 * @author user
 */
public class Tarif {
    
    private String kotaTujuan;
    private double reguler;
    private double kilat;
    private double sds;
    private double ons;
    private double hds;
    private int berat ;
    private double hargaBarang;

    public Tarif() {
    }

    public Tarif(String kotaTujuan, double reguler, double kilat, double sds, double ons, double hds, int berat, double hargaBarang) {
        this.kotaTujuan = kotaTujuan;
        this.reguler = reguler;
        this.kilat = kilat;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
        this.berat = berat;
        this.hargaBarang = hargaBarang;
    }

     

    
    /**
     * @return the hargaBarang
     */
    

    /**
     * @param hargaBarang the hargaBarang to set
     */
    

    /**
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
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
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the kilat
     */
    public double getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(double kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    @Override
    public String toString() {
        return this.kotaTujuan;
    }
    Paket p = new Paket();
    public double hitungBiayaReguler() {
        return this.reguler = this.berat * this.reguler;
    }
    public double hitungBiayaKilat () {
        return this.kilat = this.berat *this.kilat;
    }
    public double hitungBiayaSDS () {
        return this.sds = this.berat * this.sds;
    }
    public double hitungBiayaONS () {
        return this.ons = this.berat*this.ons;
                 
    }
    public double hitungBiayaHDS () {
        return this.hds = this.berat * this.hds;
    }
    public double hitungBiayaRegulerWintAsuransi () {
        return this.reguler = (this.berat * this.reguler) + (this.hargaBarang * 0.03); 
    }
    public double hitungBiayaKilatWithAsuransi () {
        return this.kilat = (this.berat *this.kilat) + (this.hargaBarang * 0.03);
    }
    public double hitungBiayaSDSWithAsuransi () {
        return this.sds = (this.berat * this.sds) + (this.hargaBarang * 0.03);
    }
    public double hitungBiayaONSWithAsuransi () {
        return this.ons = (this.berat*this.ons) + (this.hargaBarang * 0.03);
                 
    }
    public double hitungBiayaHDSWithAsuransi () {
        return this.hds = (this.berat * this.hds) + (this.hargaBarang * 0.03);
    }
    
    
}
