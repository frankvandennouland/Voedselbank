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
public class Hulporganisatie {
    private int hulpoganisatie_ID;
    private String organisatienaam;
    private String contactpersoon;
    private String telefoonnummer;
    private String email;

    public Hulporganisatie(int hulpoganisatie_ID, String organisatienaam, String contactpersoon, String telefoonnummer, String email) {
        this.hulpoganisatie_ID = hulpoganisatie_ID;
        this.organisatienaam = organisatienaam;
        this.contactpersoon = contactpersoon;
        this.telefoonnummer = telefoonnummer;
        this.email = email;
    }
     
    public int getHulpoganisatie_ID() {
        return hulpoganisatie_ID;
    }

    public void setHulpoganisatie_ID(int hulpoganisatie_ID) {
        this.hulpoganisatie_ID = hulpoganisatie_ID;
    }

    public String getOrganisatienaam() {
        return organisatienaam;
    }

    public void setOrganisatienaam(String organisatienaam) {
        this.organisatienaam = organisatienaam;
    }

    public String getContactpersoon() {
        return contactpersoon;
    }

    public void setContactpersoon(String contactpersoon) {
        this.contactpersoon = contactpersoon;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void checkBestaat(Uitgiftepunt uitgiftepunt) {
  
    }
}
