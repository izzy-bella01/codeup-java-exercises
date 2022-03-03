package shapes;

public class Square extends Quadrilateral {
//
    protected int side;

    public Square(int side) {
        super(side,side);
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {
        return side * side;
    }

    public void setLength(int side) {
        this.side = side;
    }

    public void setWidth(int side) {
        this.side = side;
    }
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    //perimeter = 4 x side
//    //area = side ^ 2
//
//    public int getArea() {
//        int area = side * side;
//        System.out.println("area overriding: " + area);
//        return area;
//    }
//
//    public int getPerimeter() {
//        int perimeter = 4 * side;
//        System.out.println("perimeter overriding: " + perimeter);
//        return perimeter;
//    }
}
