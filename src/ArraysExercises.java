import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // Exercise 1.
        // int[] numbers = {1, 2, 3, 4, 5};
        // System.out.println(numbers);
        // need Arrays.toString(); because just SOUTing numbers, doesn't print the array correctly

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
// --------------------------------------------------------------------
        Person[] peopleArr = new Person[3];
        peopleArr[0] = new Person("Bella");
        peopleArr[1] = new Person("Timothy");
        peopleArr[2] = new Person("Alondra");

        for (Person p : peopleArr) {
            System.out.println(p.getName());
        }
// --------------------------------------------------------------------

    addPerson();

    }
    public static void addPerson(Person[] peopleArr) {
        System.out.println(peopleArr);
    }
}