public class App {
    public static void main(String[] args) throws Exception {
        Coordinate cdn1 = new Coordinate(51, 20);
        Coordinate cdn2 = new Coordinate(7, 9);
        Coordinate cdn3 = new Coordinate(12, 1);

        Shape s1 = new Dot(cdn1);

        Shape s2 = new Circle(cdn2, 4);

        Shape s3 = new Rectangle(cdn3, 25, 30);

        System.out.println("Area 1(Dot): "+s1.area());
        System.out.println("Area 2(Circle): "+s2.area());
        System.out.println("Area 3(Rectangle): "+s3.area());
    }
}
