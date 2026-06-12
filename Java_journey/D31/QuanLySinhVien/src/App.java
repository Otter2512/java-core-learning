public class App {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date(25, 12, 2003);
        Date date2 = new Date(22, 12, 2002);
        Date date3 = new Date(25, 12, 2003);

        Lop lop1 = new Lop("K21", "CNTT");
        Lop lop2 = new Lop("K20", "Ke Toan");
        Lop lop3 = new Lop("K21", "TMDT");

        SinhVien sv1 = new SinhVien(1, "Truong Vinh Phong", date1, 7.5, lop1);
        SinhVien sv2 = new SinhVien(2, "Tran Thi Thanh Vy", date2, 9.5, lop2);
        SinhVien sv3 = new SinhVien(3, "Phan Gia Hai", date3, 2.5, lop3);
    
        System.out.println(sv1.getHoVaTen()+" thuoc khoa "+lop1.getTenKhoa());
        System.out.println(sv2.getHoVaTen()+" thuoc khoa "+lop2.getTenKhoa());
        System.out.println(sv3.getHoVaTen()+" thuoc khoa "+lop3.getTenKhoa());

        System.out.print(sv1.getHoVaTen()+", ");
        sv1.kiemTraDiemTrungBinh();
        System.out.print(sv2.getHoVaTen()+", ");
        sv2.kiemTraDiemTrungBinh();
        System.out.print(sv3.getHoVaTen()+", ");
        sv3.kiemTraDiemTrungBinh();
        
        sv1.kiemTraNgaySinh(date2);
        sv2.kiemTraNgaySinh(date3);
        sv3.kiemTraNgaySinh(date1);
    }
}
