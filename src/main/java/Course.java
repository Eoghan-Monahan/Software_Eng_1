import java.util.ArrayList;
import org.joda.time.DateTime;
public class Course {
    String name;
    ArrayList<Module> modules;
    DateTime startDate;
    DateTime endDate;

    public Course(String name, ArrayList<Module> modules, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean addModule(Module addedModule) {
        if (!modules.contains(addedModule)) {
            modules.add(addedModule);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }


    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String moduleNames = "";
        ArrayList<Module> moduleList = this.getModules();
        for (Module m : moduleList) {
            moduleNames = moduleNames + m.getName() + " " + m.getId() + ", ";
        }
        return this.getName() + "Associated Modules: " + moduleNames;
    }
}

