
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double discount;
        hoaDonCaPhe hd = new hoaDonCaPhe("Robustar Honey", 300000, 2.5);
        hoaDonCaPhe hd2 = new hoaDonCaPhe("Trung Nguyen", 200000, 0);
        System.out.println("Tong tien: "+hd.tinhTongTien());
        System.out.println("Kiem tra khoi luong > 2kg: "+hd.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiem tra tong tien lon hon 500k: "+hd.kiemTraTongTienLonHon500K());

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap % giam gia: ");
        discount = sc.nextDouble();

        System.out.println("Gia hoa don da giam gia: "+hd.tinhGiaSauGiam(discount));
    }
}
