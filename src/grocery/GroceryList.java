package grocery;

import java.util.HashMap;

import static util.Input.scanner;

public class GroceryList {
    public HashMap<String,Integer> groceries;

    public GroceryList() {
        this.groceries = new HashMap<>();
    }

    public void addGrocery() {
        System.out.print("enter name of item: ");
        String item = scanner.nextLine(); scanner.nextLine();

        System.out.print("enter quantity: ");
        int quantity = scanner.nextInt();

        this.groceries.put(item, quantity);
    }



}
