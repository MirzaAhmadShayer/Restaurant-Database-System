/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.HomeDeliveryButton;
import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.MainGUI;
import org.junit.Before;
/**
 *
 * @author SN PC
 */
public class HomeDeliveryButtonTest {
    
    public HomeDeliveryButtonTest() {
    }
    
    MainGUI mgui;
    HomeDeliveryButton hdb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        hdb = new HomeDeliveryButton();
    }
    /**
     * Test of actionPerformed method, of class HomeDeliveryButton.
     */
    @Test
    public void testActionPerformed() {
        hdb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
