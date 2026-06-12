public class tacGia {
    private String ten;
    private date ngaySinh;
    
    public tacGia(String ten, date ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
