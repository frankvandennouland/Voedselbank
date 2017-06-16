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
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Niek van der Starre
 */
public class ClientAanmaken extends javax.swing.JFrame {

    private Connection connection;
    private final LocalDate today;
    private final DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");

    /**
     * Creates new form KlantAanpassen
     */
    public ClientAanmaken() {
        this.today = LocalDate.now();
        initComponents();
        setTitle("Cliënt toevoegen");
        maakUitgiftepuntLijst();
        maakHulpverlenerLijst();
    }

    /**
     * Maakt de combobox van uitgiftepunten aan
     */
    private void maakUitgiftepuntLijst() {

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

                uitgiftepuntVeld.addItem(u);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
            
    private void maakHulpverlenerLijst() {
        
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT * FROM Hulpverlener");

            ResultSet rs = prestatement.executeQuery();

            while (rs.next()) {
                int hulpverlener_ID = rs.getInt("ID_hulpverlener");
                String naam = rs.getString("naam");
                String telefoonnummer = rs.getString("telefoonnummer");
                Date geboortedatum = rs.getDate("geboortedatum");

                Hulpverlener h = new Hulpverlener(hulpverlener_ID, naam, telefoonnummer, geboortedatum);

                hulpverlenerLijst.addItem(h);
            }

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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        naamVeld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telefoonnummerVeld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobielnummerVeld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        adresVeld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        postcodeVeld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        plaatsVeld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailVeld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aantalpersonenVeld = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        naampartnerVeld = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        soortvoedselpakketVeld = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        uitgiftepuntVeld = new javax.swing.JComboBox<>();
        toevoegKnop = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        kaartnummerVeld = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        statusVeld = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        hulpverlenerLijst = new javax.swing.JComboBox<>();
        startdatumVeld = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naam*");

        naamVeld.setDocument(new TextfieldLimit(75));

        jLabel2.setText("Telefoonnummer*");

        telefoonnummerVeld.setDocument(new TextfieldLimit(15));

        jLabel3.setText("Mobielnummer");

        mobielnummerVeld.setDocument(new TextfieldLimit(15));

        jLabel4.setText("Adres*");

        adresVeld.setDocument(new TextfieldLimit(75));

        jLabel5.setText("Postcode*");

        postcodeVeld.setDocument(new voedselbank.TextfieldLimit(6));

        jLabel6.setText("Plaats*");

        plaatsVeld.setDocument(new TextfieldLimit(75));

        jLabel7.setText("E-mailadres*");

        emailVeld.setDocument(new TextfieldLimit(100));

        jLabel8.setText("Aantal personen");

        aantalpersonenVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel9.setText("Naam partner");

        naampartnerVeld.setDocument(new TextfieldLimit(50));

        jLabel11.setText("Velden met * zijn verplicht");

        jLabel12.setText("Soort voedselpakket");

        soortvoedselpakketVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enkelvoudig", "Dubbel", "3-voudig" }));

        jLabel13.setText("Uitgiftepunt");

        toevoegKnop.setText("Cliënt toevoegen");
        toevoegKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toevoegKnopActionPerformed(evt);
            }
        });

        jLabel14.setText("Kaartnummer*");

        kaartnummerVeld.setDocument(new TextfieldLimit(11));

        jLabel15.setText("Status");

        statusVeld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actief", "Afgewezen", "Gestopt", "Pending" }));

        jLabel16.setText("Intake gedaan door");

        jLabel17.setText("Startdatum uitgifte");

        startdatumVeld.setDate(new Date());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(soortvoedselpakketVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uitgiftepuntVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statusVeld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hulpverlenerLijst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(aantalpersonenVeld, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel9)
                                            .addComponent(naampartnerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17))
                                        .addGap(0, 25, Short.MAX_VALUE))
                                    .addComponent(startdatumVeld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(kaartnummerVeld)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toevoegKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plaatsVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startdatumVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hulpverlenerLijst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaartnummerVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toevoegKnop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toevoegKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toevoegKnopActionPerformed
       
        int clientID = 0;
        try {
            connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("INSERT INTO Cliënt(naam, telefoonnummer, mobielnummer, adres, postcode, plaats, email, kaartnummer, aantalpersonen, naam_partner, status_cliënt, ID_uitgiftepunt)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            prestatement.setString(1, naamVeld.getText());
            prestatement.setString(2, telefoonnummerVeld.getText());
            prestatement.setString(3, mobielnummerVeld.getText());
            prestatement.setString(4, adresVeld.getText());
            prestatement.setString(5, postcodeVeld.getText());
            prestatement.setString(6, plaatsVeld.getText());
            prestatement.setString(7, emailVeld.getText());
            prestatement.setString(8, kaartnummerVeld.getText());
            prestatement.setString(9, aantalpersonenVeld.getSelectedItem().toString());
            prestatement.setString(10, naampartnerVeld.getText());
            prestatement.setString(11, statusVeld.getSelectedItem().toString());
            prestatement.setInt(12, uitgiftepuntVeld.getItemAt(uitgiftepuntVeld.getSelectedIndex()).getUitgiftepunt_ID());
            
            prestatement.executeUpdate();
            
            ResultSet rs = prestatement.getGeneratedKeys();
            
            while(rs.next()){
            clientID = ((Number) rs.getObject(1)).intValue();
            }
            
            PreparedStatement psIntake = connection.prepareStatement("INSERT INTO Intake(ID_cliënt, ID_hulpverlener, datum, startdatum_uitgifte, datum_herintake)" + "VALUES(?,?,?,?,?)");
            
            psIntake.setInt(1, clientID);
            psIntake.setInt(2, hulpverlenerLijst.getItemAt(hulpverlenerLijst.getSelectedIndex()).getHulverlener_ID());
            psIntake.setString(3, today.toString());
            psIntake.setString(4, dateFormat.format(startdatumVeld.getDate()));
            psIntake.setString(5, today.plusMonths(3).toString());
                        
            psIntake.executeUpdate();
            
            PreparedStatement psVoedselpakket = connection.prepareStatement("INSERT INTO Voedselpakket(ID_cliënt, ID_uitgiftepunt, soort, datum)" + "VALUES(?,?,?,?)");
            
            psVoedselpakket.setInt(1, clientID);
            psVoedselpakket.setInt(2, uitgiftepuntVeld.getItemAt(uitgiftepuntVeld.getSelectedIndex()).getUitgiftepunt_ID());
            psVoedselpakket.setString(3, soortvoedselpakketVeld.getSelectedItem().toString());
            psVoedselpakket.setString(4, dateFormat.format(startdatumVeld.getDate()));
            
            psVoedselpakket.executeUpdate();
            
            this.dispose();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_toevoegKnopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aantalpersonenVeld;
    private javax.swing.JTextField adresVeld;
    private javax.swing.JTextField emailVeld;
    private javax.swing.JComboBox<Hulpverlener> hulpverlenerLijst;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private com.toedter.calendar.JDateChooser startdatumVeld;
    private javax.swing.JComboBox<String> statusVeld;
    private javax.swing.JTextField telefoonnummerVeld;
    private javax.swing.JButton toevoegKnop;
    private javax.swing.JComboBox<Uitgiftepunt> uitgiftepuntVeld;
    // End of variables declaration//GEN-END:variables
}
