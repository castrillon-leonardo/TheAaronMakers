/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.CityOfAaron.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buyLand method, of class Game.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        
        System.out.println("\tTest case 1");
        double acres = 105.0;
        double price = 22.0;
        double wheatInStorage = 2500.0;
        double currentPeople = 30.0;
        double expResult = 105.0;
        double result = Game.buyLand(acres, price, wheatInStorage, currentPeople);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\tTest case 2");
        double acres = 100.0;
        double price = 5.0;
        double wheatInStorage = 800.0;
        double currentPeople = 95.0;
        double expResult = 1.05.0;
        double result = Game.buyLand(acres, price, wheatInStorage, currentPeople);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\tTest case 3");
        double acres = 230.0;
        double price = 25.0;
        double wheatInStorage = 450.0;
        double currentPeople = 50.0;
        double expResult = 4.6.0;
        double result = Game.buyLand(acres, price, wheatInStorage, currentPeople);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\tTest case 4");
        double acres = 1200.0;
        double price = 25.0;
        double wheatInStorage = 42000.0;
        double currentPeople = 80.0;
        double expResult = 15.0;
        double result = Game.buyLand(acres, price, wheatInStorage, currentPeople);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\tTest case 5");
        double acres = 100.0;
        double price = 27.0;
        double wheatInStorage = 2800.0;
        double currentPeople = 95.0;
        double expResult = 1.05.0;
        double result = Game.buyLand(acres, price, wheatInStorage, currentPeople);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\tTest case 6");
        double acres = 205.0;
        double price = 20.0;
        double wheatInStorage = 4100.0;
        double currentPeople = 30.0;
        double expResult = 6.8.0;
        double result = Game.buyLand(acres, price, wheatInStorage, currentPeople);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\tTest case 7");
        double acres = 150.0;
        double price = 22.0;
        double wheatInStorage = 5000.0;
        double currentPeople = 15.0;
        double expResult = 10.0;
        double result = Game.buyLand(acres, price, wheatInStorage, currentPeople);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }
    
}
