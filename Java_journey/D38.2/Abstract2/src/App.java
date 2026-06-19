

public class App {
    public static void main(String[] args) throws Exception {
        Manufacturer m1 = new Manufacturer("Toyota", "Japan");
        Manufacturer m2 = new Manufacturer("Sony", "Korea");
        Manufacturer m3 = new Manufacturer("Mercedes", "USA");

        // Set plane to get some method
        Plane p = new Plane("Petro", m1);
        Bike b = new Bike(m2);
        Car c = new Car("Petro", m3);

        System.out.println("1. Get the manufacturer is name: \n");
        System.out.println("Plane's manufacturer: "+p.getOneNameOfManufacturer()+"\n");
        System.out.println("Bike's manufacturer: "+b.getOneNameOfManufacturer()+"\n");
        System.out.println("Car's manufacturer: "+c.getOneNameOfManufacturer()+"\n");

        System.out.println("2. Get the vehicle's speed: \n");
        System.out.println("Plane's speed: "+p.getSpeed()+"\n");
        System.out.println("Bike's speed: "+b.getSpeed()+"\n");
        System.out.println("Car's speed: "+c.getSpeed()+"\n");

        System.out.print("Car (start): ");
        c.start();
        System.out.print("Car (Accelerate): ");
        c.accelerate();
        System.out.print("Car (Stop): ");
        c.stop();
        System.out.println("\n");

        System.out.print("Plane (Takes off): ");
        p.takesOff();
        System.out.print("Plane (Land): ");
        p.landing();
    }
}
