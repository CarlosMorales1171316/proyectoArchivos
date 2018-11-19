/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivana
 */
public class ModificarAdminTest {
    
    public ModificarAdminTest() {
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
     * Test of AbrirArchivo method, of class ModificarAdmin.
     */
    @Test
    public void testAbrirArchivo() {
        System.out.println("AbrirArchivo");
        File archivo = null;
        ModificarAdmin instance = new ModificarAdmin();
        byte[] expResult = null;
        byte[] result = instance.AbrirArchivo(archivo);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarArchivo method, of class ModificarAdmin.
     */
    @Test
    public void testGuardarArchivo() {
        System.out.println("GuardarArchivo");
        File archivo = null;
        byte[] Imagen = null;
        ModificarAdmin instance = new ModificarAdmin();
        String expResult = "";
        String result = instance.GuardarArchivo(archivo, Imagen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ModificarAdmin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ModificarAdmin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
