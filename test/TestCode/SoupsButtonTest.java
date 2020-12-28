/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.SoupsButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Appetizers;

/**
 *
 * @author SN PC
 */
public class SoupsButtonTest {
    
    Appetizers a;
    SoupsButton sb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        a = new Appetizers();
        sb = new SoupsButton();
    }

    /**
     * Test of actionPerformed method, of class SoupsButton.
     */
    @Test
    public void testActionPerformed() {
        sb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
