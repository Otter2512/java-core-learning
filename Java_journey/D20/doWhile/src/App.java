
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 1;
        Scanner sc = new Scanner(System.in);

        do { 
            System.err.println("Nhap vao n > 0: ");
            n = sc.nextInt();
        } while (n <= 0);
    }
}
