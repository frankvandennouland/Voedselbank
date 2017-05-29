/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import java.util.Date;

/**
 *
 * @author frank
 */
public class Hulpverlener {
    private int hulverlener_ID;
    private String naam;
    private Date geboortedatum = new Date();
    private String telefoonnummer;

    public Hulpverlener(int hulverlener_ID, String naam, String telefoonnummer) {
        this.hulverlener_ID = hulverlener_ID;
        this.naam = naam;
        this.telefoonnummer = telefoonnummer;
    }
    
    public int getHulverlener_ID() {
        return hulverlener_ID;
    }

    public void setHulverlener_ID(int hulverlener_ID) {
        this.hulverlener_ID = hulverlener_ID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    
}
