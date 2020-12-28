/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.ExitButton;
import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.MainGUI;
import org.junit.Before;

/**
 *
 * @author SN PC
 */
public class ExitButtonTest {
  
    MainGUI mgui;
    ExitButton eb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mgui = new MainGUI();
        eb = new ExitButton();
    }
    /**
     * Test of actionPerformed method, of class ExitButton.
     */
    @Test
    public void testActionPerformed() {
        eb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
