public class App {
    public static void main(String[] args) throws Exception {
        // int out, in = 0;
        // for(out = 0; out < 10; out++){
        //     for(in = 0; in < 20; in++){
        //         if(in > 10)
        //             break;
        //     }
        //     System.out.println("inside the outer loop: out = " + out + ", inside the inner loop: in = " + in);
        // }
        // System.out.println("outside the outer loop: out = " + out + ", outside the inner loop: in = " + in);
    
        int out, in = 0;
        outer: for(out = 0; out < 10; out++){
            for(in = 0; in < 20; in++){
                if(in > 10)
                    break outer;
            }
            System.out.println("inside the outer loop: out = " + out + ", inside the inner loop: in = " + in);
        }
        System.out.println("outside the outer loop: out = " + out + ", outside the inner loop: in = " + in);
    }
}
