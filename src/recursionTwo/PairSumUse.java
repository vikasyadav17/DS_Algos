package recursionTwo;

import java.util.Arrays;

public class PairSumUse {

	static int counter = 0;

	private static int pairSumCounter(int[] arr, int num, int i, int j) {
		// TODO Auto-generated method stub
		if (i < j) {

			if ((arr[i] + arr[j]) == num) {
				counter++;
				i++;
			}
			if ((arr[i] + arr[j]) > num)
				j--;
			if ((arr[i] + arr[j]) < num)
				i++;
			return pairSumCounter(arr, num, i, j);
		}
		return counter;

	}

	public static int pairSum(int[] arr, int num) {

		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return pairSumCounter(arr, num, 0, arr.length - 1);

	}

}
