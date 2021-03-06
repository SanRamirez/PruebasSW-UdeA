/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasdesw.programastdd.programa1.model;

import pruebasdesw.programastdd.programa1.model.Node;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author sebastian.londonoa@udea.edu.co
 * @author johan.marinb@udea.edu.co
 * @author santiago.ramirez9@udea.edu.co
 */

/*
casos de pruebas para la clase Node
*/

public class NodeTest {
    
    public NodeTest() {
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
     * 1
     * Prueba creación de nodo, con argumentos vacíos, con getters y setters y valores enteros y de tipo double
    */
    @Test
    public void testNewEmptyNode() {
        System.out.println("* Prueba creación de nodo, con argumentos vacíos, con getter y setter y valores enteros y de tipo double");
        Node h1 = new Node();
        assertEquals(0.0, h1.getData(), 0.01);
    }
    
    /**
     * 2
     * Prueba creacion de un nodo con parametro en el constructor
    */
    @Test
    public void testNewNode() {
        Node h2 = new Node(5);
        assertEquals(5.0, h2.getData(), 0.01);
    }
    
    /**
     * 3
     * Prueba para cambiar el dato de un nodo
    */
    @Test
    public void testChangeDataNode() {
        Node h2 = new Node(5);
        h2.setData(6);
        assertEquals(6.0, h2.getData(), 0.01);
    }
    
    /**
     * 4
     * Prueba creacion de nodo con dato de tipo double
    */
    @Test
    public void testNewNodeDoubleData() {
        Node h3 = new Node(4.8);
        assertEquals(4.8, h3.getData(), 0.01);
    }
    
    /**
     * 5
     * Prueba obtencion de nodo siguiente cuando es nulo
    */
    @Test
    public void testNext() {
        System.out.println("* Prueba de obtención de nodo siguiente");
        Node helper = new Node(5);
        assertNull(helper.getNext());
    }   
    
    /**
     * 6
     * Prueba obtencion de nodo siguiente cuando no es nulo
    */
    @Test
    public void textNextNoNull() {
        System.out.println("* Prueba agg nodo siguiente no nulo");
        Node helper = new Node(5);
        Node helperNext = new Node(8);
        helper.setNext(helperNext);
        assertEquals(8.0, helper.getNext().getData(), 0.01);
    }
    
}
