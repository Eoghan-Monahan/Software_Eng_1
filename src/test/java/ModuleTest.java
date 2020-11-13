import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ModuleTest {
    static Module testModule1;
    static Student testStudent1;
    public static ArrayList<Module> modules = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();
    @BeforeClass
    public static void setUp() {
        testModule1 = new Module("Software Engineering","CT417");
        testStudent1 = new Student("Test", 20, "8/11/2020", "12345678", modules, courses);

    }

    @Test
    public void testAddStudent() {
        assertTrue(testModule1.addStudent(testStudent1));
        assertFalse(testModule1.addStudent(testStudent1));
    }

    @Test
    public void testRemoveStudent() {
        testModule1.addStudent(testStudent1);
        assertTrue(testModule1.removeStudent(testStudent1));
        assertFalse(testModule1.removeStudent(testStudent1));
    }
}