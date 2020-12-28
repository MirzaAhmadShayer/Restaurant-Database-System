/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.DeleteOneItemButton;
import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.MainGUI;
import org.junit.Before;
/**
 *
 * @author SN PC
 */
public class DeleteOneItemButtonTest {
 
    MainGUI mgui;
    DeleteOneItemButton doib;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        doib = new DeleteOneItemButton();
    }
    /**
     * Test of actionPerformed method, of class DeleteOneItemButton.
     */
    @Test
    public void testActionPerformed() {
        doib.actionPerformed();
        System.out.println("Test Performed");
    }
    
}
