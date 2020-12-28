/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.FruitJuicesButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Beverages;
/**
 *
 * @author SN PC
 */
public class FruitJuicesButtonTest {
    
    Beverages b;
    FruitJuicesButton fjb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        b = new Beverages();
        fjb = new FruitJuicesButton();
    }

    /**
     * Test of actionPerformed method, of class FruitJuicesButton.
     */
    @Test
    public void testActionPerformed() {
        fjb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
