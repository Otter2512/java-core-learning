import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ho va ten sinh vien: ");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhap vao mssv: ");
        long mssv = sc.nextLong();

        System.out.println("Nhap vao diem thi: ");
        float diemThi = sc.nextFloat();

        System.out.println("=============================");
        System.out.println("Ho va ten la " + hoVaTen);
        System.out.println("MSSV la " + mssv);
        System.out.println("Diem thi la " + diemThi);
    }
}