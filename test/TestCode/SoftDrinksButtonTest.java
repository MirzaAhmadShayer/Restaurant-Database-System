/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.SoftDrinksButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;

/**
 *
 * @author SN PC
 */
public class SoftDrinksButtonTest {
    
    Beverages b;
    SoftDrinksButton sdb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        sdb = new SoftDrinksButton();
    }

    /**
     * Test of actionPerformed method, of class SoftDrinksButton.
     */
    @Test
    public void testActionPerformed(){
        sdb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
