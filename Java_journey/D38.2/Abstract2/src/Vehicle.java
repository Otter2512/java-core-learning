public abstract class Vehicle {
    protected String typeOfVehicle;
    protected Manufacturer manufacturer;

    public Vehicle(String typeOfVehicle, Manufacturer manufacturer) {
        this.typeOfVehicle = typeOfVehicle;
        this.manufacturer = manufacturer;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }
    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOneNameOfManufacturer(){
        return this.manufacturer.getNameOfManufacturer();
    }

    public void start(){
        System.out.println("Start run....");
    }

    public void accelerate(){
        System.out.println("Drive fast....");
    }

    public void stop(){
        System.out.println("Stop....");
    }   

    public abstract double getSpeed();
}
