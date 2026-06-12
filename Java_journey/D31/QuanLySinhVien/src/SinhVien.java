public class SinhVien {
    private int maSoSV;
    private String hoVaTen;
    private Date date;
    private double diemTrungBinh;
    private Lop lop;
    
    public SinhVien(int maSoSV, String hoVaTen, Date date, double diemTrungBinh, Lop lop) {
        this.maSoSV = maSoSV;
        this.hoVaTen = hoVaTen;
        this.date = date;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public int getMaSoSV() {
        return maSoSV;
    }

    public void setMaSoSV(int maSoSV) {
        this.maSoSV = maSoSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public void kiemTraDiemTrungBinh(){
        if(this.diemTrungBinh >= 5.0){
            System.out.println("Thi sinh da dau");
        }else{
            System.out.println("Thi sinh da rot");
        }
    }

    public void kiemTraNgaySinh(Date dateX){
        if(this.date.equals(dateX)){
            System.out.println("2 ban co ngay sinh giong nhau?!?!");
        }else{
            System.out.println("2 ban co ngay sinh khac nhau!!!");
        }
    }
}
