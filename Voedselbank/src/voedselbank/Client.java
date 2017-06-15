/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    private int verwijzer_ID;
    private int verwijzing_ID;
    private Connection connection;

    public Client(int ID, int kaartnummer, String naam, String telefoonnummer, String adres, String postcode, String plaats, String email, String mobielnummer, int aantalPersonen, String Status, String naamPartner, int uitgiftepunt_ID, int verwijzer_ID, int verwijzing_ID) {
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
        this.verwijzer_ID = verwijzer_ID;
        this.verwijzing_ID = verwijzing_ID;
    }
    
    public Client(int kaartnummer, String naam, String telefoonnummer, String adres, String postcode, String plaats, String email, String mobielnummer, int aantalPersonen, String Status, String naamPartner) {
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
    
       public void checkBestaat(Client client) {
           
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT * FROM Cliënt where kaartnummer = " + client.kaartnummer + " limit 1");

            ResultSet rs = prestatement.executeQuery();

            while (rs.next()) {
                boolean hetzelfde = false;
     
                int ID = rs.getInt("ID_cliënt");
                int kaartnummer = rs.getInt("kaartnummer");
                String naam = rs.getString("naam");
                String telefoonnummer = rs.getString("telefoonnummer");
                String adres = rs.getString("adres");
                String postcode = rs.getString("postcode");
                String plaats = rs.getString("plaats");
                String email = rs.getString("email");
                String mobielnummer = rs.getString("mobielnummer");
                int aantalPersonen = rs.getInt("aantalPersonen");
                String Status = rs.getString("status_cliënt");
                String naamPartner = rs.getString("naam_partner");
                int uitgiftepunt_ID = rs.getInt("ID_uitgiftepunt");
                int verwijzer_ID = rs.getInt("ID_verwijzer");
                int verwijzing_ID = rs.getInt("ID_verwijzing");

                Client dbClient = new Client(ID, kaartnummer, naam, telefoonnummer, adres, postcode, plaats, email, mobielnummer, aantalPersonen,
                        Status, naamPartner, uitgiftepunt_ID, verwijzer_ID, verwijzing_ID);
                
                if(client.naam.equals(dbClient.naam) && 
                   client.telefoonnummer.equals(dbClient.telefoonnummer) &&
                   client.adres.equals(dbClient.adres) &&
                   client.postcode.equals(dbClient.postcode) &&
                   client.plaats.equals(dbClient.plaats) &&
                   client.email.equals(dbClient.email) &&
                   client.mobielnummer.equals(dbClient.mobielnummer) &&
                   client.aantalPersonen == dbClient.aantalPersonen &&
                   client.Status.equals(dbClient.Status) &&
                   client.naamPartner.equals(dbClient.naamPartner)) {
                    hetzelfde = true;
                }
                
                if(hetzelfde == false) {
                    prestatement = connection.prepareStatement("Update Cliënt set naam = ?, telefoonnummer = ?, mobielnummer = ?, adres = ?, postcode = ?, plaats = ?, email = ?, aantalpersonen = ?, status_cliënt = ?, naam_partner = ? where kaartnummer = " + client.kaartnummer + " AND ID_cliënt = " + dbClient.ID);
                    
                    prestatement.setString(1, client.naam);
                    prestatement.setString(2, client.telefoonnummer);
                    prestatement.setString(3, client.mobielnummer);
                    prestatement.setString(4, client.adres);
                    prestatement.setString(5, client.postcode);
                    prestatement.setString(6, client.plaats);
                    prestatement.setString(7, client.email);
                    prestatement.setInt(8, client.aantalPersonen);
                    prestatement.setString(9, client.Status);
                    prestatement.setString(10, client.naamPartner);
                    
                    
                    prestatement.executeUpdate();
                }
            }
            
            if (!rs.isBeforeFirst()) {
                prestatement = connection.prepareStatement("INSERT INTO Cliënt(kaartnummer, naam, telefoonnummer, mobielnummer, adres, postcode, plaats, email, aantalpersonen, naam_partner, status_cliënt)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");

                prestatement.setInt(1, client.kaartnummer);
                prestatement.setString(2, client.naam);
                prestatement.setString(3, client.telefoonnummer);
                prestatement.setString(4, client.mobielnummer);
                prestatement.setString(5, client.adres);
                prestatement.setString(6, client.postcode);
                prestatement.setString(7, client.plaats); 
                prestatement.setString(8, client.email);
                prestatement.setInt(9, client.aantalPersonen);
                prestatement.setString(10, client.naamPartner);
                prestatement.setString(11, client.Status);

                prestatement.executeUpdate();
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insertClient (Client client) {
        
    }
    
    @Override
    public String toString(){
        return kaartnummer + " - " + naam;
    }
    
}
