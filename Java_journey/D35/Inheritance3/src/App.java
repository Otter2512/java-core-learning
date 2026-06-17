public class App {
    public static void main(String[] args) throws Exception {
        Polish polish = new Polish("Tomek", 2015);

        Vietnamese vnmese = new Vietnamese("Phong", 2003);

        American ame = new American("Michael", 2030);
    
        polish.sayHi();

        vnmese.sayHi();

        ame.sayHi();
    }
}
