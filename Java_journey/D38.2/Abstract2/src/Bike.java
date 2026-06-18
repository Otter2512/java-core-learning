public class Bike extends Vehicle {

    public Bike(Manufacturer manufacturer) {
        super("Bike", manufacturer);
    }

    @Override
    public double getSpeed() {
        return 20;
    }

}
