/*
 classe para testes da classe Numeros.java usando Junit e suas anotações
Prof. Fabio N. Miranda 
 */
package matematica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabionmiranda
 */
public class NumerosTest {

    //atributo numero da classe Numeros()
    private Numeros numero;
    
    public NumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() //metodo que toda vez que a classe NumerosTest for executada ele faz isso primeiro.
    {
        //instanciar objeto numero da classe Numeros();
        numero = new Numeros();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of numeroPar method, of class Numeros.
     */
    @Test
    public void testNumeroPar() {
        //assertEquals para verificar se os dois parametros são verdadeiros
        // testar se verdadeiro = (true) se o numero 8 for par e false se não for
        assertEquals(true, numero.numeroPar(8));
        
    }

    /**
     * Testar o método areaQuadrado da classe Numeros()
     */
    @Test
    public void testAreaQuadrado() {
        //testar se o quadrado de 2 é realmente 4
        assertEquals(16, numero.areaQuadrado(4));
        
    }

    /**
     * Test of numeroDivisivel method, of class Numeros.
     */
    @Test
    public void testNumeroDivisivel() {
        // verificar se realmente é verdadeiro (assertTrue) se o 4 é divisivel por 2
       assertTrue(numero.numeroDivisivel(4, 2));
    }
    
}
