public class optionSort implements Sort{

    @Override
    public void sortAscend(double[] arr) {
		int i, j, min_idx;
		for (i = 0; i < arr.length - 1; i++) {
			min_idx = i;
			for (j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			double temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
    }

    @Override
    public void sortDescend(double[] arr) {
		int i, j, min_idx;
		for (i = 0; i < arr.length - 1; i++) {
			min_idx = i;
			for (j = i + 1; j < arr.length; j++)
				if (arr[j] > arr[min_idx])
					min_idx = j;
			double temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
}
