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

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        // created an INSTANCE of a person:
        Person bella = new Person();
        // filled in the PROPERTIES with values
        bella.firstName = "bella";
        bella.lastName = "hernandez";
        bella.age = 20;
        bella.relationship = "taken";

        // see results from our object and our values that we put into the properties:
        System.out.println("bella.firstName = " + bella.firstName);
        System.out.println("bella.lastName = " + bella.lastName);
        System.out.println("bella.age = " + bella.age);
        System.out.println("bella.relationship = " + bella.relationship);
        System.out.println(bella.sayHello());
        // adding a line of white space
        System.out.println();
        // another instance of person:
        Person timothy = new Person();

        timothy.firstName = "timothy";
        timothy.lastName = "singletary";

        System.out.println("timothy.firstName = " + timothy.firstName);
        System.out.println("timothy.lastName = " + timothy.lastName);
        System.out.println(timothy.sayHello());
        System.out.println();

        // note: we did not try to spin off our own version of Math, instead we accessed the class of Math
        System.out.println("Math.PI = " + Math.PI);

        // compare and contrast:
        // need to make an INSTANCE to use a Scanner
        Scanner mcScannerFace = new Scanner(System.in);
    }
}
