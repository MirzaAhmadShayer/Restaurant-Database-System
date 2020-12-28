/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.extrasSelectButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Extras;

/**
 *
 * @author SN PC
 */
public class extrasSelectButtonTest {
    
    Extras e;
    extrasSelectButton esb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        e = new Extras();
        esb = new extrasSelectButton();
    }

    /**
     * Test of actionPerformed method, of class extrasSelectButton.
     */
    @Test
    public void testActionPerformed() {
        esb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
