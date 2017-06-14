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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Niek van der Starre
 */
public class OverzichtScherm extends javax.swing.JFrame {

    private Connection connection;

    /**
     * Creates new form OverzichtScherm
     */
    public OverzichtScherm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        overzichtTabel = new javax.swing.JTable();
        bevoorradingslijstKnop = new javax.swing.JButton();
        clientenoverzichtKnop = new javax.swing.JButton();
        mutatieperperiodeKnop = new javax.swing.JButton();
        clientperhulpverlenerKnop = new javax.swing.JButton();
        overzichtintakeKnop = new javax.swing.JButton();
        mutatieperuitgiftepuntKnop = new javax.swing.JButton();
        exporteerKnop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        overzichtTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(overzichtTabel);

        bevoorradingslijstKnop.setText("Bevoorradingslijst");
        bevoorradingslijstKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bevoorradingslijstKnopActionPerformed(evt);
            }
        });

        clientenoverzichtKnop.setText("Cliënten overzicht");
        clientenoverzichtKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientenoverzichtKnopActionPerformed(evt);
            }
        });

        mutatieperperiodeKnop.setText("Mutatie per periode");

        clientperhulpverlenerKnop.setText("Cliënten per hulpverlener");
        clientperhulpverlenerKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientperhulpverlenerKnopActionPerformed(evt);
            }
        });

        overzichtintakeKnop.setText("Overzicht van intakes");
        overzichtintakeKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overzichtintakeKnopActionPerformed(evt);
            }
        });

        mutatieperuitgiftepuntKnop.setText("Mutaties per uitgiftepunt");
        mutatieperuitgiftepuntKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutatieperuitgiftepuntKnopActionPerformed(evt);
            }
        });

        exporteerKnop.setText("Exporteer naar pdf");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bevoorradingslijstKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientenoverzichtKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mutatieperperiodeKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientperhulpverlenerKnop, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(overzichtintakeKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mutatieperuitgiftepuntKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exporteerKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1269, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bevoorradingslijstKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientenoverzichtKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mutatieperperiodeKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientperhulpverlenerKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overzichtintakeKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mutatieperuitgiftepuntKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exporteerKnop))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mutatieperuitgiftepuntKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutatieperuitgiftepuntKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mutatieperuitgiftepuntKnopActionPerformed

    private void bevoorradingslijstKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bevoorradingslijstKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT u.naam, u.adres, u.postcode, u.plaatsnaam as 'plaats',\n"
                    + "count(case when v.soort like 'Enkel%' then 1 else NULL end) as 'enkelvoudig pakket',\n"
                    + "count(case when v.soort like 'Dubbel%' then 1 else NULL end) as 'dubbel pakket',\n"
                    + "count(case when v.soort like 'Drie%' then 1 else NULL end) as 'drievoudig pakket'\n"
                    + "FROM Uitgiftepunt u\n"
                    + "JOIN Voedselpakket v ON v.ID_uitgiftepunt = u.ID_uitgiftepunt\n"
                    + "JOIN Cliënt c on v.ID_cliënt = c.ID_cliënt\n"
                    + "WHERE c.status_cliënt = 'Actief'\n"
                    + "GROUP BY u.naam;");
            ResultSet rs = prestatement.executeQuery();
            overzichtTabel.setModel(DbUtils.resultSetToTableModel(rs));
            overzichtTabel.setAutoCreateRowSorter(true);
            overzichtTabel.setAutoResizeMode(5);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bevoorradingslijstKnopActionPerformed

    private void clientenoverzichtKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientenoverzichtKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT naam, telefoonnummer, mobielnummer, adres, postcode, plaats, email, kaartnummer, aantalpersonen, naam_partner, status_cliënt FROM Cliënt");
            ResultSet rs = prestatement.executeQuery();
            overzichtTabel.setModel(DbUtils.resultSetToTableModel(rs));
            overzichtTabel.setAutoCreateRowSorter(true);
            overzichtTabel.setAutoResizeMode(5);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_clientenoverzichtKnopActionPerformed

    private void overzichtintakeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overzichtintakeKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT Cliënt.naam as naam_cliënt, Hulpverlener.naam as naam_hulpverlener, datum, startdatum_uitgifte, \n"
                    + "datum_herintake, datum_stopzetting, reden_stopzetting \n"
                    + "FROM Intake\n"
                    + "JOIN Hulpverlener ON Hulpverlener.ID_hulpverlener = Intake.ID_hulpverlener\n"
                    + "JOIN Cliënt ON Cliënt.ID_cliënt = Intake.ID_cliënt");
            ResultSet rs = prestatement.executeQuery();
            overzichtTabel.setModel(DbUtils.resultSetToTableModel(rs));
            overzichtTabel.setAutoCreateRowSorter(true);
            overzichtTabel.setAutoResizeMode(5);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_overzichtintakeKnopActionPerformed

    private void clientperhulpverlenerKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientperhulpverlenerKnopActionPerformed
        ClientperHulpverlenerFrame ch = new ClientperHulpverlenerFrame();
        ch.setVisible(true);
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT Hulpverlener.naam as naam_hulpverlener,\n"
                    + "count(case when Intake.ID_cliënt is not null then 1 else NULL end) as aantal_cliënten\n"
                    + "FROM Intake \n"
                    + "JOIN Hulpverlener ON Hulpverlener.ID_hulpverlener = Intake.ID_hulpverlener \n"
                    + "JOIN Cliënt ON Cliënt.ID_cliënt = Intake.ID_cliënt\n"
                    + "GROUP BY Hulpverlener.naam");
            ResultSet rs = prestatement.executeQuery();
            overzichtTabel.setModel(DbUtils.resultSetToTableModel(rs));
            overzichtTabel.setAutoCreateRowSorter(true);
            overzichtTabel.setAutoResizeMode(5);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_clientperhulpverlenerKnopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bevoorradingslijstKnop;
    private javax.swing.JButton clientenoverzichtKnop;
    private javax.swing.JButton clientperhulpverlenerKnop;
    private javax.swing.JButton exporteerKnop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mutatieperperiodeKnop;
    private javax.swing.JButton mutatieperuitgiftepuntKnop;
    private javax.swing.JTable overzichtTabel;
    private javax.swing.JButton overzichtintakeKnop;
    // End of variables declaration//GEN-END:variables
}
