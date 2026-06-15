public class human {
    private String fullName;
    private int birthOfYear;

    public human(String fullName, int birthOfYear) {
        this.fullName = fullName;
        this.birthOfYear = birthOfYear;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getBirthOfYear() {
        return birthOfYear;
    }
    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    public void eat(){
        System.out.println("nom nom nom");
    }

    public void drink(){
        System.out.println("uc uc uc");
    }

    public void sleep(){
        System.out.println("zZz..zzZ");
    }
}
