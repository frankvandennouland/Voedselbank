/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Niek van der Starre
 */
public class UitgiftepuntWijzigen extends javax.swing.JFrame {

    private Uitgiftepunt uitgiftepunt;
    private JFrame opener;
    private Connection connection;

    /**
     * Creates new form ClientWijzigen
     */
    public UitgiftepuntWijzigen() {
        initComponents();
        this.setTitle("Uitgiftepuntgegevens wijzigen/verwijderen");
    }

    public UitgiftepuntWijzigen(Uitgiftepunt uitgiftepunt) {
        this.uitgiftepunt = uitgiftepunt;
        initComponents();
        this.setTitle("Uitgiftepuntgegevens wijzigen/verwijderen");
        vulVelden();

    }

    public void setOpener(JFrame jf) {
        opener = jf;
        opener.setVisible(false);
    }

    /**
     * Vult de velden met informatie van de cliënt.
     */
    private void vulVelden() {
        naamVeld.setText(uitgiftepunt.getNaam());
        adresVeld.setText(uitgiftepunt.getAdres());
        postcodeVeld.setText(uitgiftepunt.getPostcode());
        plaatsnaamVeld.setText(uitgiftepunt.getPlaatsnaam());
        capaciteitVeld.setText(uitgiftepunt.getCapaciteit() + "");
    }

    /**
     * Maakt de combobox van uitgiftepunten aan
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        capaciteitVeld = new javax.swing.JTextField();
        Capaciteit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        plaatsnaamVeld = new javax.swing.JTextField();
        postcodeVeld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        adresVeld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        naamVeld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        verwijderKnop = new javax.swing.JButton();
        wijzigKnop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel11.setText("Velden met * zijn verplicht");

        capaciteitVeld.setDocument(new TextfieldLimit(11));

        Capaciteit.setText("Capaciteit");

        jLabel4.setText("Plaatsnaam*");

        plaatsnaamVeld.setDocument(new TextfieldLimit(75));

        postcodeVeld.setDocument(new voedselbank.TextfieldLimit(6));

        jLabel3.setText("Postcode*");

        adresVeld.setDocument(new TextfieldLimit(100));

        jLabel2.setText("Adres *");

        naamVeld.setDocument(new TextfieldLimit(75));

        jLabel1.setText("Naam*");

        verwijderKnop.setText("Uitgiftepunt verwijderen");
        verwijderKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verwijderKnopActionPerformed(evt);
            }
        });

        wijzigKnop.setText("Gegevens wijzigen");
        wijzigKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wijzigKnopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(wijzigKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(Capaciteit)
                    .addComponent(verwijderKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capaciteitVeld)
                    .addComponent(plaatsnaamVeld)
                    .addComponent(postcodeVeld)
                    .addComponent(adresVeld)
                    .addComponent(naamVeld))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naamVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postcodeVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plaatsnaamVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Capaciteit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capaciteitVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verwijderKnop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wijzigKnop)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wijzigKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wijzigKnopActionPerformed
        int wijzig = JOptionPane.showConfirmDialog(null, "Weet u zeker dat u de gegevens wilt wijzigen?", "Wijzigen", JOptionPane.YES_NO_OPTION);

        if (wijzig == JOptionPane.YES_OPTION) {

            try {
                connection = SimpleDataSourceV2.getConnection();
                PreparedStatement ps = connection.prepareStatement("UPDATE Uitgiftepunt SET naam = ?, adres = ?, postcode = ?, plaatsnaam = ?, capaciteit = ? WHERE ID_uitgiftepunt = ?");

                ps.setString(1, naamVeld.getText());
                ps.setString(2, adresVeld.getText());
                ps.setString(3, postcodeVeld.getText());
                ps.setString(4, plaatsnaamVeld.getText());
                ps.setString(5, capaciteitVeld.getText());
                ps.setInt(6, uitgiftepunt.getUitgiftepunt_ID());

                ps.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_wijzigKnopActionPerformed

    private void verwijderKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verwijderKnopActionPerformed
        int verwijder = JOptionPane.showConfirmDialog(null, "Weet u zeker dat u alle gegevens wilt verwijderen?", "Verwijderen", JOptionPane.YES_NO_OPTION);

        if (verwijder == JOptionPane.YES_OPTION) {

            try {
                connection = SimpleDataSourceV2.getConnection();
                PreparedStatement ps = connection.prepareStatement("DELETE FROM Uitgiftepunt WHERE ID_uitgiftepunt = ?");

                ps.setInt(1, uitgiftepunt.getUitgiftepunt_ID());

                ps.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_verwijderKnopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Capaciteit;
    private javax.swing.JTextField adresVeld;
    private javax.swing.JTextField capaciteitVeld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField naamVeld;
    private javax.swing.JTextField plaatsnaamVeld;
    private javax.swing.JTextField postcodeVeld;
    private javax.swing.JButton verwijderKnop;
    private javax.swing.JButton wijzigKnop;
    // End of variables declaration//GEN-END:variables
}
