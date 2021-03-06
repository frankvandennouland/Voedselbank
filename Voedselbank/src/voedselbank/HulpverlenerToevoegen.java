/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Niek van der Starre
 */
public class HulpverlenerToevoegen extends javax.swing.JFrame {

    private Connection connection;
    private final DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");

    /**
     * Creates new form HulpverlenerToevoegen
     */
    public HulpverlenerToevoegen() {
        initComponents();
        setTitle("Hulpverlener toevoegen");
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
        jLabel3 = new javax.swing.JLabel();
        telefoonnummerVeld = new javax.swing.JTextField();
        toevoegKnop = new javax.swing.JButton();
        geboortedatumVeld = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naam");

        naamVeld.setDocument(new TextfieldLimit(75));

        jLabel2.setText("Geboortedatum");

        jLabel3.setText("Telefoonnummer");

        telefoonnummerVeld.setDocument(new TextfieldLimit(15));

        toevoegKnop.setText("Toevoegen");
        toevoegKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toevoegKnopActionPerformed(evt);
            }
        });

        geboortedatumVeld.setDate(new Date());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(naamVeld)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(telefoonnummerVeld)
                    .addComponent(toevoegKnop, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(geboortedatumVeld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoonnummerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toevoegKnop)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toevoegKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toevoegKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("INSERT INTO Hulpverlener(naam, geboortedatum, telefoonnummer)"
                    + "VALUES(?,?,?)");

            prestatement.setString(1, naamVeld.getText());
            prestatement.setString(2, dateFormat.format(geboortedatumVeld.getDate()));
            prestatement.setString(3, telefoonnummerVeld.getText());

            prestatement.executeUpdate();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_toevoegKnopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser geboortedatumVeld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField naamVeld;
    private javax.swing.JTextField telefoonnummerVeld;
    private javax.swing.JButton toevoegKnop;
    // End of variables declaration//GEN-END:variables
}
