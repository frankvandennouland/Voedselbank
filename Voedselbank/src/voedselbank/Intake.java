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
    
    
    public Intake() {
        
    }
}
