/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Controller.DiscountsButton;
import dragonRestaurant.Controller.DiscountsButton;
/**
 *
 * @author SN PC
 */
public class DiscountsButtonTest {
   
    DiscountsButton db;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        db = new DiscountsButton();
    }
    /**
     * Test of actionPerformed method, of class DiscountsButton.
     */
    @Test
    public void testActionPerformed() {
        db.actionPerformed();
        System.out.println("Test performed");
    }
    
}
