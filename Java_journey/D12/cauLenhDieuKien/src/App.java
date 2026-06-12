
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int so;

        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so nguyen n: ");
        so = sc.nextInt();

        if(so % 2 == 0){
         System.out.println("So " + so + " la so chan");
        }else{
            System.out.println("So " + so + " la so le");
        }
    }
}
