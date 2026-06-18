public class Car extends Vehicle{
    private String typeOfFuel;

    public Car(String typeOfFuel, Manufacturer manufacturer) {
        super("Car", manufacturer);
        this.typeOfFuel = typeOfFuel;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public double getSpeed() {
        return 60;
    }
}
