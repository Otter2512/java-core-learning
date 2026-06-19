public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Caculator\n");
        caculatorCasioFX500 mfx500 = new caculatorCasioFX500();
        caculatorVinaCal500 mvn500 = new caculatorVinaCal500();

        System.out.println("5 + 3 = "+mfx500.add(5, 3));
        System.out.println("4 * 5 = "+mvn500.multiply(4, 5) );
        System.out.println("4/0 = "+mvn500.divide(4, 0));

        double arr [] = new double [] {5, 1, 3 , 4, 5, 8, 0};
        double arr2 [] = new double [] {21, 2, 7, 90, 211, 4, 5};

        System.out.println("2. Sort\n");
        insertSort iSort = new insertSort();
        optionSort oSort = new optionSort();

        iSort.sortAscend(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        oSort.sortDescend(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        System.out.println("3. pcSoftware\n");
        pcSoftware pcs = new pcSoftware();
        System.out.println("5 - 6 = "+pcs.subtract(5, 6) );
        
        double arr3 [] = new double [] {2000, 1, 45.6, 56789.1};
        pcs.sortDescend(arr3);
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
