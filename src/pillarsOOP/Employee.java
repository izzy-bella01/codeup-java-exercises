package pillarsOOP;

public class Employee extends Person{
    // Employees still have names, don't have to reinvent what was done in Person class
    public Employee(String employeeName) {
        super(employeeName);
    }

    // give Employee a "department" but not to every Person
    public String department;

    public String getName() {
        return this.name;
    }

//age is still private even in subclass
//    public int getAge() {
//        // ERROR!
//        return this.age;
//    }

    public void sayGoodbye() {
        System.out.println("My pleasure working with you today, come back and see us sometime!");
    }

}
