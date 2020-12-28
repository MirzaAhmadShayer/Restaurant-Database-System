/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.ResetFullOrderButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainGUI;

/**
 *
 * @author SN PC
 */
public class ResetFullOrderButtonTest {
    
    MainGUI mgui;
    ResetFullOrderButton rfob;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        rfob = new ResetFullOrderButton();
    }

    /**
     * Test of actionPerformed method, of class ResetFullOrderButton.
     */
    @Test
    public void testActionPerformed() {
        rfob.actionPerformed();
        System.out.println("Test performed");
    }
    
}
