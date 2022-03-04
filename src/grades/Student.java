package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {

        Student lily = new Student("Lily");
        lily.addGrade(98);
        lily.addGrade(88);
        System.out.println("lily.getName() = " + lily.getName());
        System.out.println("lily.grades = " + lily.grades);
        System.out.println("lily.getGradeAverage() = " + lily.getGradeAverage());

        Student max = new Student("Max");
        max.addGrade(78);
        max.addGrade(93);
        System.out.println("max.getName() = " + max.getName());
        System.out.println("max.grades = " + max.grades);
        System.out.println("max.getGradeAverage() = " + max.getGradeAverage());

    }

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int sumGrade = 0;
        for(double stuGrade : grades) {
            sumGrade += stuGrade;
        }
        return sumGrade / grades.size();
    }
}
