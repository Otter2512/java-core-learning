
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 0;
    try {
        System.out.println("Nhap vao so nguyen n: ");
        n = sc.nextInt();
    } catch (Exception e) {
        System.out.println("Nhap kieu du lieu khong dung"); // try bị lỗi sẽ chạy
    } finally {
        System.out.println("Finally"); // dù đúng hay sai vẫn chạy
    }
        System.out.println("n = " + n);
        System.out.println("Ket thuc chuong trinh");
    }
}
