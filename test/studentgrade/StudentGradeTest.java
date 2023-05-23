
package studentgrade;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alaa AlEnazi
 */
public class StudentGradeTest{
    
    int mark;
    String expectedResult, actualResult;
    
    public StudentGradeTest(){
    }
    
    @BeforeClass
    public static void beforeTestClass() {
        System.out.println("Before Test Class, (This will be executed once in the class).");
        System.out.println();
    }
    
    
    @Before
    public void beforeTestCase() {
        System.out.println("Before Test Case, (This will be executed before each Test Case).");
    }
    

    /**
     * Test of getGrade method, Mark = 99, of class StudentGrade.
     */
    @Test
    public void testGetGrade99() {
       System.out.println("Test Get Grade 99");
       mark = 99;
       expectedResult = "A";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test of getGrade method, Mark = 80, of class StudentGrade.
     */
    @Test
    public void testGetGrade80() {
       System.out.println("Test Get Grade 80");
       mark = 80;
       expectedResult = "B";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test of getGrade method, Mark = 62, of class StudentGrade.
     */
    @Test
    public void testGetGrade62() {
       System.out.println("Test Get Grade 62");
       mark = 62;
       expectedResult = "F";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
}
