public class App {
    public static void main(String[] args) throws Exception {
        human human1 = new human("Phong", 2003);
        human1.eat();
        human1.drink();
        human1.sleep();
        System.out.println("\n");
        student student1 = new student("Phong", 2003, "Lop 1", "HSU");
        student1.eat();
        student1.drink();
        student1.sleep();
        student1.doHomework();
    }
}
