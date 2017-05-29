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
public class Identiteitsbewijs {
    private int identiteitsnummer;
    private String plaatsUitgifte;
    private Date datumUitgifte = new Date();
    private String Soort;
    private int client_ID;

    public Identiteitsbewijs(int identiteitsnummer, String plaatsUitgifte, String Soort, int client_ID) {
        this.identiteitsnummer = identiteitsnummer;
        this.plaatsUitgifte = plaatsUitgifte;
        this.Soort = Soort;
        this.client_ID = client_ID;
    }
    
    public int getIdentiteitsnummer() {
        return identiteitsnummer;
    }

    public void setIdentiteitsnummer(int identiteitsnummer) {
        this.identiteitsnummer = identiteitsnummer;
    }

    public String getPlaatsUitgifte() {
        return plaatsUitgifte;
    }

    public void setPlaatsUitgifte(String plaatsUitgifte) {
        this.plaatsUitgifte = plaatsUitgifte;
    }

    public Date getDatumUitgifte() {
        return datumUitgifte;
    }

    public void setDatumUitgifte(Date datumUitgifte) {
        this.datumUitgifte = datumUitgifte;
    }

    public String getSoort() {
        return Soort;
    }

    public void setSoort(String Soort) {
        this.Soort = Soort;
    }

    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }
    

}
