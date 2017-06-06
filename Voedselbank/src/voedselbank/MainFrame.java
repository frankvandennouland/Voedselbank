/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Dave
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainFrame() {
        initComponents();
        setOptions();
    }

    private void setOptions() {
        setTitle("Voedselbank Haaglanden");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {

                SimpleDataSourceV2.closeConnection();
                System.out.println("De database is succesvol afgesloten");
                System.exit(0);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        clienttoevoegenKnop = new javax.swing.JButton();
        clientwijzigenKnop = new javax.swing.JButton();
        uitgiftepunttoevoegenKnop = new javax.swing.JButton();
        uitgiftepuntwijzigenKnop = new javax.swing.JButton();
        overzichtenKnop = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clienttoevoegenKnop.setText("Cliënt toevoegen");
        clienttoevoegenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienttoevoegenKnopActionPerformed(evt);
            }
        });

        clientwijzigenKnop.setText("Cliëntgegevens wijzigen/verwijderen");
        clientwijzigenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientwijzigenKnopActionPerformed(evt);
            }
        });

        uitgiftepunttoevoegenKnop.setText("Uitgiftepunt toevoegen");

        uitgiftepuntwijzigenKnop.setText("Uitgiftepunt wijzigen/verwijderen");

        overzichtenKnop.setText("Overzichten");
        overzichtenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overzichtenKnopActionPerformed(evt);
            }
        });

        jButton1.setText("Importeer uit Excel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clienttoevoegenKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientwijzigenKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uitgiftepunttoevoegenKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uitgiftepuntwijzigenKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overzichtenKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clienttoevoegenKnop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientwijzigenKnop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uitgiftepunttoevoegenKnop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uitgiftepuntwijzigenKnop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overzichtenKnop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientwijzigenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientwijzigenKnopActionPerformed
        ClientWijzigen w = new ClientWijzigen();
        w.setVisible(true);
    }//GEN-LAST:event_clientwijzigenKnopActionPerformed

    private void clienttoevoegenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienttoevoegenKnopActionPerformed
        ClientAanmaken a = new ClientAanmaken();
        a.setVisible(true);
    }//GEN-LAST:event_clienttoevoegenKnopActionPerformed

    private void overzichtenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overzichtenKnopActionPerformed
        OverzichtScherm s = new OverzichtScherm();
        s.setVisible(true);
    }//GEN-LAST:event_overzichtenKnopActionPerformed

    public static void main(String[] args) {
        MainFrame f = new MainFrame();
        f.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clienttoevoegenKnop;
    private javax.swing.JButton clientwijzigenKnop;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton overzichtenKnop;
    private javax.swing.JButton uitgiftepunttoevoegenKnop;
    private javax.swing.JButton uitgiftepuntwijzigenKnop;
    // End of variables declaration//GEN-END:variables

}
