package Test;

import Code.Infor;

public class test {
    private Infor infor;

    public void method(){
//      this.infor.a => Can't access (private)
//      this.infor.b => Can't access (diff package)
//      this.infor.c => Can't access
        this.infor.d = 2; 
    }
}
