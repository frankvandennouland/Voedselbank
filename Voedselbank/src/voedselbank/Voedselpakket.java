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
public class Voedselpakket {
    private int client_ID;
    private int uitgiftepunt_ID;
    private Date datum;
    private String soort;

    public Voedselpakket(int client_ID, int uitgiftepunt_ID, Date datum, String soort) {
        this.client_ID = client_ID;
        this.uitgiftepunt_ID = uitgiftepunt_ID;
        this.datum = datum;
        this.soort = soort;
    }
    
    public Voedselpakket(Date datum, String soort) {
        this.datum = datum;
        this.soort = soort;
    }

    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public int getUitgiftepunt_ID() {
        return uitgiftepunt_ID;
    }

    public void setUitgiftepunt_ID(int uitgiftepunt_ID) {
        this.uitgiftepunt_ID = uitgiftepunt_ID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }
    
    public String toString(){
        return soort;
    }
    
}
