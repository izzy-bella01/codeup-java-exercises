// class - defining class
// HelloWorld is the name of the class, and it matches the name of the .java file
public class HelloWorld {

    // method - similar to a function in javascript
    // main method -> specific method in have that acts as our entry point when running java
    // similar to starting point in a board game
    // front door to get to any room in a house
    public static void main (String[] args) {
        // public, static, void -- pinned for later
        // void -- for now, it means this method doesn't expect anything to be returned
        // main is the name of our method and main is the keyword that is going to be searched as the entry point
        // String[] args - passing in a string array named args

        // print out "Hello World" to the console

        System.out.print("Hello, World!");
        System.out.print("\n");
        // ^ same as
            // System.out.println("Hello, World!");

        // SYSTEMS, DATA TYPES AND VARIABLES

        //E1
        int myFavoriteNumber;
        myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        //E2
        String myString;
        myString = "i love lifting!";
        System.out.println(myString);

        //E3
        //myString = 'c';
            // --> does not work bc it is a String data type, not a char data type

        //E4
        //myString = 3.14159;
            // --> does not work bc it is a String data type, not a float data type

        //E5
        long myNumber;
        //System.out.println(myNumber); --> does not run bs there is no value assigned to myNumber



    }

}
