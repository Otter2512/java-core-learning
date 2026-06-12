public class hoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public hoaDonCaPhe(String ten, double gia1Kg, double kl){
        this.tenLoaiCaPhe = ten;
        this.giaTien1Kg = gia1Kg;
        this.khoiLuong = kl;
    }

    public double tinhTongTien(){
        return this.giaTien1Kg * this.khoiLuong;
    }

    public boolean kiemTraKhoiLuongLonHon(double kl){
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTienLonHon500K(){
        return this.tinhTongTien() > 500000;
    }

    public double tinhGiaSauGiam(double discount){
        if(this.kiemTraTongTienLonHon500K()){
            return this.tinhTongTien() * (1 - discount/100);
        }
        return this.tinhTongTien();
    }
}

