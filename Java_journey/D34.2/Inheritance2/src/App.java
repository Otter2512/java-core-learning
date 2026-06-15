public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        dog dog1 = new dog();
        dog1.eat();
        dog1.bark();
        System.out.println("/n");
        cat cat1 = new cat();
        cat1.eat();
        cat1.meow();
        System.out.println("/n");
        bird bird1 = new bird();
        bird1.eat();
        bird1.fly();
    }
}
