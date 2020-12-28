package TestCode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import dragonRestaurant.Model.MainCourses;
import dragonRestaurant.Controller.mainCoursesSelectButton;

public class mainCoursesSelectButtonTest {
    
    MainCourses mc;
    mainCoursesSelectButton mcsb;
    
    @Before
    public void setUp() throws Exception{
        System.out.println("Set up");
        mc = new MainCourses();
        mcsb = new mainCoursesSelectButton();
    }

    @Test
    public void testActionPerformed() {
        mcsb.actionPerformed();
        System.out.println("Test performed");
    }
    
}
