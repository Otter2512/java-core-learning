package test;

import code_a.example;

public class testExample {
    public static void main(String[] args) {
        example exam = new example(5, 6);
        System.out.println("Number of a and b: "+exam.getA()+", "+exam.getB());
        
        code_b.example exam2 = new code_b.example(1, 0);
        System.out.println("Number of c and d: "+exam2.getC()+", "+exam2.getD());
    }
}
