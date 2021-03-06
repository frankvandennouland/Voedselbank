/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Niek van der Starre
 */
public class UitgiftepuntAanmaken extends javax.swing.JFrame {

    private static Connection connection;

    /**
     * Creates new form KlantAanpassen
     */
    public UitgiftepuntAanmaken() {
        initComponents();
        setTitle("Uitgiftepunt toevoegen");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        naamVeld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        adresVeld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        postcodeVeld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        plaatsnaamVeld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        capaciteitVeld = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naam*");

        naamVeld.setDocument(new TextfieldLimit(75));

        jLabel2.setText("Adres*");

        adresVeld.setDocument(new TextfieldLimit(100));

        jLabel3.setText("Postcode*");

        postcodeVeld.setDocument(new voedselbank.TextfieldLimit(6));

        jLabel4.setText("Plaatsnaam*");

        plaatsnaamVeld.setDocument(new TextfieldLimit(75));

        jLabel5.setText("Capaciteit");

        capaciteitVeld.setDocument(new TextfieldLimit(11));

        jLabel11.setText("Velden met * zijn verplicht");

        jButton4.setText("Maak uitgiftepunt aan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
                        .addComponent(postcodeVeld, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addComponent(adresVeld)
                        .addComponent(jLabel4)
                        .addComponent(plaatsnaamVeld)
                        .addComponent(jLabel5)
                        .addComponent(capaciteitVeld)
                        .addComponent(naamVeld))
                    .addComponent(jLabel11)
                    .addComponent(jButton4))
                .addGap(136, 197, Short.MAX_VALUE))
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
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capaciteitVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("INSERT INTO Uitgiftepunt(naam, adres, postcode, plaatsnaam, capaciteit)"
                    + "VALUES(?,?,?,?,?)");

            prestatement.setString(1, naamVeld.getText());
            prestatement.setString(2, adresVeld.getText());
            prestatement.setString(3, postcodeVeld.getText());
            prestatement.setString(4, plaatsnaamVeld.getText());
            prestatement.setString(5, capaciteitVeld.getText());

            prestatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresVeld;
    private javax.swing.JTextField capaciteitVeld;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField naamVeld;
    private javax.swing.JTextField plaatsnaamVeld;
    private javax.swing.JTextField postcodeVeld;
    // End of variables declaration//GEN-END:variables
}
