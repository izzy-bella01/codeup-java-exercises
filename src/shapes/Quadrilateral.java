package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    // fields
    protected int length;
    protected int width;

    // constructor
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // methods
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // abstract methods
    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}
