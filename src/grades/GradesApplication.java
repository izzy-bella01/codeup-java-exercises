package grades;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> Students = new HashMap<>();

        // Student objects
        Student jessica = new Student("Jessica");
        jessica.addGrade(93);
        jessica.addGrade(86);
        jessica.addGrade(100);

        Student kayla = new Student("Kayla");
        kayla.addGrade(75);
        kayla.addGrade(99);
        kayla.addGrade(78);

        Student angeline = new Student("Angeline");
        angeline.addGrade(95);
        angeline.addGrade(87);
        angeline.addGrade(98);

        Student devon = new Student("Devon");
        devon.addGrade(79);
        devon.addGrade(81);
        devon.addGrade(87);


        // adding them to the map
        Students.put("jFines3", jessica);
        Students.put("kMadrigal4", kayla);
        Students.put("aIgnecio2", angeline);
        Students.put("dBrown9", devon);

//        System.out.println("Students = " + Students);

        System.out.println("Welcome \nHere are the GitHub usernames of our students:");
        for ( String usernameKey : Students.keySet() ) {
            System.out.printf( "| %s | ", usernameKey );
        }

        System.out.println("\n\nWhat student would you like to see more of?");
        Scanner selectStu = new Scanner(System.in);
        String userAnswer = selectStu.nextLine();

        for ( String usernameKey : Students.keySet() ) {
            Student stuObj = Students.get(usernameKey);
            String stuObjName = stuObj.getName();
            double stuObjGrade = stuObj.getGradeAverage();
            if(userAnswer.equals(usernameKey)) {
                System.out.printf("Name: %s --- Github Username: %s%n", stuObjName, usernameKey);
                System.out.printf("Current Average: %s", stuObjGrade);
            }

        }





    }
}
