/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.holamundo.matricula.business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import upeu.holamundo.matricula.data.entities.Alumno;

/**
 *
 * @author Asullom
 */
public class AlumnoBusinessTest {
    
    AlumnoBusiness instance = new AlumnoBusiness();
    
    public AlumnoBusinessTest() {
    }
   
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class AlumnoBusiness.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Alumno alumno = new Alumno();
        alumno.setCodigo("A002B");
   
        Alumno result = instance.create(alumno);
        Alumno x = result;
        assertTrue(result.getId()>0);
        
    }
    
}
