package notes;

import java.util.Locale;

public class StringsNotes {
    public static void main(String[] args) {

        //Strings
        // --> objects, not a primitive type
        String myName = "Bella is happy that it is friday!";
        String otherName = "bella";
//        if(myName.equals(otherName)) {
//            System.out.println("names match!");
//        }

//        if(myName.startsWith("Bella")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }


//        if(myName.endsWith("friday!")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        // one difference between primitive types and objects is that objects check if the object itself is equal to the next, unlike primitive which checks values.


        // immutable --> cannot change value of string
        String greeting = "Hello";
        greeting = greeting + " there!";
        System.out.println(greeting);
        // works BUT what is happening is that the value of greeting isn't getting reassigned or changed, a new string is being created in memory and updating

        // STRING MANIPULATION
        String sentence = "The quick brown fox jumped over the lazy dog.    ";

        //.charAt(int index) --> find a character at a given index
//        System.out.println(sentence.charAt(0));
//        char findingChar = sentence.charAt(8);
//        System.out.println(findingChar);

        //.indexOf(String subString) --> return index of FIRST occurrence of string passed in, return -1 if it does not exist
//        System.out.println(sentence.indexOf("s"));
//        int findingIndex = sentence.indexOf("o");
//        System.out.println(findingSentence);

        //.lastIndexOf(int index) --> returns last occurrence of string passed in
//        System.out.println(sentence.lastIndexOf("d"));

        //.length() --> starting at one not zero, doesn't accept parameters, returns an int
//        System.out.println(sentence.length());

        //.replace(String theThingWe'reReplacing, String replacingWith) --> going to return new String with replacement but does not change original string
//        System.out.println(sentence.replace("quick", "really quick"));

        //.substring(int beginIndex, int endIndex) --> returning a slice of String, includes starting character but not the ending character
//        System.out.println(sentence.substring(5,26));

        //.toUpperCase() & .toLowerCase()
//        System.out.println(sentence.toUpperCase(Locale.ROOT));
//        System.out.println(sentence.toLowerCase(Locale.ROOT));

        //.trim() --> trims off whitespace at end or beginning
//        System.out.println(sentence.trim());





    }
}
