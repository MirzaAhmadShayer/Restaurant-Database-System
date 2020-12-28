/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import dragonRestaurant.Controller.MainCoursesComboBox;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainCourses;

/**
 *
 * @author SN PC
 */
public class MainCoursesComboBoxTest {
    
    MainCourses mc;
    MainCoursesComboBox mccb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mc = new MainCourses();
        mccb = new MainCoursesComboBox();
    }

    /**
     * Test of actionPerformed method, of class MainCoursesComboBox.
     */
    @Test
    public void testActionPerformed() {
        mccb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
