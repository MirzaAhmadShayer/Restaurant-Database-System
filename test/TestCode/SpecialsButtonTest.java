/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.SpecialsButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.Specials;

/**
 *
 * @author SN PC
 */
public class SpecialsButtonTest {
    
    Specials s;
    SpecialsButton sb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        s = new Specials();
        sb = new SpecialsButton();
    }

    /**
     * Test of actionPerformed method, of class SpecialsButton.
     */
    @Test
    public void testActionPerformed() {
        sb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
