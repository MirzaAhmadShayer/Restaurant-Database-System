/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.specialsSelectedButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Specials;

/**
 *
 * @author SN PC
 */
public class specialsSelectedButtonTest {
    
    Specials s;
    specialsSelectedButton ssb;
    
    @Before
    public void setUp() throws Exception {
        System.out.println("Set up");
        s = new Specials();
        ssb = new specialsSelectedButton();
    }

    /**
     * Test of actionPerformed method, of class specialsSelectedButton.
     */
    @Test
    public void testActionPerformed() {
        ssb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
