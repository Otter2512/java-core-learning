public class dog extends animal{

    public dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }

    @Override
    public void eat() {
        System.out.println("I love bone");
    }
}
