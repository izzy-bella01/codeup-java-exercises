package pillarsOOP;

public class LiveCode {
    public static void main(String[] args) {
//        Person chaucer = new Person("Chaucer");
//
//        chaucer.sayHello();
//        chaucer.sayGoodbye();
//        System.out.println("chaucer.name = " + chaucer.name);
//        System.out.println();
//
//        //first example of instantiating and object with inheritance
//        Employee mcKen = new Employee("McKenneth McHowell");
//
//        System.out.println("mcKen.name = " + mcKen.name);
//        mcKen.sayHello();
//        mcKen.sayGoodbye();
//
//        mcKen.department = "Delivery";
//        System.out.println("mcKen.department = " + mcKen.department);
//        System.out.println();
//
//
//        System.out.println("SUPERHERO TIME!!!!");
//        SuperHero theComedian = new SuperHero("Eddie Blake", "The comedian");
//        System.out.println("theComedian.getName() = " + theComedian.getName());
//        System.out.println("theComedian.getSecretIdentity() = " + theComedian.getSecretIdentity());

        // POLYMORPHISM
        Person one = new Person("McExample McPerson");
        Person two = new Employee("McExample McEmployee");

        one.sayGoodbye();
        two.sayGoodbye();

    }
}
