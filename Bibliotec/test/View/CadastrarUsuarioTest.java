/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabio
 */
public class CadastrarUsuarioTest {
    
    public CadastrarUsuarioTest() {
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
     * Test of main method, of class CadastrarUsuario.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CadastrarUsuario.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CPF method, of class CadastrarUsuario.
     */
    @Test
    public void testCPF() {
        System.out.println("CPF");
        String strCpf = "07633596961";
        boolean expResult = true;
        boolean result = CadastrarUsuario.CPF(strCpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCPFInvalid() {
        System.out.println("CPF INvalido");
        String strCpf = "07633596962";
        boolean expResult = false;
        boolean result = CadastrarUsuario.CPF(strCpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validEmail method, of class CadastrarUsuario.
     */
    @Test
    public void testValidEmail() {
        System.out.println("validEmail");
        String email = "fabio@gmail.com";
        CadastrarUsuario instance = new CadastrarUsuario();
        boolean expResult = true;
        boolean result = instance.validEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEmailInvalid() {
        System.out.println("validEmailInvalido");
        String email = "fabio@@gmail.com";
        CadastrarUsuario instance = new CadastrarUsuario();
        boolean expResult = false;
        boolean result = instance.validEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}