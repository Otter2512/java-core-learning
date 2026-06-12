public class App {
    public static void main(String[] args) throws Exception {
        myDate md = new myDate(31,1, 2021);
        System.out.println("Day = "+md.getDay());

        md.setDay(25);
        System.out.println("Day = "+md.getDay());
    }
}
