/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class NEmpleadoTest {
    
    public NEmpleadoTest() {
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
     * Test of GuardarEmpleado method, of class NEmpleado.
     */
    @Test
    public void testGuardarEmpleado() {
        System.out.println("GuardarEmpleado");
        int ID = 6;
        int CI = 56984779;
        String NOMBRE = "juaquin chumasero";
        int TELEFONO = 110;
        String DIRECCION = "barrio la cuchilla";
        String DESCRIPCION = "cliente antiguo";
        NEmpleado instance = new NEmpleado();
        boolean expResult = true;
        boolean result = instance.GuardarEmpleado(ID, CI, NOMBRE, TELEFONO, DIRECCION, DESCRIPCION);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result){
         fail("The test case is a prototype.");   
        }
        
        
    }

    /**
     * Test of ModificarEmpleado method, of class NEmpleado.
     */
    @Test
    public void testModificarEmpleado() {
        System.out.println("ModificarEmpleado");
        int ID = 2;
        int CI = 5021000;
        String NOMBRE = "pedro update";
        int TELEFONO = 10254;
        String DIRECCION = "updte test";
        String DESCRIPCION = "numero";
        NEmpleado instance = new NEmpleado();
        boolean expResult = true;
        boolean result = instance.ModificarEmpleado(ID, CI, NOMBRE, TELEFONO, DIRECCION, DESCRIPCION);
        assertEquals(expResult, result);
         if(expResult!=result){
         fail("The test case is a prototype.");   
        }
    }

    /**
     * Test of EliminarEmpleado method, of class NEmpleado.
     */
    @Test
    public void testEliminarEmpleado() {
        System.out.println("EliminarEmpleado");
        int ID = 3;
        NEmpleado instance = new NEmpleado();
        boolean expResult = true;
        boolean result = instance.EliminarEmpleado(ID);
        assertEquals(expResult, result);
        if(expResult!=result){
         fail("The test case is a prototype.");   
        }
    }

    /**
     * Test of getEmpleados method, of class NEmpleado.
     */
   /* @Test
    public void testGetEmpleados() {
        System.out.println("getEmpleados");
        NEmpleado instance = new NEmpleado();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getEmpleados();
        assertEquals(expResult, result);
        if(expResult==result){
         fail("The test case is a prototype.");   
        }
    }*/
}
