package notes;

public class SyntaxTypesVariables {

    public static void main (String[] args) {
        // primitive data types
        // --> not objects
        // --> store values of a specific type
        // --> byte, short, int, long, float, double, char, boolean (see chart in curriculum)

        // DECLARING VARIABLE
        // 1. must declare its data type before assigning it
        int myFavoriteNumber;
        myFavoriteNumber = 18;
        // or
        // int myFavoriteNumber = 18;

        System.out.println(myFavoriteNumber);

        // store favorite letter

        char myFavoriteLetter = 'T';
        System.out.println(myFavoriteLetter);

        // boolean
        boolean isSunny = true;
        System.out.println(isSunny);

        // good to know
        // int --> primitive type / not an object
        // Integer --> object / give us access to manipulate Integer as an object

        // double --> primitive type
        // Double --> object

        // char --> primitive type
        // Character --> object

        // why not use a double for everything
        // can affect runtime if data type is bigger than necessary

        // Strings
        // --> not a primitive data type in Java
        // --> they are objects

        // declaring a variable of the string data type
        String school;
        // assigning a value to the variable (initializing)
        school = "Codeup";
        System.out.println(school);

        // String school = "Codeup"; declaring and initializing

        // RESERVED WORDS
            // abstract, continue, for, new, switch, assert, default, goto, package, synchronized
            // boolean, do, if, private, this, break, double, implements, protected, throw, byte, else
            // import, public, throws, case, enum, instanceof, return, transient, catch, extends, int
            // short, try, char, final, interface, static, void, class, finally, long, strictfp, volatile
            // const, float, native, super, while

        // ARITHMETIC EXPRESSIONS
        byte firstNum = 3;
        byte secondNum = 9;
        int result = (firstNum + secondNum);

        System.out.println(result);


        // CONSTANTS
        // in JS const doesn't allow you to re-assign
        // java --> 'final' keyword is used
        // final keyword --> can not reassign variable

        // final String myName = "Bella";
        // myName = "Bananas"; --> myName cannot be "Bananas" bc myName is final




    }
}

