package grades;

import java.util.HashMap;
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

        String yesOrNo = "";

        do {
            System.out.println("\n\nWhat student would you like to see more of?");
            Scanner selectStu = new Scanner(System.in);
            String userAnswer = selectStu.nextLine();

            Student output = Students.get(userAnswer);

            if (output == null) {
                System.out.println("Sorry, no student found with the name: " + userAnswer);

                System.out.println("\n\nWould you like to see another student? ");
                Scanner anotherStu = new Scanner(System.in);
                yesOrNo = anotherStu.nextLine();
            } else {
                Student stuObj = Students.get(userAnswer);
                String stuObjName = stuObj.getName();
                double stuObjGrade = stuObj.getGradeAverage();

                System.out.printf("Name: %s --- Github Username: %s%n", stuObjName, userAnswer);
                System.out.printf("Current Average: %s", stuObjGrade);

                System.out.println("\n\nWould you like to see another student? ");
                Scanner anotherStu = new Scanner(System.in);
                yesOrNo = anotherStu.nextLine();
            }

            if(!yesOrNo.equals("y")) {
                System.out.println("Goodbye and have a wonderful day!");
            }
        } while (yesOrNo.equals("y"));

    } // end of main method
}
