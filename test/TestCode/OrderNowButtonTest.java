/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.OrderNowButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainGUI;

/**
 *
 * @author SN PC
 */
public class OrderNowButtonTest {
    
    MainGUI mgui;
    OrderNowButton onb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        onb = new OrderNowButton();
    }

    /**
     * Test of actionPerformed method, of class OrderNowButton.
     */
    @Test
    public void testActionPerformed() {
        onb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
