/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
        omhoogKnop.setVisible(false);
        omlaagKnop.setVisible(false);
        informatieKnop.setVisible(false);
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
        clientperhulpverlenerKnop = new javax.swing.JButton();
        overzichtintakeKnop = new javax.swing.JButton();
        exporteerKnop = new javax.swing.JButton();
        omhoogKnop = new javax.swing.JButton();
        omlaagKnop = new javax.swing.JButton();
        informatieKnop = new javax.swing.JButton();

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

        exporteerKnop.setText("Exporteer naar pdf");
        exporteerKnop.setEnabled(false);
        exporteerKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exporteerKnopActionPerformed(evt);
            }
        });

        omhoogKnop.setText("Verplaats omhoog");
        omhoogKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omhoogKnopActionPerformed(evt);
            }
        });

        omlaagKnop.setText("Verplaats omlaag");
        omlaagKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omlaagKnopActionPerformed(evt);
            }
        });

        informatieKnop.setText("Meer informatie");
        informatieKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informatieKnopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bevoorradingslijstKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientenoverzichtKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientperhulpverlenerKnop, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(overzichtintakeKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exporteerKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(omhoogKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(omlaagKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informatieKnop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(clientperhulpverlenerKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overzichtintakeKnop)
                        .addGap(36, 36, 36)
                        .addComponent(informatieKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(omhoogKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(omlaagKnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exporteerKnop))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moveSelectedRows(int by) {
        DefaultTableModel model = (DefaultTableModel) overzichtTabel.getModel();
        int[] selectedRows = overzichtTabel.getSelectedRows();
        int targetIndex = selectedRows[0] + by;

        if (targetIndex >= 0 && targetIndex < overzichtTabel.getRowCount()) {
            model.moveRow(selectedRows[0], selectedRows[selectedRows.length - 1], targetIndex);
            overzichtTabel.setRowSelectionInterval(selectedRows[0] + by, selectedRows[selectedRows.length - 1] + by);
        }
    }

    private void bevoorradingslijstKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bevoorradingslijstKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT u.naam as 'Naam', u.adres as 'Adres', u.postcode as 'Postcode', u.plaatsnaam as 'Plaats',\n"
                    + "count(case when v.soort like 'Enkel%' then 1 else NULL end) as 'Enkelvoudig pakket',\n"
                    + "count(case when v.soort like 'Dubbel%' then 1 else NULL end) as 'Dubbel pakket',\n"
                    + "count(case when v.soort like 'Drie%' then 1 else NULL end) as 'Drievoudig pakket',\n"
                    + "count('Enkelvoudig pakket' + 'Dubbel pakket' + 'Drievoudig pakket') as 'Totaal',\n"
                    + "u.capaciteit as 'Capaciteit'\n"
                    + "FROM Uitgiftepunt u\n"
                    + "JOIN Voedselpakket v ON v.ID_uitgiftepunt = u.ID_uitgiftepunt\n"
                    + "JOIN Cliënt c on v.ID_cliënt = c.ID_cliënt\n"
                    + "WHERE c.status_cliënt = 'Actief'\n"
                    + "GROUP BY u.naam;");
            ResultSet rs = prestatement.executeQuery();
            overzichtTabel.setModel(DbUtils.resultSetToTableModel(rs));
            overzichtTabel.setAutoCreateRowSorter(true);
            overzichtTabel.setAutoResizeMode(5);
            rs.first();
            ArrayList<String> waarschuwingsLijst = new ArrayList();
            while (rs.next()) {
                if (rs.getInt("Totaal") > 0) {
                    waarschuwingsLijst.add(rs.getString("Naam"));
                }
            }
            if (!waarschuwingsLijst.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String s : waarschuwingsLijst) {
                    sb.append(s);
                    sb.append("\t");
                    sb.append("\n");
                    
                }
                JOptionPane.showMessageDialog(this, " Capaciteit bijna Vol bij:\n " + sb.toString(), "Waarschuwing", JOptionPane.WARNING_MESSAGE);
            }
            exporteerKnop.setEnabled(true);

            omhoogKnop.setVisible(true);
            omlaagKnop.setVisible(true);
            informatieKnop.setVisible(false);

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

            exporteerKnop.setEnabled(false);
            omhoogKnop.setVisible(false);
            omlaagKnop.setVisible(false);
            informatieKnop.setVisible(false);
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

            exporteerKnop.setEnabled(false);
            omhoogKnop.setVisible(false);
            omlaagKnop.setVisible(false);
            informatieKnop.setVisible(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_overzichtintakeKnopActionPerformed

    private void clientperhulpverlenerKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientperhulpverlenerKnopActionPerformed
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT Hulpverlener.naam as 'Hulpverlener',\n"
                    + "count(case when Intake.ID_cliënt is not null then 1 else NULL end) as 'Aantal cliënten'\n"
                    + "FROM Intake \n"
                    + "JOIN Hulpverlener ON Hulpverlener.ID_hulpverlener = Intake.ID_hulpverlener \n"
                    + "JOIN Cliënt ON Cliënt.ID_cliënt = Intake.ID_cliënt\n"
                    + "GROUP BY Hulpverlener.naam");
            ResultSet rs = prestatement.executeQuery();
            overzichtTabel.setModel(DbUtils.resultSetToTableModel(rs));
            overzichtTabel.setAutoCreateRowSorter(true);
            overzichtTabel.setAutoResizeMode(5);

            exporteerKnop.setEnabled(true);
            omhoogKnop.setVisible(false);
            omlaagKnop.setVisible(false);
            informatieKnop.setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_clientperhulpverlenerKnopActionPerformed

    private void exporteerKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exporteerKnopActionPerformed

        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Kies een locatie");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);

            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                Document doc = new Document();

                Rectangle rect = new Rectangle(PageSize.A4.rotate());
                PdfWriter.getInstance(doc, new FileOutputStream(chooser.getSelectedFile() + "/overzicht.pdf"));

                doc.setPageSize(rect);
                doc.open();

                PdfPTable pdfTable = new PdfPTable(overzichtTabel.getColumnCount());
                pdfTable.setWidthPercentage(108);
                pdfTable.setHorizontalAlignment(Element.ALIGN_CENTER);

                //adding table headers
                for (int i = 0; i < overzichtTabel.getColumnCount(); i++) {
                    PdfPCell head = new PdfPCell(new Paragraph(overzichtTabel.getColumnName(i)));
                    head.setHorizontalAlignment(Element.ALIGN_CENTER);
                    head.setBackgroundColor(new BaseColor(236, 116, 4));
                    pdfTable.addCell(head);
                }

                //extracting data from the JTable and inserting it to PdfPTable
                for (int rows = 0; rows < overzichtTabel.getRowCount(); rows++) {
                    for (int cols = 0; cols < overzichtTabel.getColumnCount(); cols++) {
                        pdfTable.addCell(overzichtTabel.getModel().getValueAt(rows, cols).toString());
                    }
                }

                doc.add(pdfTable);
                doc.close();
                System.out.println("Done");
            } else {
                System.out.println("U heeft niks geselecteerd.");
            }
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_exporteerKnopActionPerformed

    private void omhoogKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omhoogKnopActionPerformed
        if (!overzichtTabel.getSelectionModel().isSelectionEmpty()) {
            moveSelectedRows(-1);
        }
    }//GEN-LAST:event_omhoogKnopActionPerformed

    private void omlaagKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omlaagKnopActionPerformed
        if (!overzichtTabel.getSelectionModel().isSelectionEmpty()) {
            moveSelectedRows(1);
        }
    }//GEN-LAST:event_omlaagKnopActionPerformed

    private void informatieKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informatieKnopActionPerformed
        ClientperHulpverlenerFrame ch = new ClientperHulpverlenerFrame();
        ch.setVisible(true);
    }//GEN-LAST:event_informatieKnopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bevoorradingslijstKnop;
    private javax.swing.JButton clientenoverzichtKnop;
    private javax.swing.JButton clientperhulpverlenerKnop;
    private javax.swing.JButton exporteerKnop;
    private javax.swing.JButton informatieKnop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton omhoogKnop;
    private javax.swing.JButton omlaagKnop;
    private javax.swing.JTable overzichtTabel;
    private javax.swing.JButton overzichtintakeKnop;
    // End of variables declaration//GEN-END:variables
}
