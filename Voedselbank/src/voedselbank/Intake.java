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
public class Intake {
    private int client_ID;
    private int hulpverlerner_ID;
    private Date datum = new Date();
    private Date datumUitgifte = new Date();
    private Date datumHerintake = new Date();
    private Date datumStopzetting = new Date();
    private String RedenStopzetting;

    public Intake(int client_ID, int hulpverlerner_ID, String RedenStopzetting) {
        this.client_ID = client_ID;
        this.hulpverlerner_ID = hulpverlerner_ID;
        this.RedenStopzetting = RedenStopzetting;
    }
    
    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public int getHulpverlerner_ID() {
        return hulpverlerner_ID;
    }

    public void setHulpverlerner_ID(int hulpverlerner_ID) {
        this.hulpverlerner_ID = hulpverlerner_ID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getDatumUitgifte() {
        return datumUitgifte;
    }

    public void setDatumUitgifte(Date datumUitgifte) {
        this.datumUitgifte = datumUitgifte;
    }

    public Date getDatumHerintake() {
        return datumHerintake;
    }

    public void setDatumHerintake(Date datumHerintake) {
        this.datumHerintake = datumHerintake;
    }

    public Date getDatumStopzetting() {
        return datumStopzetting;
    }

    public void setDatumStopzetting(Date datumStopzetting) {
        this.datumStopzetting = datumStopzetting;
    }

    public String getRedenStopzetting() {
        return RedenStopzetting;
    }

    public void setRedenStopzetting(String RedenStopzetting) {
        this.RedenStopzetting = RedenStopzetting;
    }

}
