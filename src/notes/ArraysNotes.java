package notes;

import java.util.Arrays;

public class ArraysNotes {
    public static void main(String[] args) {
        // WHAT ARE ARRAYS
        // // length of arrays must be defined before using java
        // // all arrays store the same data type
        // // data type of the elements being stored in the array


        // HOW TO PROPERLY USE ARRAYS IN JAVA

        // // CREATE AN ARRAY OF texasTemps for 3 days

        // SYNTAX
        int[] texasTemps = new int[3];
        // int[] - data type of the variable
        // texasTemps - var name
        // new int[3] - initializing new array of integers
        // [3] - length of the array being created
        // [][][] --> length
        // 0 1 2 --> index

        // assign some values to those slots
        texasTemps[0] = 36;
        texasTemps[1] = 45;
        texasTemps[2] = 86;

        System.out.println(texasTemps[1]); // print out value of element at first index

        // 1. declare data type String
        // 2. save it to variable
        // 3. create the array
        // 4. specify the data type of the array
        // 5. define the length of the array
        // 6. assign values to each of the elements in the array

        String[] weather = new String[4];
        weather[0] = "Sunny";
        weather[1] = "Cloudy";
        weather[2] = "Rainy";
        weather[3] = "Snowy";

        System.out.println(weather);


        // // HANDLING MULTIPLE ELEMENTS AT A TIME
        // create an array that holds daily steps
        // data type of elements ? long
        // data type - array
        // name the variable of the that holds the array - dailtSteps
        // data type of the variable (dailySteps) ? long
        long[] dailySteps = {10000, 12000, 22000};
//        System.out.println(dailySteps);
        System.out.println(Arrays.toString(dailySteps));

//        int[] randomNums = new int[3];
//        randomNums[0] = 23;
//        randomNums[1] = 55;
//        randomNums[2] = 98;
//        System.out.println(Arrays.toString(randomNums));

        int[] randomNums = {23, 55, 98};
        System.out.println(Arrays.toString(randomNums));



        // HOW TO ITERATE THROUGH ARRAYS

        // // TODO: Let's create a method (nums) that returns the sum of all integers in an int array

        // // // PSEUDOCODE
        // 1. create a method (nums)
        // // what's the method signature? --> public static
        // // what data type (if any) is being return from this method --> int
        // --> public static int sumAll()

        // 2. create array of ints
        // // 2a. what's the length of our array? --> 5
        // // 2b. where does this array go? --> in method we're creating (sumAll method)

        // 3. assign values to the array
        // // 3a. how are we going to initialize the array of ints?
        // // // array literal {}
        // // // array declaration new int[]

        // 4. iterate through our elements in the array
        // //  where does iteration live? --> in method
        // // how do you want to iterate?
        // // // traditional for loop
        // // // enhanced for loop

        // 5. create variable to store the sum
        // // where does this variable live? --> in sumAll() --> above for loop
        // // what's this variables type? (int)
        // // what's this variables starting point?

        // 6. add logic that will add each element to itself
        // // where does this logic live?
        // // int sum;
        // // // [1,5,3,2]
        // // ** sum variable = sum + value of index of element **
        // // // 1st iteration sum = 0 -> sum = 0 + 1 // sum = 1;
        // // // 2nd iteration sum = 1 -> sum = 1 + 5 // sum = 6;

        // 7. return the sum
        // // where does this return sum live? --> in sumAll() --> after for loop

        // 8. call the method
        // //  where do we call it? in main method
        // // sout out result


        // // // TRADITIONAL FOR LOOP
//        String[] names = {"cody", "kenneth", "jordy", "laura"};
//        System.out.println(names.length);
//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }


        // // // ENHANCED FOR LOOP
        String[] names = {"cody", "kenneth", "jordy", "laura"};
        System.out.println(names.length);
        for (String name : names) {
//      for (data type and name of variable : name of array)
            System.out.println(name);
        }

        // // // SOLUTION --> see sumAll() method outside of main
        System.out.println(sumAll());

        // ARRAYS CLASS

        // // ARRAYS.FILL(arrayName, value)
        String[] languages = {"french", "portuguese", "dutch"};
        System.out.println(Arrays.toString(languages));
        Arrays.fill(languages, "french");
        System.out.println(Arrays.toString(languages));
//         changing original array

        // // ARRAYS.EQUALS(array1, array2)
//        String[] answer = {"apart", "learn", "knock"}; // false
        String[] answer = {"texas", "green", "array"}; // true
        String[] kenGuess = {"texas", "green", "array"};
        System.out.println(Arrays.equals(answer, kenGuess));
        // accepts two params
        // returns a boolean
        boolean isKenRight = Arrays.equals(answer, kenGuess);
        System.out.println(isKenRight);

        // // ARRAYS.COPYOF(array, length)
        String[] lauraCopy = Arrays.copyOf(answer,2);
        System.out.println(Arrays.toString(lauraCopy));

        // // ARRAYS.TOSTRING(array)

        // // ARRAYS.SORT(array)
        String[] languages2 = {"french", "portuguese", "dutch"};
        Arrays.sort(languages2);
        System.out.println(Arrays.toString(languages2));

        int[] randomNumsArr = {1, 5, 34, 67, 89};
        Arrays.sort(randomNumsArr);
        System.out.println(Arrays.toString(randomNumsArr));

        // TWO DIMENSIONAL/MATRIX/NESTED ARRAYS
        int[][] myMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(myMatrix[2][0]);
        // print out every nested element
        // do a loop
        // do another loop

        for(int[] rows : myMatrix) {
            System.out.println("-----------this is a new row------------");
            for(int column : rows) {
                System.out.println(column);
            }
        }


    } // end of main method

    public static int sumAll() {
        int[] nums = {1, 5, 34, 67, 89};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}
