package pruebasdesw.programastdd.programa1.model;

import pruebasdesw.programastdd.programa1.model.LinkedList;
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
casos de pruebas para la clase LinkedList
*/

public class LinkedListTest {
    
    public LinkedListTest() {
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
     * Prueba creacion de lista vacia, sin parametros en el constructor, ademas de los getters y setters
     */
    @Test
    public void testNewEmptyLinkedList() {
        System.out.println("*Prueba creacion de una nueva lista sin parametro en el constructor");
        LinkedList hl = new LinkedList();
        assertNull(hl.getHead());
    }
    /**
     * 2
     * Prueba creacion de una nueva lista con parametro en el constructor
     */
    @Test
    public void testNewLinkedList() {
        Node helperNode1 = new Node(5);
        LinkedList helperList = new LinkedList(helperNode1);
        assertEquals(5.0, helperList.getHead().getData(), 0.01);
    }
    
    /**
     * 3
     * Prueba para cambiar la cabeza de una lista
     */
    @Test
    public void testChangeHeadLinkedList(){
        Node helperNode1 = new Node(5);
        LinkedList helperList = new LinkedList(helperNode1);
        Node helperNode2 = new Node(8);
        helperList.setHead(helperNode2);
        assertEquals(8.0, helperList.getHead().getData(), 0.01);
    }
    
    /**
     * 4
     * Prueba para agregar un nodo al final en una lista vacia
     */
    @Test
    public void testAddNodeEmptyList() {
        System.out.println("* Prueba insertar nodo al final cuando la lista está vacía");
        LinkedList helperList = new LinkedList();
        Node helperNode = new Node(8);
        helperList.addNode(helperNode);
        assertEquals(8.0, helperList.getHead().getData(), 0.01);
    }
    
    /**
     * 5
     * Prueba para agregar un nodo al final en una lista no vacia
     */
    @Test
    public void testAddNodeNonEmptyList() {
        System.out.println("* Prueba insertar nodo al final cuando la lista no está vacía");
        LinkedList helperList = new LinkedList();
        Node helperNode1 = new Node(8);
        Node helperNode2 = new Node(5);
        Node helperNode3 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.addNode(helperNode3);
        Node helperNodeP = helperList.getHead();
        assertEquals(8.0, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(5.0, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(6.0, helperNodeP.getData(), 0.01);
    }
    
    
    /**
     * 6
     * Prueba para eliminar un nodo cuando la lista esta vacia
     */
    @Test
    public void testRemoveNodeNoData() {
        System.out.println("* Prueba eliminar nodo cuando la lista está vacía");
        LinkedList helperList = new LinkedList();
        helperList.removeNode(8);
    }
    
    /**
     * 7
     * Prueba para eliminar un nodo cuando el dato no esta en la lista
     */
    @Test
    public void testRemoveNodeNoDataFound() {
        System.out.println("* Prueba eliminar nodo cuando el dato no se encuentra");
        LinkedList helperList = new LinkedList(new Node(8));
        Node helperNode1 = new Node(5);
        Node helperNode2 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(7);
        Node helperNodeP = helperList.getHead();
        assertEquals(8, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(5, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(6, helperNodeP.getData(), 0.01);
    }
    
    /**
     * 8
     * Prueba para eliminar un nodo cuando este se encuentra al principio(cabeza de la lista)
     */
    @Test
    public void testRemoveNodeDataFoundHead() {
        System.out.println("* Prueba eliminar nodo cuando el dato se encuentra al principio de la lista");
        LinkedList helperList = new LinkedList(new Node(8));
        Node helperNode1 = new Node(5);
        Node helperNode2 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(8);
        Node helperNodeP = helperList.getHead();
        assertEquals(5, helperNodeP.getData(), 0.01);
    }
    
    /**
     * 9
     * Prueba para eliminar un nodo cuando se encuentra al principio 
     * y solo hay un nodo en la lista
     */
    @Test
    public void testRemoveNodeDataFoundOnlyHead() {
        System.out.println("* Prueba eliminar nodo cuando el dato se encuentra al principio de la lista y solo hay un nodo en la lista");
        LinkedList helperList = new LinkedList(new Node(8));
        helperList.removeNode(8);
        Node helperNodeP = helperList.getHead();
        assertNull(helperNodeP);
    }
    
    /**
     * 10
     * Prueba para eliminar un nodo cuando se encuentra en cualquier lugar
     */
    @Test
    public void testRemoveNodeDataFound() {
        System.out.println("* Prueba eliminar nodo cuando el dato se encuentra en cualquier lugar de la lista");
        LinkedList helperList = new LinkedList(new Node(8));
        Node helperNode1 = new Node(5);
        Node helperNode2 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(5);
        Node helperNodeP = helperList.getHead();
        assertEquals(8.0, helperNodeP.getData(), 0.01);
        assertEquals(6.0, helperNodeP.getNext().getData(), 0.01);
    }
    
}
