/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author Dave
 */
public class OverzichtsTabelModel {
    private Connection connection;
    private ResultSet overzichtsRowSet;
    private ResultSetMetaData metadata;
    private int aantalRijen;
    private int aantalKolommen;
    private String sqlQuery = "";

    public OverzichtsTabelModel(ResultSet resultSetArg)
            throws SQLException {

        this.overzichtsRowSet = resultSetArg;
        this.metadata = this.overzichtsRowSet.getMetaData();
        aantalKolommen = metadata.getColumnCount();

        // The column count starts from 1
        for (int i = 1; i <= aantalKolommen; i++) {
            String name = metadata.getColumnName(i);
            // Do stuff with name
        }

        // Retrieve the number of rows.
        this.overzichtsRowSet.beforeFirst();
        this.aantalRijen = 0;
        while (this.overzichtsRowSet.next()) {
            this.aantalRijen++;
        }
        this.overzichtsRowSet.beforeFirst();
    }
    
    
}
