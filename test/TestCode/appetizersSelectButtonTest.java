/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.appetizersSelectButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Appetizers;

/**
 *
 * @author SN PC
 */
public class appetizersSelectButtonTest {
    
    Appetizers a;
    appetizersSelectButton asb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        a = new Appetizers();
        asb = new appetizersSelectButton();
    }

    /**
     * Test of actionPerformed method, of class appetizersSelectButton.
     */
    @Test
    public void testActionPerformed() {
        asb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
