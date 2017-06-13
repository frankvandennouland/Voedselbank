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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author Niek van der Starre
 */
public class ClientWijzigen extends javax.swing.JFrame {

    private Client client;
    private JFrame opener;
    private Connection connection;

    /**
     * Creates new form ClientWijzigen
     */
    public ClientWijzigen() {
        initComponents();
        this.setTitle("Clientgegevens wijzigen/verwijderen");
    }

    public ClientWijzigen(Client client) {
        this.client = client;
        initComponents();
        this.setTitle("Clientgegevens wijzigen/verwijderen");
        vulVelden();
        maakUitgiftepuntLijst();
    }

    public void setOpener(JFrame jf) {
        opener = jf;
        opener.setVisible(false);
    }

    /**
     * Vult de velden met informatie van de cliënt.
     */
    private void vulVelden() {
        naamVeld.setText(client.getNaam());
        telefoonnummerVeld.setText(client.getTelefoonnummer());
        mobielnummerVeld.setText(client.getMobielnummer());
        adresVeld.setText(client.getAdres());
        postcodeVeld.setText(client.getPostcode());
        plaatsVeld.setText(client.getPlaats());
        emailVeld.setText(client.getEmail());
        kaartnummerVeld.setText(client.getKaartnummer() + "");
        naampartnerVeld.setText(client.getNaamPartner());
        aantalpersonenVeld.setSelectedItem(client.getAantalPersonen() + "");
        statusVeld.setSelectedItem(client.getStatus());
    }

    /**
     * Maakt de combobox van uitgiftepunten aan
     */
    private void maakUitgiftepuntLijst() {

        DefaultComboBoxModel<Uitgiftepunt> model = new DefaultComboBoxModel<>();

        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT * FROM Uitgiftepunt");

            ResultSet rs = prestatement.executeQuery();

            while (rs.next()) {
                int uitgiftepunt_ID = rs.getInt("ID_uitgiftepunt");
                String naam = rs.getString("naam");
                String adres = rs.getString("adres");
                String postcode = rs.getString("postcode");
                String plaatsnaam = rs.getString("plaatsnaam");
                int capaciteit = rs.getInt("capaciteit");

                Uitgiftepunt u = new Uitgiftepunt(uitgiftepunt_ID, naam, adres, postcode, plaatsnaam, capaciteit);

                model.addElement(u);
            }

            uitgiftepuntVeld.setModel(model);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        emailVeld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        plaatsVeld = new javax.swing.JTextField();
        postcodeVeld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adresVeld = new javax.swing.JTextField();
        mobielnummerVeld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefoonnummerVeld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        naamVeld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        verwijderKnop = new javax.swing.JButton();
        soortvoedselpakketVeld = new javax.swing.JComboBox<>();
        uitgiftepuntVeld = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        aantalpersonenVeld = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        naampartnerVeld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        wijzigKnop = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        kaartnummerVeld = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        statusVeld = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel11.setText("Velden met * zijn verplicht");

        jLabel7.setText("E-mailadres*");

        plaatsVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plaatsVeldActionPerformed(evt);
            }
        });

        jLabel6.setText("Plaats*");

        jLabel5.setText("Postcode*");

        jLabel4.setText("Adres*");

        adresVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresVeldActionPerformed(evt);
            }
        });

        mobielnummerVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobielnummerVeldActionPerformed(evt);
            }
        });

        jLabel3.setText("Mobielnummer");

        telefoonnummerVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoonnummerVeldActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefoonnummer*");

        naamVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naamVeldActionPerformed(evt);
            }
        });

        jLabel1.setText("Naam*");

        verwijderKnop.setText("Cliënt verwijderen");
        verwijderKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verwijderKnopActionPerformed(evt);
            }
        });

        soortvoedselpakketVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enkelvoudig", "Dubbel", "Drievoudig" }));

        jLabel12.setText("Soort voedselpakket");

        jLabel13.setText("Uitgiftepunt");

        aantalpersonenVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        aantalpersonenVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aantalpersonenVeldActionPerformed(evt);
            }
        });

        jLabel8.setText("Aantal personen");

        jLabel9.setText("Naam partner");

        wijzigKnop.setText("Gegevens wijzigen");
        wijzigKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wijzigKnopActionPerformed(evt);
            }
        });

        jLabel14.setText("Kaartnummer");

        jLabel15.setText("Status");

        statusVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actief", "Afgewezen", "Gestopt", "Pending" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(mobielnummerVeld)
                        .addComponent(telefoonnummerVeld)
                        .addComponent(jLabel4)
                        .addComponent(adresVeld)
                        .addComponent(jLabel5)
                        .addComponent(postcodeVeld)
                        .addComponent(jLabel6)
                        .addComponent(plaatsVeld)
                        .addComponent(jLabel7)
                        .addComponent(emailVeld, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addComponent(naamVeld))
                    .addComponent(jLabel14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(kaartnummerVeld, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aantalpersonenVeld, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(soortvoedselpakketVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(verwijderKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wijzigKnop, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addComponent(statusVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uitgiftepuntVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(naampartnerVeld))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naamVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naampartnerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoonnummerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aantalpersonenVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobielnummerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uitgiftepuntVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soortvoedselpakketVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postcodeVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plaatsVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kaartnummerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(verwijderKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wijzigKnop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plaatsVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plaatsVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plaatsVeldActionPerformed

    private void adresVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresVeldActionPerformed

    private void mobielnummerVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobielnummerVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobielnummerVeldActionPerformed

    private void telefoonnummerVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoonnummerVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoonnummerVeldActionPerformed

    private void naamVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naamVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naamVeldActionPerformed

    private void aantalpersonenVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aantalpersonenVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aantalpersonenVeldActionPerformed

    private void wijzigKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wijzigKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE Cliënt SET naam = ?, telefoonnummer = ?, mobielnummer = ?, adres = ?, postcode = ?, plaats = ?, email = ?, kaartnummer = ?, aantalpersonen = ?, naam_partner = ?, status_cliënt = ? WHERE ID_cliënt = ?");

            ps.setString(1, naamVeld.getText());
            ps.setString(2, telefoonnummerVeld.getText());
            ps.setString(3, mobielnummerVeld.getText());
            ps.setString(4, adresVeld.getText());
            ps.setString(5, postcodeVeld.getText());
            ps.setString(6, plaatsVeld.getText());
            ps.setString(7, emailVeld.getText());
            ps.setString(8, kaartnummerVeld.getText());
            ps.setString(9, aantalpersonenVeld.getSelectedItem().toString());
            ps.setString(10, naampartnerVeld.getText());
            ps.setString(11, statusVeld.getSelectedItem().toString());
            ps.setInt(12, client.getID());

            ps.executeUpdate();

            PreparedStatement psVoedselpakket = connection.prepareStatement("UPDATE Voedselpakket SET ID_uitgiftepunt = ?, soort = ? WHERE ID_cliënt = ?");

            psVoedselpakket.setInt(1, uitgiftepuntVeld.getItemAt(uitgiftepuntVeld.getSelectedIndex()).getUitgiftepunt_ID());
            psVoedselpakket.setString(2, soortvoedselpakketVeld.getSelectedItem().toString());
            psVoedselpakket.setInt(3, client.getID());

            psVoedselpakket.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_wijzigKnopActionPerformed

    private void verwijderKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verwijderKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Cliënt WHERE ID_cliënt = ?");

            ps.setInt(1, client.getID());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verwijderKnopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aantalpersonenVeld;
    private javax.swing.JTextField adresVeld;
    private javax.swing.JTextField emailVeld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kaartnummerVeld;
    private javax.swing.JTextField mobielnummerVeld;
    private javax.swing.JTextField naamVeld;
    private javax.swing.JTextField naampartnerVeld;
    private javax.swing.JTextField plaatsVeld;
    private javax.swing.JTextField postcodeVeld;
    private javax.swing.JComboBox<String> soortvoedselpakketVeld;
    private javax.swing.JComboBox<String> statusVeld;
    private javax.swing.JTextField telefoonnummerVeld;
    private javax.swing.JComboBox<Uitgiftepunt> uitgiftepuntVeld;
    private javax.swing.JButton verwijderKnop;
    private javax.swing.JButton wijzigKnop;
    // End of variables declaration//GEN-END:variables
}
