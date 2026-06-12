public class App {
    public static void main(String[] args) throws Exception {
        
        NgayChieu ngayChieu1 = new NgayChieu(25, 12, 2001);
        NgayChieu ngayChieu2 = new NgayChieu(04, 02, 2002);
        NgayChieu ngayChieu3 = new NgayChieu(14, 07, 2003);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Net Marble", "China");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Kappa", "Japan");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Ghlibi", "Japan");
        
        BoPhim phim1 = new BoPhim("Death note", 2001, hangSanXuat1, 100000, ngayChieu1);
        BoPhim phim2 = new BoPhim("Naruto", 2002, hangSanXuat2, 200000, ngayChieu2);
        BoPhim phim3 = new BoPhim("One piece", 2003, hangSanXuat3, 30000, ngayChieu3);

        System.out.println("Kiem tra gia ve phim 1 va phim 2: "+phim1.kiemTraGiaVe(phim2));
        System.out.println("Kiem tra gia ve phim 2 va phim 3: "+phim2.kiemTraGiaVe(phim3));
        System.out.println("Kiem tra gia ve phim 1 va phim 3: "+phim1.kiemTraGiaVe(phim3));

        System.out.println("Ten hang san xuat phim "+phim1.getTenPhim()+" la "+phim1.getHangSanXuat());
        System.out.println("Ten hang san xuat phim "+phim2.getTenPhim()+" la "+phim2.getHangSanXuat());
        System.out.println("Ten hang san xuat phim "+phim3.getTenPhim()+" la "+phim3.getHangSanXuat());

        System.out.println("Gia ve phim " + phim1.getTenPhim() + " giam 10%: "+phim1.giaVeKhuyenMai(10));
        System.out.println("Gia ve phim " + phim2.getTenPhim() + " giam 90%: "+phim2.giaVeKhuyenMai(90));
        System.out.println("Gia ve phim " + phim3.getTenPhim() + " giam 2%: "+phim3.giaVeKhuyenMai(2));
    }
}
