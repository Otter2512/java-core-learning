public class Manufacturer {
    private String nameOfManufacturer, country;
    
    public Manufacturer(String nameOfManufacturer, String country) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.country = country;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
