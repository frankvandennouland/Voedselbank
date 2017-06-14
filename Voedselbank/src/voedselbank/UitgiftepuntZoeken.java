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
import javax.swing.DefaultListModel;

/**
 *
 * @author Niek van der Starre
 */
public class UitgiftepuntZoeken extends javax.swing.JFrame {

    private Connection connection;

    /**
     * Creates new form ClientZoeken
     */
    public UitgiftepuntZoeken() {
        initComponents();
        setTitle("Uitgiftepunt zoeken");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        naam = new javax.swing.JLabel();
        naamVeld = new javax.swing.JTextField();
        adres = new javax.swing.JLabel();
        adresVeld = new javax.swing.JTextField();
        zoekKnop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uitgiftepuntenLijst = new javax.swing.JList<>();
        wijzigKnop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        naam.setText("Naam");

        adres.setText("Adres");

        zoekKnop.setText("Zoeken");
        zoekKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekKnopActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(uitgiftepuntenLijst);

        wijzigKnop.setText("Wijzig");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(wijzigKnop, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(naam, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(naamVeld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresVeld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zoekKnop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(naam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naamVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(zoekKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wijzigKnop)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zoekKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekKnopActionPerformed

        DefaultListModel<Uitgiftepunt> model = new DefaultListModel<>();

        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT * FROM Uitgiftepunt WHERE naam like ? and adres like ?");

            prestatement.setString(1, '%' + naamVeld.getText() + '%');
            prestatement.setString(2, '%' + adresVeld.getText() + '%');

            ResultSet rs = prestatement.executeQuery();

            while (rs.next()) {
                int ID = rs.getInt("ID_uitgiftepunt");
                String naam = rs.getString("naam");

                String adres = rs.getString("adres");
                String postcode = rs.getString("postcode");
                String plaatsnaam = rs.getString("plaatsnaam");
                int capaciteit = rs.getInt("capaciteit");

                Uitgiftepunt uitgiftepunt = new Uitgiftepunt(ID, naam, adres, postcode, plaatsnaam, capaciteit);

                model.addElement(uitgiftepunt);

            }

            uitgiftepuntenLijst.setModel(model);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_zoekKnopActionPerformed

    private void wijzigKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wijzigKnopActionPerformed
        if (!uitgiftepuntenLijst.isSelectionEmpty()) {
        UitgiftepuntWijzigen w = new UitgiftepuntWijzigen(uitgiftepuntenLijst.getSelectedValue());
        w.setOpener(this);
        w.setVisible(true);
        }
    }//GEN-LAST:event_wijzigKnopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adres;
    private javax.swing.JTextField adresVeld;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel naam;
    private javax.swing.JTextField naamVeld;
    private javax.swing.JList<Uitgiftepunt> uitgiftepuntenLijst;
    private javax.swing.JButton wijzigKnop;
    private javax.swing.JButton zoekKnop;
    // End of variables declaration//GEN-END:variables
}
