/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.core.data;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asullom
 */
public class DBConnectTest {
    
    public DBConnectTest() {
    }
    

    /**
     * Test of getConnection method, of class DBConnect.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        DBConnect instance = new DBConnect();
        
        Connection result = instance.getConnection();
        
        Connection expResult = null;
        assertNotNull(result);
    }
    
}
