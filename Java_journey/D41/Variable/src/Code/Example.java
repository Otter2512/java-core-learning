package Code;

public class Example {
    private Infor infor;

    public void method(){
//        this.infor.a => can't access it  
        this.infor.b = 2; // => can access it
        this.infor.d = 3; // => can access it
        this.infor.c = 4; // => can access it
    }
}
