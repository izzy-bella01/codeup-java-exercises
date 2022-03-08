package notes.ExceptionsErrorNotes;

public class ExceptionsTest {

    public static void main(String[] args) throws Exception {
//
//        System.out.println("if I am above the exception, will i be seen?");
//
//        throw new Exception("Whoops - Exception encountered");
//        System.out.println("Good Morning, Sirius!");

        // Okay - that's an interesting experiment that shows an exception breaking a program and how it breaks,
        // but how would I start to work around exceptions?
        // A: Look at a try catch block!

        try {
            // Code to break application here..
            throw new Exception("Something breaks while running the application");
        } catch(NullPointerException exceptionObject){
            System.out.println("this is a null pointer exception");
            System.out.println("Here's an example of .getMessage() " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch(RuntimeException exceptionObject){
            System.out.println("this is a runtime exception");
            System.out.println("Here's an example of .getMessage() " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch(Exception exceptionObject) {
            System.out.println("This is a generic, top level exception");
            System.out.println("Here's an example of .getMessage() " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        }


    }
}
