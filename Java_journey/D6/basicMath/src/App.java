
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Nhap a = ");
        a = sc.nextInt();

        System.out.println("Nhap b = ");
        b = sc.nextInt();

        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + thuong);

        int nhan = a * b;
        System.out.println(a + " * " + b + " = " + nhan);

        int soDu = a % b;
        System.out.println(a + " % " + b + " = " + soDu);
    }
}
