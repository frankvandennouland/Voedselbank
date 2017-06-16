/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

/**
 *
 * @author frank
 */
public class Uitgiftepunt {
    private int uitgiftepunt_ID;
    private String naam;
    private String adres;
    private String postcode;
    private String plaatsnaam;
    private int capaciteit;

    public Uitgiftepunt(int uitgiftepunt_ID, String naam, String adres, String postcode, String plaatsnaam, int capaciteit) {
        this.uitgiftepunt_ID = uitgiftepunt_ID;
        this.naam = naam;
        this.adres = adres;
        this.postcode = postcode;
        this.plaatsnaam = plaatsnaam;
        this.capaciteit = capaciteit;
    }
    
    public int getUitgiftepunt_ID() {
        return uitgiftepunt_ID;
    }

    public void setUitgiftepunt_ID(int uitgiftepunt_ID) {
        this.uitgiftepunt_ID = uitgiftepunt_ID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPlaatsnaam() {
        return plaatsnaam;
    }

    public void setPlaatsnaam(String plaatsnaam) {
        this.plaatsnaam = plaatsnaam;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }
         
    @Override
    public String toString(){
        return naam;
    }
    
}
