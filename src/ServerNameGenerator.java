import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        System.out.println(randomAdj() + "-" + randomNoun());
    }

    public static String randomAdj() {
        String[] adjective = {"charming", "cruel", "fantastic", "huge", "gentle", "perfect", "loyal", "shiny", "adorable", "brave"};

        Random adjIndex = new Random();
        int randomNum = adjIndex.nextInt(adjective.length);

        return adjective[randomNum];
    }

    public static String randomNoun() {
        String[] noun = {"baby", "truck", "dog", "panda", "king", "doll", "bird", "farm", "waiter", "dentist"};

        Random nounIndex = new Random();
        int randomNum = nounIndex.nextInt(noun.length);

        return noun[randomNum];
    }


}
