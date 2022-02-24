package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        Scanner enterRadius = new Scanner(System.in);
        double userRadius = enterRadius.nextDouble();

        Circle myCircle = new Circle(userRadius);
        System.out.println("Area of your circle: " + myCircle.getArea());
        System.out.println("Circumference of your circle: " + myCircle.getCircumference());
    }
}
