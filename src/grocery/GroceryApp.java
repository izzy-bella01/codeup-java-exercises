package grocery;

import java.util.ArrayList;
import java.util.HashMap;

import static util.Input.scanner;

public class GroceryApp {

    public static GroceryList FruitVeggie = new GroceryList();
    GroceryList MeatSeafood = new GroceryList();
    GroceryList Bakery = new GroceryList();
    GroceryList Dairy = new GroceryList();
    GroceryList Deli = new GroceryList();
    GroceryList Frozen = new GroceryList();



    public static void main(String[] args) {
        System.out.println("Would you like to create a grocery list? ");
        String createList = scanner.nextLine();

        if (createList.equals("yes")) {
            System.out.println("Would you like to enter a new item? ");
            String createItem = scanner.nextLine();

            if(createItem.equals("yes")) {
                System.out.println("CHOOSE FROM THE LIST OF CATEGORIES: ");
                System.out.println("1. fruit & vegetable \n" +
                        "2. meat & seafood \n" +
                        "3. bakery & bread \n" +
                        "4. dairy \n" +
                        "5. deli \n" +
                        "6. frozen \n");
                int category = scanner.nextInt();
                if (category == 1) {
                    FruitVeggie.addGrocery();
                }
            } else {
                System.out.println("Okay, goodbye");
            }
        } else {
            System.out.println("Okay, goodbye");
        }

    }
}
