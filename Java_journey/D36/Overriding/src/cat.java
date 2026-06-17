
public class cat extends animal {

    public cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    @Override
    public void eat() {
        System.out.println("I love fish");
    }
}
