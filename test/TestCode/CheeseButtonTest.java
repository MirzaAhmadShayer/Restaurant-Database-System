/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.CheeseButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Extras;

/**
 *
 * @author SN PC
 */
public class CheeseButtonTest {

    Extras e;
    CheeseButton cb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        e = new Extras();
        cb = new CheeseButton();
    }
    /**
     * Test of actionPerformed method, of class CheeseButton.
     */
    @Test
    public void testActionPerformed() {
        cb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
