import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.println("Nhap vao so a = ");
        a = sc.nextFloat();

        System.out.println("a = "+ a);
        
        // a = a + 3
        a+=3;
        System.out.println("a+=3 : "+ a);

        // a = a - 2
        a-=2;
        System.out.println("a-=2 : "+ a);

        // a = a * 3
        a*=3;
        System.out.println("a*=3 :"+ a);

        // a = a/3
        a/=3;
        System.out.println("a/=3 :"+ a);

        // a = a%4
        a%=3;
        System.out.println("a%=3 :"+ a);
    }
}
