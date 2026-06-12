public class App {
    public static void main(String[] args) throws Exception {
        QuocGia quocGia1 = new QuocGia(84, "Vietnam");
        QuocGia quocGia2 = new QuocGia(86, "China");

        HangSanXuat hangSanXuat1 = new HangSanXuat("Nuoc cot dua", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Mapo Tofu", quocGia2);

        NgaySanXuat ngaySanXuat1 = new NgaySanXuat(25, 01, 2021);
        NgaySanXuat ngaySanXuat2 = new NgaySanXuat(03, 04, 2018);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngaySanXuat1, 25000, 05);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngaySanXuat2, 35000, 11);

        System.out.println(mayTinh1.kiemTraGiaMayTinh(mayTinh2));

        System.out.println(mayTinh1.layTenQuocGia());
        System.out.println(mayTinh2.layTenQuocGia());
    }
}
