/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.holamundo.matricula.data.mycontexts;

import java.util.List;
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
public class AlumnoDataTest {
    
    public AlumnoDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class AlumnoData.
     */
    @Test
    public void testCreate() { //Hecho/Done
        System.out.println("create");
        Alumno alumno = new Alumno();
        alumno.setCodigo("201419090");
        
        AlumnoData instance = new AlumnoData();
        
        Alumno result = instance.create(alumno);
        assertTrue(result.getId()>0);
        
    }

    /**
     * Test of edit method, of class AlumnoData.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Alumno alumno = null;
        AlumnoData instance = new AlumnoData();
        Alumno expResult = null;
        Alumno result = instance.edit(alumno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AlumnoData.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        AlumnoData instance = new AlumnoData();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class AlumnoData.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        AlumnoData instance = new AlumnoData();
        Alumno expResult = null;
        Alumno result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListAll method, of class AlumnoData.
     */
    @Test
    public void testGetListAll() {
        System.out.println("getListAll");
        AlumnoData instance = new AlumnoData();
        List<Alumno> expResult = null;
        List<Alumno> result = instance.getListAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListByFilter method, of class AlumnoData.
     */
    @Test
    public void testGetListByFilter() {
        System.out.println("getListByFilter");
        String filter = "";
        AlumnoData instance = new AlumnoData();
        List<Alumno> expResult = null;
        List<Alumno> result = instance.getListByFilter(filter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
