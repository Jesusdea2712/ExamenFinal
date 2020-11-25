/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import domain.Uacam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jesus
 */
public class TestOperaciones {

    public TestOperaciones() {

    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    Uacam uacam = new Uacam();
    
    @Test
    public void testHash1(){
        assertEquals(2,uacam.hashSimple("58748"));  
    }
    
    @Test
    public void testHash2(){
        assertEquals(1,uacam.hashSimple("58780"));  
    }
    
    @Test
    public void testHash3(){
        assertEquals(1,uacam.hashSimple("58770"));  
    }
    
    @Test
    public void testHash4Mio(){
        assertEquals(1,uacam.hashSimple("58752"));  
    }
    
    @Test
    public void testHash5(){
        assertEquals(1,uacam.hashSimple("58807"));  
    }
    
    @Test
    public void testHash6(){
        assertEquals(1,uacam.hashSimple("51695"));  
    }
    
    
//    @Test
//    public void testSumaCaracteres1(){
//        assertEquals("Reprobado",uacam.sumaCaracteres("58748"));  
//    }
//    
//    @Test
//    public void testSumaCaracteres2(){
//        assertEquals("Excelente",uacam.sumaCaracteres("58780"));  
//    }
//    
//    @Test
//    public void testSumaCaracteres3(){
//        assertEquals("Aprobado",uacam.sumaCaracteres("58770"));  
//    }
//    
//    @Test
//    public void testSumaCaracteres4Mio(){
//        assertEquals("Aprobado",uacam.sumaCaracteres("58752"));  
//    }
//    
//    @Test
//    public void testSumaCaracteres5(){
//        assertEquals("Excelente",uacam.sumaCaracteres("58807"));  
//    }
//    
//    @Test
//    public void testSumaCaracteres6(){
//        assertEquals("Aprobado",uacam.sumaCaracteres("51695"));  
//    }
}
