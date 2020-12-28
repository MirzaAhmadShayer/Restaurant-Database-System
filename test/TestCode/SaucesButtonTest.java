/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.SaucesButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Extras;
/**
 *
 * @author SN PC
 */
public class SaucesButtonTest {
    
    Extras e;
    SaucesButton sb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        e = new Extras();
        sb = new SaucesButton();
    }

    /**
     * Test of actionPerformed method, of class SaucesButton.
     */
    @Test
    public void testActionPerformed() {
        sb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
