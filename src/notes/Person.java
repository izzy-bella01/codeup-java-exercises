package notes;

import java.util.Scanner;

public class Person {
    // this blueprint has these PROPERTIES:
    // first: two STRING data types representing names
    public String firstName;
    public String lastName;
    // Extra examples: more fields for a Person to have when instantiated (created)
    private int age;
    public String relationship;

    int shareAge() {
        return age;
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public Person(String firstName, String lastName){
        // inside of our constructor ... default for age and relationship vs taking it in as an argument
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.relationship = "undefined";
    }

    // now, our user has registered and we want to create an object with all of the potential fields
//    public Person(String firstName, String lastName, int age, String relationship){
//        // inside of our constructor ... default for age and relationship vs taking it in as an argument
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.relationship = relationship;
//    }

    // refactor the above constructor
    public Person(String firstName, String lastName, int age, String relationship){
        // inside of our constructor ... default for age and relationship vs taking it in as an argument
        this(firstName, lastName);
        this.age = age;
        this.relationship = relationship;
    }

    // that means we could have a completely separate default constructor:
    public Person(){
        // default things
    }

    public static void main(String[] args) {
//        // created an INSTANCE of a person:
//        Person bella = new Person();
//        // filled in the PROPERTIES with values
//        bella.firstName = "bella";
//        bella.lastName = "hernandez";
//        bella.age = 20;
//        bella.relationship = "taken";
//
//        // see results from our object and our values that we put into the properties:
//        System.out.println("bella.firstName = " + bella.firstName);
//        System.out.println("bella.lastName = " + bella.lastName);
//        System.out.println("bella.age = " + bella.age);
//        System.out.println("bella.relationship = " + bella.relationship);
//        System.out.println(bella.sayHello());
//        // adding a line of white space
//        System.out.println();
//        // another instance of person:
//        Person timothy = new Person();
//
//        timothy.firstName = "timothy";
//        timothy.lastName = "singletary";
//
//        System.out.println("timothy.firstName = " + timothy.firstName);
//        System.out.println("timothy.lastName = " + timothy.lastName);
//        System.out.println(timothy.sayHello());
//        System.out.println();
//
//        // note: we did not try to spin off our own version of Math, instead we accessed the class of Math
//        System.out.println("Math.PI = " + Math.PI);
//
//        // compare and contrast:
//        // need to make an INSTANCE to use a Scanner
//        Scanner mcScannerFace = new Scanner(System.in);

        // constructor overloading example
        // scenario 1: user registers with only 2 pieces of information
        // before: using default contrusctor and assigning all fields manually
        //Person newUser = new Person();
        //newUser.firstName = "bella";

        // now:
        Person newUser = new Person("Bugs", "Bunny");

        System.out.println(newUser.sayHello());
        System.out.println("newUser.age = " + newUser.age);
        System.out.println("newUser.relationship = " + newUser.relationship);

        // scenario 2: user provides all four pieces of information
        Person newerUser = new Person("Daffy", "Duck", 90, "complicated");

        System.out.println();
        System.out.println(newerUser.sayHello());
        System.out.println("newerUser.age = " + newerUser.age);
        System.out.println("newerUser.relationship = " + newerUser.relationship);


    }
}
