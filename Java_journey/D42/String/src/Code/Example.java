package Code;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập vào chuỗi: ");
        s = sc.nextLine();
        System.out.println("------------");

        // Function Length() -> Lấy độ dài chuỗi
        System.out.println(s.length());
        int lengthTest = s.length();

        // Function charAt(vị trí) -> Lấy ra 1 ký tự tại vị trí
        for(int i = 0; i < lengthTest; i++){
            System.out.println("Vị trí "+i+" là: "+s.charAt(i));
        }

        // Function getChars (vị trí bắt đầu, vị trí kết thúc, mảng dữ liệu, vị trí bắt đầu lưu của mảng)
        char arrChar [] = new char [100];
        s.getChars(2, 5, arrChar, 0);
        for(int i = 0; i < arrChar.length; i++){
            System.out.println("Valuable of array at "+i+" is "+arrChar[i]);
        }

        // getBytes => Có 3 cách lấy ra giá trị của các ký tự
        byte [] arrayBytes = s.getBytes();
        for(byte b : arrayBytes){
            System.out.println(b);
        }
    }
}
