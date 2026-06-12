
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //ax^2 + bx + c = 0
        
        double a, b, c, x1, x2, delta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap gia tri a: ");
        a = sc.nextDouble();
        System.out.println("Nhap gia tri b: ");
        b = sc.nextDouble();
        System.out.println("Nhap gia tri c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if(delta < 0){
            System.out.println("PT vo nghiem");
        }else if(delta == 0){
            x1 = x2 = -b/2*a;
            System.out.println("PT co nghiem kep la x1 =" + x1 + " = x2 = " + x2);
        }else{
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("PT co 2 la x1 = " + x1 + " va x2 = " + x2);
        }
    }
}
