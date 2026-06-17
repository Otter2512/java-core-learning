public class human {
    protected String fullName;
    protected int yearOfBirth;

    public human(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void eat(){
        System.out.println("Nom nom nom");
    }

    public void sleep(){
        System.out.println("zzz...zZZ");
    }
}
