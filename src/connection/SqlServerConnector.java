/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Werner
 */
public class SqlServerConnector {

    public static void verbindung() throws Exception {
        Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

        Connection m_Connection = DriverManager.getConnection(
                "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=dbBogen", "Werner", "werner");

        Statement m_Statement = m_Connection.createStatement();
        String query = "SELECT * FROM tblKlasse";

        ResultSet m_ResultSet = m_Statement.executeQuery(query);

        while (m_ResultSet.next()) {
            System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(2) + ", "
                    + m_ResultSet.getString(3));

        }
    }

//jdbc:sqlserver://localhost;user=MyUserName;password=*****;
//    var connectionUrl: String;
//public function getConnection(): Connection {
//        try {
//            if(connection == null or not connection.isValid(50)) {
//                connection = DriverManager.getConnection(connectionUrl);
//            }
//            return connection;
//        } catch (sqle: SQLException) {
//            println("getConnection {sqle}");
//            return null;
//        }
//    }
//
//    public function open(): Boolean {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            connectionUrl = "jdbc:sqlserver://{ip}:{port};databaseName={databaseName};";
//            connectionUrl += "user={user};";
//            connectionUrl += "password={password};";
//            connectionUrl += "selectMethod=direct";
//            println(connectionUrl);
//            connection = getConnection();
//            return connection != null
//        }catch (e: Exception) {
//            logger("open", "{e}");
//            return false;
//        }
//    };
}
