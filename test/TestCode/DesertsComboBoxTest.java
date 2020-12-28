/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.DesertsComboBox;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Deserts;
/**
 *
 * @author SN PC
 */
public class DesertsComboBoxTest {

    Deserts d;
    DesertsComboBox dcb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        d = new Deserts();
        dcb = new DesertsComboBox();
    }
    /**
     * Test of actionPerformed method, of class DesertsComboBox.
     */
    @Test
    public void testActionPerformed() {
        dcb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
