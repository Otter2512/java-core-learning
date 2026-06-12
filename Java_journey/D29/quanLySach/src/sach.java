

public class sach {
    private String tenSach;
    private double giaSach;
    private int namXuatban;
    private tacGia tacGia;

    public sach(String tenSach, double giaSach, int namXuatban, tacGia tacGia) {
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.namXuatban = namXuatban;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public int getNamXuatban() {
        return namXuatban;
    }

    public void setNamXuatban(int namXuatban) {
        this.namXuatban = namXuatban;
    }

    public tacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(tacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void inTenSach(){
        System.out.println(this.tenSach);
    }

    public boolean kiemTraCungNamXuatBan(sach sachKhac){
        return this.namXuatban == sachKhac.namXuatban;
    }

    public double giaSauKhiGiam(double x){
        return this.giaSach * (1-x/100);
    }
}
