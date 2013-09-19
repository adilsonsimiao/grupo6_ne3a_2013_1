/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        instance.setId(2);
        int expResult = 2;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 2;
        Usuario instance = new Usuario();
        instance.setId(id);
        assertEquals(2, instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        instance.setEmail("fabio@gmail.com");
        String expResult = "fabio@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "fabio@gmail.com";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        assertEquals(instance.getEmail(), email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Usuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Usuario instance = new Usuario();
        instance.setNome("fabio");
        String expResult = "fabio";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "fabio";
        Usuario instance = new Usuario();
        instance.setNome(nome);
        assertEquals(nome, instance.getEmail());
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Usuario.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Usuario instance = new Usuario();
        String expResult = "07633596961";
        instance.setCpf("07633596961");
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Usuario.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "07633596961";
        Usuario instance = new Usuario();
        instance.setCpf(cpf);
        assertEquals(instance.getCpf(), cpf);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Usuario.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Usuario instance = new Usuario();
        Endereco e = new Endereco();
        Endereco expResult = e;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Usuario.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereco endereco = null;
        Usuario instance = new Usuario();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Usuario.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Usuario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Usuario instance = new Usuario();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRg method, of class Usuario.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getRg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRg method, of class Usuario.
     */
    @Test
    public void testSetRg() {
        System.out.println("setRg");
        String rg = "";
        Usuario instance = new Usuario();
        instance.setRg(rg);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}