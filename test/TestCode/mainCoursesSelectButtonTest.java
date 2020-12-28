/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.mainCoursesSelectButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainCourses;

/**
 *
 * @author SN PC
 */
public class mainCoursesSelectButtonTest {
    
    MainCourses mc;
    mainCoursesSelectButton mcsb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mc = new MainCourses();
        mcsb = new mainCoursesSelectButton();
    }

    /**
     * Test of actionPerformed method, of class mainCoursesSelectButton.
     */
    @Test
    public void testActionPerformed() {
        mcsb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
