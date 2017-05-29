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
public class Client {
    private int ID;
    private int kaartnummer;
    private String naam;
    private String telefoonnummer;
    private String adres;
    private String postcode;
    private String plaats;
    private String email;
    private String mobielnummer;
    private int aantalPersonen;
    private String Status;
    private String naamPartner;
    private int uitgiftepunt_ID;
    private int partner_ID;
    private int verwijzer_ID;
    private int verwijzing_ID;

    public Client(int ID, int kaartnummer, String naam, String telefoonnummer, String adres, String postcode, String plaats, String email, String mobielnummer, int aantalPersonen, String Status, String naamPartner, int uitgiftepunt_ID, int partner_ID, int verwijzer_ID, int verwijzing_ID) {
        this.ID = ID;
        this.kaartnummer = kaartnummer;
        this.naam = naam;
        this.telefoonnummer = telefoonnummer;
        this.adres = adres;
        this.postcode = postcode;
        this.plaats = plaats;
        this.email = email;
        this.mobielnummer = mobielnummer;
        this.aantalPersonen = aantalPersonen;
        this.Status = Status;
        this.naamPartner = naamPartner;
        this.uitgiftepunt_ID = uitgiftepunt_ID;
        this.partner_ID = partner_ID;
        this.verwijzer_ID = verwijzer_ID;
        this.verwijzing_ID = verwijzing_ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getKaartnummer() {
        return kaartnummer;
    }

    public void setKaartnummer(int kaartnummer) {
        this.kaartnummer = kaartnummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
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

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobielnummer() {
        return mobielnummer;
    }

    public void setMobielnummer(String mobielnummer) {
        this.mobielnummer = mobielnummer;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getNaamPartner() {
        return naamPartner;
    }

    public void setNaamPartner(String naamPartner) {
        this.naamPartner = naamPartner;
    }

    public int getUitgiftepunt_ID() {
        return uitgiftepunt_ID;
    }

    public void setUitgiftepunt_ID(int uitgiftepunt_ID) {
        this.uitgiftepunt_ID = uitgiftepunt_ID;
    }

    public int getPartner_ID() {
        return partner_ID;
    }

    public void setPartner_ID(int partner_ID) {
        this.partner_ID = partner_ID;
    }

    public int getVerwijzer_ID() {
        return verwijzer_ID;
    }

    public void setVerwijzer_ID(int verwijzer_ID) {
        this.verwijzer_ID = verwijzer_ID;
    }

    public int getVerwijzing_ID() {
        return verwijzing_ID;
    }

    public void setVerwijzing_ID(int verwijzing_ID) {
        this.verwijzing_ID = verwijzing_ID;
    }
    
}
