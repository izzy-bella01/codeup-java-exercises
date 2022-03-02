package notes.InterfacesAndAbstractClasses;

public abstract class Employee implements dailyWork, monthlyWork{
    // fields
    protected String name;
    protected String department;

// used command+N shortcut to generate getters, setters and constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // used this when doing abstract
    // commented out and used implements
//    public abstract String work();

}
