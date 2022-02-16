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
            // --> does not work bc it is a String data type, not a double data type

        //E5
        long myNumber;
        //System.out.println(myNumber);
            // --> does not run bc there is no value assigned to myNumber

        //E6
        //myNumber = 3.14;
            // --> does not work bc 3.14 has a decimal and myNumber is set to a long

        //E7
        //myNumber = 123L;
        //System.out.println(myNumber); // works for some reason

        //E8
        myNumber = 123;

        //E9
        //float myNumber;
        //myNumber = 3.14;
            // --> would work if myNumber was declared as a double at the very first instance of it, or cast myNumber to float

        //E10
        //int x = 5;
        //System.out.println(x++); --> 5
        //System.out.println(x); --> 6
        // --> why? code adds one AFTER 5 has been logged

            //--------

        //int x = 5;
        //System.out.println(++x); --> 6
        //System.out.println(x); --> 6
            // --> why? code adds one BEFORE 5 has been logged

        //E11
        //String class; --> class is a reserved word, meaning it cannot be used

        //E12
        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;
        //System.out.println(three);
            // --> String cannot be cast to an Integer

        //int three = (int) "three";
        //System.out.println(three);
            // String cannot be cast to an int

        //E13
        //int x = 4;
        ////x = x + 5;
        //System.out.println(x+=5); --> 9

        //--------
        //int x = 3;
        //int y = 4;
        ////y = y * x;
        //System.out.println(y*=x); --> 12

        //--------
        //int x = 10;
        //int y = 2;
        ////x = x / y;
        //System.out.println(x/=y); --> 5
        ////y = y - x;
        //System.out.println(y-=x); --> -8

        //E14
        //byte num;
        //num = 250;
            // --> assigning a value to a smaller data type does not work
            // --> if assigned to a data type that is larger it will work, but it may not be ideal for system runtime

    }

}
