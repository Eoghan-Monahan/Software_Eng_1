import org.joda.time.DateTime;
import org.junit.BeforeClass;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    static Student tester;
    public static ArrayList<Module> modules = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();
    static DateTime startDate;
    static DateTime endDate;
    static Module testModule1;
    static Module testModule2;
    static Course testCourse1;
    static Course testCourse2;

    @BeforeClass
    public static void setup() {
        testModule1 = new Module("Software Engineering","CT417");
        testModule2 = new Module("Machine Learning", "CT4101");
        modules.add(testModule1);
        startDate = new DateTime(2017, 9, 1, 0, 0);
        endDate = new DateTime(2021, 5, 31, 0, 0);
        tester = new Student("Test", 20, "8/11/2020", "12345678", modules, courses);
        testCourse1 = new Course("Electronic and Computer Engineering", modules, startDate, endDate);
        testCourse2 = new Course("CS&IT", modules, startDate, endDate);
        courses.add(testCourse1);
        tester = new Student("Test", 20, "8/11/2020", "12345678", modules, courses);

    }

    @Test
    public void testGetUsername() {
        String result = tester.getUsername("Test", 20);
        assertEquals("Test20", result);
    }

    @Test
    public void testAddModule() {
        boolean result = tester.addModule(testModule2);
        assertTrue(result);
        result = tester.addModule(testModule2);
        assertFalse(result);
    }
    @Test
    public void testAddCourse() {
        boolean result = tester.addCourse(testCourse2);
        assertTrue(result);
        result = tester.addCourse(testCourse2);
        assertFalse(result);
    }
    @Test
    public void testRemoveModule() {
        boolean result = tester.removeModule(testModule1);
        assertTrue(result);
        result = tester.removeModule(testModule1);
        assertFalse(result);
    }
    @Test
    public void testRemoveCourse() {
        boolean result = tester.removeCourse(testCourse1);
        assertTrue(result);
        result = tester.removeCourse(testCourse1);
        assertFalse(result);
    }
}