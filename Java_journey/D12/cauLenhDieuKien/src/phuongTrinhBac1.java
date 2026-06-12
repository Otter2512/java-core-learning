
import java.util.Scanner;

public class phuongTrinhBac1 {
    public static void main(String[] args) {
        
        double a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();

        if (a == 0){
            if(b == 0){
                System.out.println("PT vo so nghiem");
            }else{
                System.out.println("PT vo nghiem");
            }
        }else{
            double x = -b/a;
            System.out.println("PT co nghiem la " + x);
        }
    }
}
