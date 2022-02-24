package pillarsOOP; // in a package called pillarsOOP

public class Person {
    // FIELD
    //public String name; // refactored to protected
    protected String name;
    private int age;

    // CONSTRUCTOR
    public Person(String name) {
        this.name = name;
    }

    // DEFAULT CONSTRUCTOR
    public Person() {

    }

    // METHOD SAYHELLO()
    public void sayHello() {
        System.out.println("hello from " + name + "!");
    }

    // METHOD SAYGOODBYE()
    public void sayGoodbye() {
        System.out.println("adios " + name + "!");
    }

    // private only works in same class, not in subclass
    public int getAge() {
        // ERROR!
        return this.age;
    }

    public String getName() {
        return name;
    }

}
