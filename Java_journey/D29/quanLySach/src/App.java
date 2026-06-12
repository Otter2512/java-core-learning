public class App {
    public static void main(String[] args) throws Exception {
        date date1 = new date(15, 5, 2021);
        date date2 = new date(15, 9, 2030);
        date date3 = new date(15, 9, 2025);

        tacGia tacgia1 = new tacGia("Phong", date1);
        tacGia tacgia2 = new tacGia("Vinh", date2);
        tacGia tacgia3 = new tacGia("Vy", date3);
        
        sach sach1 = new sach("Lap trinh C", 50000, 2023, tacgia1);
        sach sach2 = new sach("Lap trinh Java", 10000, 2019, tacgia2);
        sach sach3 = new sach("Lap trinh Ruby", 15000, 2019, tacgia3);
    
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("So sanh sach 1 va 3: "+ sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("So sanh sach 2 va sach 3: "+ sach2.kiemTraCungNamXuatBan(sach3));
    
        System.out.println("Sach 1 giam 10% con "+ sach1.giaSauKhiGiam(10));
        System.out.println("Sach 2 giam 10% con "+ sach2.giaSauKhiGiam(20));
        System.out.println("Sach 3 giam 10% con "+ sach3.giaSauKhiGiam(50));
    }
}
