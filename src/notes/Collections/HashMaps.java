package notes.Collections;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, String> authorBooks = new HashMap<>();

        authorBooks.put("Kurt Vonnegut", "Cat's Cradle");
        authorBooks.put("J.D Salinger", "Franny and Zoey");


        System.out.println("authorBooks.get(\"Kurt Vonnegut\") = " + authorBooks.get("Kurt Vonnegut"));
        System.out.println("authorBooks.get(\"Isaac Asimov\") = " + authorBooks.get("Isaac Asimov"));

        // dont want null
        System.out.println(authorBooks.getOrDefault("Isaac Asimov", "No book found for author"));

        // dont want to override the key-value pair?
        authorBooks.put("Kurt Vonnegut", "Slaughterhouse Five");
        // instead of put, use putIfAbsent
        authorBooks.putIfAbsent("Kurt Vonnegut", "Welcome to The Monkey House");

        // someone added a controversial book
        authorBooks.put("Karl Marx", "The Communist Manifesto");
        authorBooks.remove("Karl Marx");

        System.out.println("authorBooks = " + authorBooks);

        // what if I wanted to replace something without having to go through the entire put method??
        authorBooks.replace("J.D Salinger", "Nine Stories");

        System.out.println("authorBooks = " + authorBooks);
        authorBooks.clear();
        System.out.println("authorBooks = " + authorBooks);
        System.out.println("authorBooks.isEmpty() = " + authorBooks.isEmpty());


    }



}

