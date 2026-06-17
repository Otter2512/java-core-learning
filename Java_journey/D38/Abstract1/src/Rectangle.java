public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(Coordinate coordinate, double length, double width) {
        super(coordinate);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return this.length*this.width;
    }
}
