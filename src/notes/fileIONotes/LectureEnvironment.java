package notes.fileIONotes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureEnvironment {
    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }


    public static void main(String[] args) throws IOException {
        // Paths class = static methods to obtain filepaths (Path class)
        // Path interface = abstracts away differences between Win && MacOS [vs. trying to d everything with strings]
        // Files class = Files.methods() for manipulating / interacting with files ^ utilizing paths above
        // File class object{} representation of a file

        // how to start working with absolute and relative paths

//        String myString = "this string";
//
//        Path pathToPoem = Paths.get("src/notes/fileIONotes/wcw.txt");
//
//        System.out.println("pathToPoem = " + pathToPoem);
//
//        // we can call the files helper class to see if path to file exists
//        System.out.println("Files.exists(pathToPoem) = " + Files.exists(pathToPoem));
//
//        printPoem(pathToPoem);

        // able to get to an existing file but want to create a file and a directory/ path to that file
        // 1st: string representing where i want a directory to go
        String directory = "./src/notes/fileIONotes/data";
        // 2nd: string representing the name of file
        String fileName = "groceryList.txt";

        Path dataDirectory = Paths.get(directory); // path-ify that String with the directory
        Path dataDirectoryAndFile = Paths.get(directory, fileName); //combining both strings into one Path

        System.out.println("-------------");
        System.out.println("dataDirectory = " + dataDirectory);
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

//        if(Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }

        if(Files.notExists(dataDirectoryAndFile)) {
            Files.createDirectories(dataDirectory); // can combine this line in this conditional instead of having two conditionals
            Files.createFile(dataDirectoryAndFile);
        }

        // File IO pt 3 -- gotten to something that exists, created directories and files that did not exist, now how do i manipulate what is INSIDE the file?
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        // first lets set up something to Write into our test file

        List<String> groceryList = Arrays.asList("coffee", "cat food", "roast beef", "carrots", "potatoes", "onions", "bread");
        System.out.println("groceryList = " + groceryList);
        Files.write(dataDirectoryAndFile, groceryList);

        // lets do one that is just an update
        List <String> forgotAGrocery = Arrays.asList("munster cheese", "gouda cheese", "colby jack cheese");
        Files.write(dataDirectoryAndFile, forgotAGrocery, StandardOpenOption.APPEND);

        // we've updated text file with various strings of information, how do i get that back out of the text file
        List<String> printGroceryList = Files.readAllLines(dataDirectoryAndFile);
        System.out.println();
        System.out.println("printGroceryList = " + printGroceryList);

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ": " + printGroceryList.get(i));
        }

        // replacing found element with new element
        // 1st: get groceryList from text file as it exists now
        List<String> printGroceryList2 = Files.readAllLines(dataDirectoryAndFile);
        // 2nd: set up second array list to hold the updated list we want to write to the text file
        List<String> newList = new ArrayList<>();

        // look at one line inside all of these lines i got from my text file
        for(String line: printGroceryList2){
            if(line.equalsIgnoreCase("gouda cheese")) {
                newList.add("vegan cheese");
                continue;
            }
            newList.add(line);
        }

        System.out.println("printGroceryList2 = " + printGroceryList2);
        System.out.println("newList = " + newList);

        // update grocery list
        Files.write(dataDirectoryAndFile, newList);

    }
}

