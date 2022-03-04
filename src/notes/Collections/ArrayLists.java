package notes.Collections;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> favNumbers = new ArrayList<>();

        // add elements to arraylist
        favNumbers.add(7);
        // 7 isn't most fav, add number before[0], real fav number
        favNumbers.add(0, 222);
        favNumbers.add(2, 14);
//        favNumbers.add(10, 222); // index out of bounds

        // get something at index[x]
        int myFavoriteFavorite = favNumbers.get(0);
        System.out.println("myFavoriteFavorite = " + myFavoriteFavorite);

        // let's search for second fav number, 7
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));
        System.out.println("favNumbers.indexOf(777) = " + favNumbers.indexOf(777)); // returns -1 if not found

        // what if there is 2 7's
        favNumbers.add(7);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));

        // see what we got as we work
        System.out.println("favNumbers = " + favNumbers);

        // tracking the size as we go
        System.out.println("favNumbers.size = " + favNumbers.size());

        // other common methods: .contains, .lastIndexOf, .isEmpty, .remove

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.add("darker roast");

        System.out.println("roasts.contains(\"dark\") = " + roasts.contains("dark"));
        // find roast in darker roast????
        System.out.println("roasts.contains(\"roast\") = " + roasts.contains("roast"));
        System.out.println("roasts.contains(\"darker roast\") = " + roasts.contains("darker roast"));

        // find the last 7 in favNumbers
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.lastIndexOf(7) = " + favNumbers.lastIndexOf(7));

        // isEmpty
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("emptyList.isEmpty() = " + emptyList.isEmpty());
        System.out.println("roasts.isEmpty() = " + roasts.isEmpty());

        // .remove
//        Integer toRemove = new Integer(7); // removes first index of 7
//        favNumbers.remove(toRemove); // removes first index of 7
        favNumbers.remove(3); // removes index of 7 that we indicated, which is last
        System.out.println("favNumbers = " + favNumbers);


    }

}
