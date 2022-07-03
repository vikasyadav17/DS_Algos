package hashmap;

import java.util.HashMap;

public class MaximumFrequencyNumberUse {

	public static int maxFrequencyNumber(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		int number = Integer.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) > max) {
				max = map.get(arr[i]);
				number = arr[i];
			}
		}
		return number;
	}
}