/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.BiscuitsButton;
import org.junit.Test;
import static org.junit.Assert.*;
import dragonRestaurant.Model.Extras;
import org.junit.Before;
/**
 *
 * @author SN PC
 */
public class BiscuitsButtonTest {
    
     Extras e;
     BiscuitsButton bb;
     
    @Before
    public void setUp() throws Exception{
       System.out.println("Set up");
       e = new Extras();
       bb = new BiscuitsButton();
    }
    
    /**
     * Test of actionPerformed method, of class BiscuitsButton.
     */
    @Test
    public void testActionPerformed() {
        bb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
