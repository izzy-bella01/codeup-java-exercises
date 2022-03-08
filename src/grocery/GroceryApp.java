package grocery;

import java.util.ArrayList;
import java.util.HashMap;

import static util.Input.scanner;

public class GroceryApp {

    static GroceryList FruitVeggie = new GroceryList();
    static GroceryList MeatSeafood = new GroceryList();
    static GroceryList Bakery = new GroceryList();
    static GroceryList Dairy = new GroceryList();
    static GroceryList Deli = new GroceryList();
    static GroceryList Frozen = new GroceryList();

    public static void makeGroceries() {
        String addMore;
        do {
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
                    } else if (category == 2) {
                        MeatSeafood.addGrocery();
                    } else if (category == 3) {
                        Bakery.addGrocery();
                    } else if (category == 4) {
                        Dairy.addGrocery();
                    } else if (category == 5) {
                        Deli.addGrocery();
                    }  else if (category == 6) {
                        Frozen.addGrocery();
                    }
                } else {
                    System.out.println("Okay, goodbye");
                }
            } else {
                System.out.println("Okay, goodbye");
            }

            System.out.println("Do you want to add another item?");
            addMore = scanner.nextLine();

        } while(addMore.equals("yes"));
    }


    public static void main(String[] args) {
        makeGroceries();
    }
}
