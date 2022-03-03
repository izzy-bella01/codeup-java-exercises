package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable mySquareShape = new Square(5);
        Measurable myRectangleShape = new Rectangle(9,4);

        System.out.println("mySquareShape Area: " + mySquareShape.getArea());
        System.out.println("mySquareShape Perimeter: " + mySquareShape.getPerimeter());

        System.out.println();
        System.out.println("----------------------");

        System.out.println("myRectangleShape Area: " + myRectangleShape.getArea());
        System.out.println("myRectangleShape Perimeter: " + myRectangleShape.getPerimeter());



        // 9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // ---> Rectangle is not abstract and doesn't override getPerimeter in Measurable

        // 10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        // ---> Not able to access getLength or getWidth, those methods are not in Measurable


        // PREVIOUS EXERCISE WORK
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("Area of box1: " + box1.getArea());
//        System.out.println("Perimeter of box1: " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Area of box2: " + box2.getArea());
//        System.out.println("Perimeter of box2: " + box2.getPerimeter());

    }
}
