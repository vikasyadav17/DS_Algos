package recursion;

public class QuickSortUse {

	private static void swap(int[] input, int i, int pivot) {
		// TODO Auto-generated method stub
		int temp = input[i];
		input[i] = input[pivot];
		input[pivot] = temp;

	}

	private static int partition(int[] input, int sI, int eI) {

		int pivot = input[eI];

		int swappingIndex = (sI - 1);
		for (int i = sI; i <= eI - 1; i++) {

			if (pivot > input[i]) {
				swappingIndex++;
				swap(input, swappingIndex, i);
     		}
		}
		swap(input, swappingIndex + 1, eI);
		return (swappingIndex + 1);

	}

	public static void quickSort(int[] input, int sI, int eI) {

		if (sI >= eI)
			return;

		int pivotPosition = partition(input, sI, eI);
		
		quickSort(input, sI, pivotPosition - 1);
		quickSort(input, pivotPosition + 1, eI);

	}

}
