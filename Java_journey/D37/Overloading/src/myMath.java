public class myMath {
    public int findMin(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    public double findMin(double a, double b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    public double total(double a, double b){
        return a+b;
    }

    public double total(double[] arr){
        double tong = 0;
        for (int i = 0; i < arr.length; i++){
            tong+=arr[i];
        }
        return tong;
    }
}
