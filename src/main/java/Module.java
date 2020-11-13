import java.util.ArrayList;
public class Module {
    String name;
    String id;
    ArrayList<Student> students = new ArrayList<>();

    public Module(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean addStudent(Student addedStudent) {
        if (!students.contains(addedStudent)) {
            students.add(addedStudent);
            return true;
        }
        else {return false;}
    }
    public boolean removeStudent(Student removedStudent) {
        if (students.contains(removedStudent)) {
            students.remove(removedStudent);
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}

