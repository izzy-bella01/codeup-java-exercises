public class Person {

    private String name;

// METHODS
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name + "!");
    }

// CONSTRUCTOR
    public Person(String userName) {
        name = userName;
    }

    public static void main(String[] args) {
        Person ada = new Person("ada");
        System.out.println("ada.getName() = " + ada.getName());
        ada.setName("Bella");
        ada.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // john
//        System.out.println(person2.getName()); // john
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // jane
//        System.out.println(person2.getName()); // jane

    }
}

