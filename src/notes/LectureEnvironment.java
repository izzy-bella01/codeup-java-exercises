package notes;

public class LectureEnvironment {
    public static void main(String[] args) {
        // using Person blueprint
        Person thisPerson = new Person();

        // now: instance variables to fulfill unique properties of a Person
        thisPerson.firstName = "samuel";
        thisPerson.lastName = "clemens";

        System.out.println(thisPerson.sayHello());

        // arithmetic: it wouldn't be proper to start of by making an instance of it
//        Arithmetic kensMath = new Arithmetic();
//        System.out.println(kensMath.pi);

        // instead talk to it in a non-instance way
        System.out.println(Arithmetic.pi);

        System.out.println("Arithmetic.add(3,6) = " + Arithmetic.add(3,6));
        System.out.println("Arithmetic.multiply(4,8) = " + Arithmetic.multiply(4, 8));

        Person mcPerson = new Person("Kurt", "Vonnegut", 60, "taken");
        System.out.println(mcPerson.shareAge());
    }
}
