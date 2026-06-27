package Code;

public class Example {
    public static void main(String[] args) {
        String s1 = "titv.vn";
        String s2 = "TITV.vn";
        String s3 = "titv.vn";
        String s4 = "ti tv.vn";
        
        // Hàm equals => So sánh 2 chuỗi giống nhau, có phân biệt hoa thường, space,..
        System.out.println("s1 equals s2: "+s1.equals(s2));
        System.out.println("s1 equals s3: "+s1.equals(s3));
        System.out.println("s1 equals s4: "+s1.equals(s4));
        System.out.println("");

        // Hàm equalsIgnoreCase => So sánh 2 chuỗi giống nhau, không phân biệt hoa thường, space,...
        System.out.println("s1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: "+s1.equalsIgnoreCase(s3));
        System.out.println("");

        // Hàm compareTo => So sánh > < =, phân biệt chữ hoa chữ thường
        String sv1 = "Nguyễn Văn A";
        String sv11 = "nguyễn Văn a";
        String sv2 = "Nguyễn Văn B";
        String sv3 = "Nguyễn Văn";
        String sv4 = "Nguyễn Văn A";

        System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
        System.out.println("sv11 compareTo sv1: "+sv11.compareTo(sv1));
        System.out.println("");

        // Hàm compareToIgnoreCase => So sánh > < =, không phân biệt chữ hoa chữ thường
        System.out.println("sv1 compareToIgnoreCase sv2: "+sv1.compareToIgnoreCase(sv2));
        System.out.println("sv1 compareToIgnoreCase sv3: "+sv1.compareToIgnoreCase(sv3));
        System.out.println("sv1 compareToIgnoreCase sv4: "+sv1.compareToIgnoreCase(sv4));
        System.out.println("sv11 compareToIgnoreCase sv1: "+sv11.compareToIgnoreCase(sv1));
        System.out.println("");

        // Hàm regionMatches => So sánh 1 đoạn
        String r1 = "TITV.vn";
        String r2 = "TV.v";
        boolean check = r1.regionMatches(2, r2, 0, 4);
        System.out.println(check);
        System.out.println("");

        // Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng....
        String phoneNum = "037456789";

        System.out.println(phoneNum.startsWith("037"));
        System.out.println(phoneNum.startsWith("034"));
        System.out.println("");

        // Hàm startWith => Hàm kiểm tra chuỗi kết thúc bằng....
        String fileName = "I love you.jpg";
        String fileName2 = "Java.pdf";

        if(fileName.endsWith("jpg")){
            System.out.println("File is picture!");
        }else if(fileName.endsWith("pdf")){
            System.out.println("File is pdf file!");
        }

        if(fileName2.endsWith("jpg")){
            System.out.println("File is picture!");
        }else if(fileName2.endsWith("pdf")){
            System.out.println("File is pdf file!");
        }
    }
}
