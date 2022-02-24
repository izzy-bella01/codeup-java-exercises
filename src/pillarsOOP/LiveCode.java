package pillarsOOP;

public class LiveCode {
    public static void main(String[] args) {
        Person chaucer = new Person("Chaucer");
        
        chaucer.sayHello();
        chaucer.sayGoodbye();
        System.out.println("chaucer.name = " + chaucer.name);
        System.out.println();

        //first example of instantiating and object with inheritance
        Employee mcKen = new Employee("McKenneth McHowell");

        System.out.println("mcKen.name = " + mcKen.name);
        mcKen.sayHello();
        mcKen.sayGoodbye();

        mcKen.department = "Delivery";
        System.out.println("mcKen.department = " + mcKen.department);

    }
}
