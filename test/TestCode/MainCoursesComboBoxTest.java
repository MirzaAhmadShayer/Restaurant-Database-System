package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainCourses;
import dragonRestaurant.Controller.MainCoursesComboBox;

public class MainCoursesComboBoxTest {
    
    MainCourses mc;
    MainCoursesComboBox mccb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mc = new MainCourses();
        mccb = new MainCoursesComboBox();
    }

    @Test
    public void testActionPerformed() {
        mccb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
