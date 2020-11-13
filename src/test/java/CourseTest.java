
import static org.junit.Assert.*;
import org.joda.time.DateTime;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;


public class CourseTest {
    static Course testCourse;
    static Module testModule1;
    static DateTime startDate;
    static DateTime endDate;
    public static ArrayList<Module> modules = new ArrayList<>();

    @BeforeClass
    public static void setUp() {
        startDate = new DateTime(2017, 9, 1, 0, 0);
        endDate = new DateTime(2021, 5, 31, 0, 0);
        testCourse = new Course("Electronic and Computer Engineering", modules, startDate, endDate);
        testModule1 = new Module("Software Engineering","CT417");
    }

    @Test
    public void addModule() {
        assertTrue(testCourse.addModule(testModule1));
        assertFalse(testCourse.addModule(testModule1));
    }

    @Test
    public void removeModule() {
        testCourse.addModule(testModule1);
        assertTrue(testCourse.removeModule(testModule1));
        assertFalse(testCourse.removeModule(testModule1));
    }
}