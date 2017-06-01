/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

/**
 *
 * @author Niek van der Starre
 */
public class ClientWijzigen extends javax.swing.JFrame {

    /**
     * Creates new form ClientWijzigen
     */
    public ClientWijzigen() {
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
        wijzigKnop = new javax.swing.JButton();
        verwijzerVeld = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        soortvoedselpakketVeld = new javax.swing.JComboBox<>();
        uitgiftepuntVeld = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        aantalpersonenVeld = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        naampartnerVeld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        clientzoekKnop = new javax.swing.JButton();

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

        wijzigKnop.setText("Wijzigingen opslaan");

        verwijzerVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lijst van hulporganisaties" }));

        jLabel10.setText("Verwijzer");

        soortvoedselpakketVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enkelvoudig", "Dubbel", "Drievoudig" }));

        uitgiftepuntVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lijst van uitgiftepunten" }));

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

        clientzoekKnop.setText("Cliënt zoeken");
        clientzoekKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientzoekKnopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aantalpersonenVeld, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(verwijzerVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(soortvoedselpakketVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(naampartnerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(uitgiftepuntVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wijzigKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientzoekKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verwijzerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plaatsVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientzoekKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wijzigKnop)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
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

    private void clientzoekKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientzoekKnopActionPerformed
        ClientZoeken z = new ClientZoeken();
        z.setVisible(true);
    }//GEN-LAST:event_clientzoekKnopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aantalpersonenVeld;
    private javax.swing.JTextField adresVeld;
    private javax.swing.JButton clientzoekKnop;
    private javax.swing.JTextField emailVeld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobielnummerVeld;
    private javax.swing.JTextField naamVeld;
    private javax.swing.JTextField naampartnerVeld;
    private javax.swing.JTextField plaatsVeld;
    private javax.swing.JTextField postcodeVeld;
    private javax.swing.JComboBox<String> soortvoedselpakketVeld;
    private javax.swing.JTextField telefoonnummerVeld;
    private javax.swing.JComboBox<String> uitgiftepuntVeld;
    private javax.swing.JComboBox<String> verwijzerVeld;
    private javax.swing.JButton wijzigKnop;
    // End of variables declaration//GEN-END:variables
}
