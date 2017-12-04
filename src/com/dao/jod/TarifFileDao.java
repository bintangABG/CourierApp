
package com.dao.jod;

import com.model.jod.Paket;
import com.model.jod.Tarif;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TarifFileDao {
    
    public static List <Tarif> pilihKota () {
        
        List <Tarif> kotatujuan = new ArrayList<>();
        
        try {
            Scanner scan = new Scanner(new File("e:/Java/kota.txt"));
            
            while (scan.hasNextLine()) {
            
            
            String line = scan.nextLine();
            String [] data = line.split(",");  
                String regul = data[1];
                double reguler = Double.parseDouble(regul);
                String kila = data[2];
                double kilat = Double.parseDouble(kila);
                String sds0 = data[3];
                double sds = Double.parseDouble(sds0);
                String ons0 = data[4];
                double ons = Double.parseDouble(ons0);
                String hds0 = data[5];
                double hds = Double.parseDouble(hds0);
                
                Tarif tarif = new Tarif();
                
                tarif.setKotaTujuan(data[0]);
                tarif.setReguler(reguler);
                tarif.setKilat(kilat);
                tarif.setSds(sds);
                tarif.setOns(ons);
                tarif.setHds(hds);
                
                kotatujuan.add(tarif);
            
        }
            
            
        } catch (FileNotFoundException fileErr) {
//            fileErr.printStackTrace();
              System.out.println("File tidak ditemukan");
        }
        return kotatujuan;
    }   
}

