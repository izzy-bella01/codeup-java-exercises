package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
    public double getCircumference() {
        double area = Math.PI * (radius * radius);
        return area;
    }
}
