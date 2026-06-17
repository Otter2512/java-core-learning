public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Test dog: ");
        dog d = new dog();
        d.eat();
        d.makeSound();
        d.sleep();

        System.out.println("\nTest cat: ");
        cat c = new cat();
        c.eat();
        c.makeSound();
        c.sleep();

        System.out.println("\n Test bird: ");
        bird b = new bird();
        b.eat();
        b.makeSound();
        b.sleep();
    }
}
