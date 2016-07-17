/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dato;

import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class DServicioTest {
    
    public DServicioTest() {
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
     * Test of getID method, of class DServicio.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        DServicio instance = new DServicio();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class DServicio.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        DServicio instance = new DServicio();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCon method, of class DServicio.
     */
    @Test
    public void testGetCon() {
        System.out.println("getCon");
        DServicio instance = new DServicio();
        Conexion expResult = null;
        Conexion result = instance.getCon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCon method, of class DServicio.
     */
    @Test
    public void testSetCon() {
        System.out.println("setCon");
        Conexion con = null;
        DServicio instance = new DServicio();
        instance.setCon(con);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPRECIO method, of class DServicio.
     */
    @Test
    public void testGetPRECIO() {
        System.out.println("getPRECIO");
        DServicio instance = new DServicio();
        double expResult = 0.0;
        double result = instance.getPRECIO();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPRECIO method, of class DServicio.
     */
    @Test
    public void testSetPRECIO() {
        System.out.println("setPRECIO");
        double PRECIO = 0.0;
        DServicio instance = new DServicio();
        instance.setPRECIO(PRECIO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNOMBRE method, of class DServicio.
     */
    @Test
    public void testGetNOMBRE() {
        System.out.println("getNOMBRE");
        DServicio instance = new DServicio();
        String expResult = "";
        String result = instance.getNOMBRE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNOMBRE method, of class DServicio.
     */
    @Test
    public void testSetNOMBRE() {
        System.out.println("setNOMBRE");
        String NOMBRE = "";
        DServicio instance = new DServicio();
        instance.setNOMBRE(NOMBRE);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDESCRIPCION method, of class DServicio.
     */
    @Test
    public void testGetDESCRIPCION() {
        System.out.println("getDESCRIPCION");
        DServicio instance = new DServicio();
        String expResult = "";
        String result = instance.getDESCRIPCION();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDESCRIPCION method, of class DServicio.
     */
    @Test
    public void testSetDESCRIPCION() {
        System.out.println("setDESCRIPCION");
        String DESCRIPCION = "";
        DServicio instance = new DServicio();
        instance.setDESCRIPCION(DESCRIPCION);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarServicio method, of class DServicio.
     */
    @Test
    public void testGuardarServicio() {
        System.out.println("GuardarServicio");
        DServicio instance = new DServicio();
        Boolean expResult = null;
        Boolean result = instance.GuardarServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarServicio method, of class DServicio.
     */
    @Test
    public void testModificarServicio() {
        System.out.println("ModificarServicio");
        DServicio instance = new DServicio();
        Boolean expResult = null;
        Boolean result = instance.ModificarServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarServicio method, of class DServicio.
     */
    @Test
    public void testEliminarServicio() {
        System.out.println("EliminarServicio");
        DServicio instance = new DServicio();
        boolean expResult = false;
        boolean result = instance.EliminarServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicio method, of class DServicio.
     */
    @Test
    public void testGetServicio() {
        System.out.println("getServicio");
        DServicio instance = new DServicio();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}