public class Plane extends Vehicle{
    private String typeOfFuel;

    public Plane(String typeOfFuel, Manufacturer manufacturer) {
        super("Plane", manufacturer);
        this.typeOfFuel = typeOfFuel;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void takesOff(){
        System.out.println("Plane ready to fly....");
    }

    public void landing(){
        System.out.println("Plane is landing");
    }

    @Override
    public double getSpeed() {
        return 500;
    }
}
