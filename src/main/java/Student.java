import java.util.ArrayList;
public class Student {
    String name;
    int age;
    String dob;
    String ID;
    String username;
    ArrayList<Module> modules;
    ArrayList<Course> courses;

    public Student(String name, int age, String dob, String ID, ArrayList<Module> modules, ArrayList<Course> courses) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.ID = ID;
        this.modules = modules;
        this.courses = courses;
        this.username = getUsername(name, age);
    }

    public String getUsername(String studentName, int studentAge) {
        try {
            return studentName + Integer.toString(studentAge);
        }
        catch (IllegalArgumentException e) {
            return "Illegal Argument";
        }
    }

    public boolean addModule(Module addedModule) {
        if (!modules.contains(addedModule)) {
            modules.add(addedModule);
            return true;
        }
        else {return false;}
    }

    public boolean addCourse( Course addedCourse) {
        if (!courses.contains(addedCourse)) {
            courses.add(addedCourse);
            return true;
        }
        else {return false;}
    }

    public boolean removeModule(Module removedModule) {
        if (modules.contains(removedModule)) {
            modules.remove(removedModule);
            return true;
        }
        else {return false;}
    }

    public boolean removeCourse( Course removedCourse) {
        if (courses.contains(removedCourse)) {
            courses.remove(removedCourse);
            return true;
        }
        else {return false;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Name:" + this.getName() + ", " + "Username:" + this.getUsername() + " Courses: " + this.getCourses() + "\n";
    }
}
