/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.desertsSelectButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Deserts;
/**
 *
 * @author SN PC
 */
public class desertsSelectButtonTest {
    
    Deserts d;
    desertsSelectButton dsb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        d = new Deserts();
        dsb = new desertsSelectButton();
    }

    /**
     * Test of actionPerformed method, of class desertsSelectButton.
     */
    @Test
    public void testActionPerformed() {
        dsb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
