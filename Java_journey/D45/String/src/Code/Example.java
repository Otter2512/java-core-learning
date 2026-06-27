package Code;

public class Example {
    public static void main(String[] args) {
        String s1 = "tItv";
        String s2 = ".vn";

        // Ghép chuỗi bình thường
        String s3 = s1 + s2;

        //Hàm concat => nối chuỗi
        String s4 = s1.concat(s2);

        System.out.println("s3 = "+ s3);
        System.out.println("s4 = "+ s4);

        // Hàm replace => thay thế
        String s5 = "Phong.vn";
        String s6 = s5.replaceAll("Phong", "TITV");
        System.out.println("s6 = "+s6);

        // Hàm toLowerCase => chuyển về viết thường
        String s7 = s3.toLowerCase();
        System.out.println("s7 = "+s7);

        // Hàm toUpperCase => chuyển về viết hoa
        String s8 = s3.toUpperCase();
        System.out.println("s8 = "+s8);

        // Hàm trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
        String s9 = "        Xin chao cac ban, minh la Phong.vn    ";
        System.out.println("s9 (no trim()) = "+s9);
        System.out.println("s9 = "+s9.trim());

        // Hàm subString => Cắt chuỗi con
        String s10 = "Xin chao cac ban, minh la Phong.vn";
        String s11 = s10.substring(10);
        String s12 = s10.substring(10, 15);
        System.out.println("s11 = "+s11);
        System.out.println("s12 = "+s12);
    }
}
