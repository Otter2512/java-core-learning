import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.println("Kiem tra may so " + i);
            
            System.out.println("Nhap tinh trang (1 = Tot, 2 = Loi): ");
            int tinhTrang = sc.nextInt();

            switch (tinhTrang) {
                case 1:
                    System.out.println("Tot => Pass");
                    break;
                case 2:
                    System.out.println("Loi => Nhap bao hanh (1 -> Con, 0 -> Het / Khong co) ");
                    int conBaoHanh = sc.nextInt();

                    if(conBaoHanh == 1){
                        System.out.println("Gui hang de duoc sua mien phi :>");
                    }else{
                        System.out.println("Tu chi tra chi phi sua chua");
                    }
                break;
                default:
                    System.out.println("Nhap sai ma!!!");
            }
            System.out.println("=====================================================");
        }
        sc.close();
    }
}