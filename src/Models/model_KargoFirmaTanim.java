/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Cemmy
 */
public class model_KargoFirmaTanim {
    private int id;
    private String adi;
    private String adres;
    private int telefon;
    private String vergi_dairesi;
    private int vergi_no;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getVergi_dairesi() {
        return vergi_dairesi;
    }

    public void setVergi_dairesi(String vergi_dairesi) {
        this.vergi_dairesi = vergi_dairesi;
    }

    public int getVergi_no() {
        return vergi_no;
    }

    public void setVergi_no(int vergi_no) {
        this.vergi_no = vergi_no;
    }

}
