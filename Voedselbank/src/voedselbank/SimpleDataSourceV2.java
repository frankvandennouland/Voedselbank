package voedselbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A simple data source for getting database connections.
 */
public class SimpleDataSourceV2 {

    private static String dbserver;
    private static String database;
    private static String username;
    private static String password;
    private static DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    private static Connection activeConn;

    /**
     * Initializes the data source. Checks if MySQL Driver is found contains the
     * database driver, Fill variabels dbserver, database, username, and
     * password
     *
     * TODO get variabels from a configuration file!!! or credentials manager
     * Hardcoded is bad code!!!
     */
    private static void init() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        dbserver = "meru.hhs.nl";
        database = "13114751";
        username = "13114751";
        password = "ihah7Aeroh";

    }

    /**
     * Gets a connection to the database.
     *
     * @return the database connection
     */
    public static Connection getConnection() throws SQLException {
        if (activeConn == null) {
            init();
            activeConn = createConnection();
        } else if (!activeConn.isValid(0)) {
            activeConn = createConnection();
        }

        return activeConn;

    }

    private static Connection createConnection() throws SQLException {

        String connectionString = "jdbc:mysql://" + dbserver + "/" + database + "?"
                + "user=" + username + "&password=" + password;

        return DriverManager.getConnection(connectionString);
    }

    public static void closeConnection() {
        if (activeConn != null) {
            try {
                activeConn.close();
            } catch (SQLException e) {
                //to catch and do nothing is the best option
                //don't know how to recover from this exception

            } finally {
                activeConn = null;
            }

        }

    }
    
    public static void Connect_Uitgiftepunt(String uitgiftepunt, Client client, Voedselpakket voedselpakket) {
         try {
            int ID_uitgiftepunt_res = 0;
            Connection connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT * FROM Voedselpakket v join Uitgiftepunt u on u.ID_uitgiftepunt = v.ID_uitgiftepunt where ID_cliënt = " + client.getID());
            ResultSet rs = prestatement.executeQuery();
            
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Uitgiftepunt where naam = '" + uitgiftepunt + "'");
            ResultSet res = ps.executeQuery();
            
            while (res.next()) {
                ID_uitgiftepunt_res = res.getInt("ID_uitgiftepunt");
            }
     
            if (!rs.next() && ID_uitgiftepunt_res != 0){
                prestatement = connection.prepareStatement("Insert into Voedselpakket (ID_Cliënt, ID_uitgiftepunt, datum, soort) Values (?,?,?,?)");
                
                prestatement.setInt(1, client.getID());
                prestatement.setInt(2, ID_uitgiftepunt_res);
                prestatement.setString(3, dateFormat.format(voedselpakket.getDatum()));
                prestatement.setString(4, voedselpakket.getSoort());
                prestatement.executeUpdate();        
                System.out.println("insert");
            }
            
            while (rs.next()) {
                boolean hetzelfde = false;
                int ID_uitgiftepunt = rs.getInt("ID_uitgiftepunt");
                String naam = rs.getString("naam");
                String adres = rs.getString("adres");
                String postcode = rs.getString("postcode");
                String plaats = rs.getString("plaatsnaam");
                int capaciteit = rs.getInt("capaciteit");
                Date datum = rs.getDate("datum");
                String soort = rs.getString("soort");
                
                Uitgiftepunt dbUitgiftepunt = new Uitgiftepunt(ID_uitgiftepunt, naam, adres, postcode, plaats, capaciteit);
  
                if(ID_uitgiftepunt == dbUitgiftepunt.getUitgiftepunt_ID() &&
                   voedselpakket.getSoort().equals(soort) &&
                   voedselpakket.getDatum().equals(datum)) {
                        hetzelfde = true;
                }
                
               if(hetzelfde == false) {
                    prestatement = connection.prepareStatement("Update Voedselpakket set ID_uitgiftepunt = ?, datum = ?, soort = ? where ID_cliënt = " + client.getID());
                    
                    prestatement.setInt(1, dbUitgiftepunt.getUitgiftepunt_ID());
                    prestatement.setString(2, dateFormat.format(voedselpakket.getDatum()));
                    prestatement.setString(3, voedselpakket.getSoort());
                    
                    prestatement.executeUpdate();        
                    System.out.println("update");
               }
               
            } 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void Connect_Hulpverlener(Client client, Intake intake) {
         try {
            int ID_hulpverlener_res = 0;
            Connection connection = SimpleDataSourceV2.getConnection();
            PreparedStatement prestatement = connection.prepareStatement("SELECT * FROM Intake i join Hulpverlener h on i.ID_hulpverlener = h.ID_hulpverlener where ID_cliënt = " + client.getID());
            ResultSet rs = prestatement.executeQuery();
            
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Hulpverlener where naam = '" + intake.getHulpverlener() + "'");
            ResultSet res = ps.executeQuery();
            
            while (res.next()) {
                ID_hulpverlener_res = res.getInt("ID_hulpverlener");
                System.out.println(intake.getHulpverlener());
            }
            
            if (ID_hulpverlener_res == 0) {
                Date StandaardDatum = new Date(0);
                
                prestatement = connection.prepareStatement("Insert into Hulpverlener (naam, geboortedatum, telefoonnummer) Values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
                
                prestatement.setString(1, intake.getHulpverlener());
                prestatement.setString(2, dateFormat.format(StandaardDatum));
                prestatement.setString(3, "012345678");
                prestatement.executeUpdate();  
                
                ResultSet rsInsert = prestatement.getGeneratedKeys();
                
                while(rsInsert.next()) {
                   ID_hulpverlener_res = ((Number) rsInsert.getObject(1)).intValue();
                   System.out.println(ID_hulpverlener_res);
                }
            }
     
            if (!rs.next() && ID_hulpverlener_res != 0){
                prestatement = connection.prepareStatement("Insert into Intake (ID_Cliënt, ID_hulpverlener, datum, startdatum_uitgifte, datum_herintake, datum_stopzetting, reden_stopzetting) Values (?,?,?,?,?,?,?)");
                
                prestatement.setInt(1, client.getID());
                prestatement.setInt(2, ID_hulpverlener_res);
                prestatement.setString(3, dateFormat.format(intake.getDatum()));
                prestatement.setString(4, dateFormat.format(intake.getDatumUitgifte()));
                prestatement.setString(5, dateFormat.format(intake.getDatumHerintake()));
                prestatement.setString(6, dateFormat.format(intake.getDatumStopzetting()));
                prestatement.setString(7, intake.getRedenStopzetting());
                prestatement.executeUpdate();        
            }
            
            while (rs.next()) {
                boolean hetzelfde = false;
                int ID_hulpverlener = rs.getInt("ID_hulpverlener");
                Date datum = rs.getDate("datum");
                Date datumUitgifte = rs.getDate("startdatum_uitgifte");
                Date datumHerintake = rs.getDate("datum_herintake");
                Date datumStopzetting = rs.getDate("datum_stopzetting");
                String RedenStopzetting = rs.getString("reden_stopzetting");    
  
                if(ID_hulpverlener == intake.getHulpverlerner_ID() &&
                   intake.getDatum().equals(datum) &&
                   intake.getDatumUitgifte().equals(datumUitgifte) &&
                   intake.getDatumHerintake().equals(datumHerintake) &&
                   intake.getDatumHerintake().equals(datumStopzetting) &&
                   intake.getRedenStopzetting().equals(RedenStopzetting)) {
                        hetzelfde = true;
                }
                
               if(hetzelfde == false) {
                    prestatement = connection.prepareStatement("Update Intake set ID_hulpverlener = ?, datum = ?, startdatum_uitgifte = ?, datum_herintake = ?, datum_stopzetting = ?, reden_stopzetting = ? where ID_cliënt = " + client.getID());
                    
                    prestatement.setInt(1, client.getID());
                    prestatement.setInt(2, ID_hulpverlener_res);
                    prestatement.setString(3, dateFormat.format(intake.getDatum()));
                    prestatement.setString(6, dateFormat.format(intake.getDatumUitgifte()));
                    prestatement.setString(4, dateFormat.format(intake.getDatumHerintake()));
                    prestatement.setString(5, dateFormat.format(intake.getDatumStopzetting()));
                    prestatement.setString(6, intake.getRedenStopzetting());
                    prestatement.executeUpdate(); 
               }
               
            } 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
