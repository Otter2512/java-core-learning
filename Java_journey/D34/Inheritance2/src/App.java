public class App {
    public static void main(String[] args) throws Exception {
        dog dog1 = new dog();
        dog1.eat();
        dog1.bark();

        babyDog bbd1 = new babyDog();
        bbd1.eat();
        bbd1.bark();
        bbd1.weep();
        bbd1.name="Baby Dog";
    }
}
