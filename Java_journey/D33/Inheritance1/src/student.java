public class student extends human{
    private String className, tenTruong;

    public student(String fullName, int birthOfYear, String className, String tenTruong) {
        super(fullName, birthOfYear);
        this.className = className;
        this.tenTruong = tenTruong;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getTenTruong() {
        return tenTruong;
    }
    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public void doHomework(){
        System.out.println("1+1 = 2");
    }
}

