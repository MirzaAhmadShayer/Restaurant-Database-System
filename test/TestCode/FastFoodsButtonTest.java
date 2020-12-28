/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.FastFoodsButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Appetizers;
/**
 *
 * @author SN PC
 */
public class FastFoodsButtonTest {
    
    Appetizers a;
    FastFoodsButton ffb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        a = new Appetizers();
        ffb = new FastFoodsButton();
    }

    /**
     * Test of actionPerformed method, of class FastFoodsButton.
     */
    @Test
    public void testActionPerformed() {
        ffb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
