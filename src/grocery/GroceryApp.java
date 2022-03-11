package grocery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static util.Input.scanner;

public class GroceryApp {

    static GroceryList FruitVeggie = new GroceryList();
    static GroceryList MeatSeafood = new GroceryList();
    static GroceryList Bakery = new GroceryList();
    static GroceryList Dairy = new GroceryList();
    static GroceryList Deli = new GroceryList();
    static GroceryList Frozen = new GroceryList();

    public static void makeGroceries() {
        System.out.println("Would you like to create a grocery list? ");
        String createList = scanner.next();
        String addMore;
        if (createList.equals("yes")) {
            System.out.println("Would you like to enter a new item? ");
            String createItem = scanner.next();
            do {
                if(createItem.equals("yes")) {
                    System.out.println("CHOOSE FROM THE LIST OF CATEGORIES: ");
                    System.out.println("1. fruit & vegetable \n" +
                            "2. meat & seafood \n" +
                            "3. bakery & bread \n" +
                            "4. dairy \n" +
                            "5. deli \n" +
                            "6. frozen \n");
                    int category = scanner.nextInt();
                    switch (category) {
                        case 1: FruitVeggie.addGrocery();
                            break;
                        case 2: MeatSeafood.addGrocery();
                            break;
                        case 3: Bakery.addGrocery();
                            break;
                        case 4: Dairy.addGrocery();
                            break;
                        case 5: Deli.addGrocery();
                            break;
                        case 6: Frozen.addGrocery();
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("Okay, goodbye");
                }

                System.out.println("Would you like to see a list? ");
                String seeList = scanner.next();
                if (seeList.equals("yes")) {
                    System.out.println("Which list would you like to see? ");
                    System.out.println("1. fruit & vegetable \n" +
                            "2. meat & seafood \n" +
                            "3. bakery & bread \n" +
                            "4. dairy \n" +
                            "5. deli \n" +
                            "6. frozen \n");
                    int listNum = scanner.nextInt();
                    switch (listNum) {
                        case 1: FruitVeggie.showList();
                            break;
                        case 2: MeatSeafood.showList();
                            break;
                        case 3: Bakery.showList();
                            break;
                        case 4: Dairy.showList();
                            break;
                        case 5: Deli.showList();
                            break;
                        case 6: Frozen.showList();
                            break;
                        default:
                            break;
                    }
                }

                System.out.println("Would you like add another item or exit? \n" +
                        "Type \"add\" or \"exit\": ");
                Scanner anotherItem = new Scanner(System.in);
                addMore = anotherItem.nextLine();

            } while(addMore.equals("add"));

        } else {
            System.out.println("Okay, goodbye");
        }
    }


    public static void main(String[] args) {
        makeGroceries();
    }
}
