public class Dot extends Shape{

    public Dot(Coordinate coordinate) {
        super(coordinate);
    }

    @Override
    public double area() {
        return 1;
    }
}
