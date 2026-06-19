public class insertSort implements Sort{

    @Override
    public void sortAscend(double[] arr) {
		double key;
		int i, j;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
    }

    @Override
    public void sortDescend(double[] arr) {
		double key;
		int i, j;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
