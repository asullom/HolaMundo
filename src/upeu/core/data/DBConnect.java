/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.core.data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asullom
 */
public class DBConnect {

    public Connection getConnection()  throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webauth", "root", "");
        conn.close();
        return conn;
    }
}
