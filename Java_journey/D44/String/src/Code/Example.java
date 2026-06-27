package Code;

public class Example {
    public static void main(String[] args) {
        String s1 = "Xin chao cac ban, xin chao co chu, Xin chao!";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        char c1 = 'o';

        // Hàm indexOf
        System.out.println("Vi tri cua s2 trong s1 la: "+s1.indexOf(s2));
        System.out.println("Vi tri cua s3 trong s1 la: "+s1.indexOf(s3));

        // Su dung vi tri bat dau
        System.out.println("Vi tri cua s2 trong s1 la: "+s1.indexOf(s2, 2));

        // Tim kiem char
        System.out.println("Vi tri cua c1 trong s1 la: "+s1.indexOf(c1));
        System.out.println("Vi tri cua c1 trong s1 la: "+s1.indexOf(c1, 20));

        // Hàm lastIndexOf => Tìm từ phải sang trái
        System.out.println("Vi tri cua s2 trong s1 (tu phai sang trai) la: "+s1.lastIndexOf(s2));
        System.out.println("Vi tri cua s3 trong s1 (tu phai sang trai) la: "+s1.lastIndexOf(s3));

        // fileName = "Homework.excel.lop12.xls";
    }
}
