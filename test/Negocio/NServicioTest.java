/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dato.Conexion;
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
public class NServicioTest {
    
    public NServicioTest() {
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
     * Test of GuardarServicio method, of class NServicio.
     */
    @Test
    public void testGuardarServicio1() {
        Conexion con = Conexion.getInstncia();
        System.out.println("GuardarServicio");
        int ID = 55;
        String NOMBRE = "cambio de filtro";
        String DESCRIPCION = "se realiza un cambio del filtro de aire";
        double PRECIO = 75;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.GuardarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        if(result==true){
        boolean resultelim = instance.EliminarServicio(ID);
       }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
        @Test
    public void testGuardarServicio2() {
        Conexion con = Conexion.getInstncia();
        System.out.println("GuardarServicio");
        int ID = 56;
        String NOMBRE = "cambio de caja";
        String DESCRIPCION = "se realiza un cambio de caja";
        double PRECIO = 75;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.GuardarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        if(result==true){
        boolean resultelim = instance.EliminarServicio(ID);
       }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
        
        
            @Test
    public void testGuardarServicio3() {
        Conexion con = Conexion.getInstncia();
        System.out.println("GuardarServicio");
        int ID = 57;
        String NOMBRE = "lavado de asientos";
        String DESCRIPCION = "se realiza un lavado de asientos";
        double PRECIO = 75;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.GuardarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        if(result==true){
        boolean resultelim = instance.EliminarServicio(ID);
       }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
            
            
            
                @Test
    public void testGuardarServicio4() {
        Conexion con = Conexion.getInstncia();
        System.out.println("GuardarServicio");
        int ID = 58;
        String NOMBRE = "pulido extrafino";
        String DESCRIPCION = "se realiza un pulido de primera calidad";
        double PRECIO = 75;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.GuardarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        if(result==true){
        boolean resultelim = instance.EliminarServicio(ID);
       }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of ModificarServicio method, of class NServicio.
     */
    @Test
    public void testModificarServicio1() {
        System.out.println("ModificarServicio");
        int ID = 3;
        String NOMBRE = "Lavado";
        String DESCRIPCION = "Lavado simple al vehiculo modificado";
        double PRECIO = 30;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.ModificarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        
       
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
        @Test
    public void testModificarServicio2() {
        System.out.println("ModificarServicio");
        int ID = 5;
        String NOMBRE = "Aspirado";
        String DESCRIPCION = "Aspirado simple al vehiculo modificado";
        double PRECIO = 25;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.ModificarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        
       
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
        
            @Test
    public void testModificarServicio3() {
        System.out.println("ModificarServicio");
        int ID = 6;
        String NOMBRE = "Lavado y aspirado";
        String DESCRIPCION = "lavado y aspirado al vehiculo modificado";
        double PRECIO = 50;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.ModificarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        
       
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
            
            
                @Test
    public void testModificarServicio4() {
        System.out.println("ModificarServicio");
        int ID = 7;
        String NOMBRE = "cambio de filtro";
        String DESCRIPCION = "se realiza un cambio de filtro modificado";
        double PRECIO = 75;
        NServicio instance = new NServicio();
        boolean expResult = true;
        boolean result = instance.ModificarServicio(ID, NOMBRE, DESCRIPCION, PRECIO);
        assertEquals(expResult, result);
        
        
       
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarServicio method, of class NServicio.
     */
    @Test
    public void testEliminarServicio() {
        System.out.println("EliminarServicio");
        int ID = 222;
        NServicio instance = new NServicio();
        boolean expResult = false;
        boolean result = instance.EliminarServicio(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getServicio method, of class NServicio.
     */
//    @Test
//    public void testGetServicio() {
//        System.out.println("getServicio");
//        NServicio instance = new NServicio();
//        DefaultTableModel expResult = null;
//        DefaultTableModel result = instance.getServicio();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
}