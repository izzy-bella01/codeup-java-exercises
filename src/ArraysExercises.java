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

//        for (Person p : peopleArr) {
//            System.out.println(p.getName());
//        }

        Person aNewPerson = new Person("Person Name");

        System.out.println(Arrays.toString(addPerson(peopleArr, aNewPerson)));

//// --------------------------------------------------------------------
    }
    public static Person[] addPerson(Person[] myArr, Person myPerson) {
        Person[] copiedArr =  Arrays.copyOf(myArr, myArr.length + 1);
        copiedArr[copiedArr.length - 1] = myPerson;
//        System.out.println(Arrays.toString(copiedArr));

        for (Person stringP : copiedArr) {
            System.out.println(stringP.getName());
        }

        return copiedArr;
    }

}
