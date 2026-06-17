public class App {
    public static void main(String[] args) throws Exception {
        myMath mm = new myMath();
        System.out.println("min(5.6, 7.5) = " + mm.findMin(5.6, 7.5));

        System.out.println("min(3, 5.6) = " + mm.findMin(3, 5));

        System.out.println("Total (5.8, 6.1) = "+mm.total(5.8, 6.1));

        double arr[] = new double[] {1.9, 2.8, 3.7, 4.6, 5.5};
        System.out.println("Total(arr) = "+mm.total(arr));
    }
}
