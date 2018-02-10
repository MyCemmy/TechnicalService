/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.PostgreSQL;

import DBConnections.allConnections;
import DBFramework.ICRUD;
import Models.model_KargoFirmaTanim;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cemmy
 */
public class tbl_KargoFirmaTanim implements ICRUD {
    allConnections baglanti = new allConnections();

    @Override
    public void Kaydet(Object o) {
        model_KargoFirmaTanim kargoFirma;
        kargoFirma = (model_KargoFirmaTanim) o;
        
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into ﻿kargo_firma_tanim(adi,adres,telefon,Vergi_dairesi,Vergi_no)) values(?,?,?)");
            
            
            ifade.setString(1,kargoFirma.getAdi());
            ifade.setString(2,kargoFirma.getAdres() );
            ifade.setInt(3,kargoFirma.getTelefon() );
            ifade.setString(4, kargoFirma.getVergi_dairesi());
            ifade.setInt(5, kargoFirma.getVergi_no());
            System.out.println(ifade.toString());        
            ifade.executeUpdate();
             
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tbl_KargoFirmaTanim.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tbl_KargoFirmaTanim.class.getName()).log(Level.SEVERE, null, ex);
        }
            

          
       

        
    }

    @Override
    public void Duzenle(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Sil(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Bul(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
