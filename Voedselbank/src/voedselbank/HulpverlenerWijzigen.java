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

/**
 *
 * @author Niek van der Starre
 */
public class HulpverlenerWijzigen extends javax.swing.JFrame {

    private Hulpverlener hulpverlener;
    private Connection connection;
    private JFrame opener;

    /**
     * Creates new form HulpverlenerWijzigen
     */
    public HulpverlenerWijzigen() {
        initComponents();
    }

    public HulpverlenerWijzigen(Hulpverlener hulpverlener) {
        this.hulpverlener = hulpverlener;
        initComponents();
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
        naamVeld.setText(hulpverlener.getNaam());
        telefoonnummerVeld.setText(hulpverlener.getTelefoonnummer());
        geboortedatumVeld.setText(hulpverlener.getGeboortedatum().toString());
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
        geboortedatumVeld = new javax.swing.JTextField();
        telefoonnummerVeld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        verwijderKnop = new javax.swing.JButton();
        wijzigKnop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naam");

        naamVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naamVeldActionPerformed(evt);
            }
        });

        jLabel2.setText("Geboortedatum");

        geboortedatumVeld.setText("YYYY-DD-MM");
        geboortedatumVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geboortedatumVeldActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefoonnummer");

        verwijderKnop.setText("Verwijderen");
        verwijderKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verwijderKnopActionPerformed(evt);
            }
        });

        wijzigKnop.setText("Wijzigen");
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
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(naamVeld)
                    .addComponent(geboortedatumVeld)
                    .addComponent(telefoonnummerVeld)
                    .addComponent(verwijderKnop, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(wijzigKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naamVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geboortedatumVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoonnummerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(wijzigKnop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verwijderKnop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void naamVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naamVeldActionPerformed

    }//GEN-LAST:event_naamVeldActionPerformed

    private void geboortedatumVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geboortedatumVeldActionPerformed

    }//GEN-LAST:event_geboortedatumVeldActionPerformed

    private void wijzigKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wijzigKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE Hulpverlener SET naam = ?, geboortedatum = ?, telefoonnummer = ? WHERE ID_hulpverlener = ?");

            ps.setString(1, naamVeld.getText());
            ps.setString(2, geboortedatumVeld.getText());
            ps.setString(3, telefoonnummerVeld.getText());
            ps.setInt(4, hulpverlener.getHulverlener_ID());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_wijzigKnopActionPerformed

    private void verwijderKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verwijderKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Hulpverlener WHERE ID_hulpverlener = ?");

            ps.setInt(1, hulpverlener.getHulverlener_ID());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verwijderKnopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HulpverlenerWijzigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HulpverlenerWijzigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HulpverlenerWijzigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HulpverlenerWijzigen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HulpverlenerWijzigen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField geboortedatumVeld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField naamVeld;
    private javax.swing.JTextField telefoonnummerVeld;
    private javax.swing.JButton verwijderKnop;
    private javax.swing.JButton wijzigKnop;
    // End of variables declaration//GEN-END:variables
}
