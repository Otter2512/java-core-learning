public class bird extends animal{

    public bird() {
        super("Bird");
    }
    
    public void fly(){
        System.out.println("Flying....");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void eat() {
        System.out.println("I love little worm");
    }
}
