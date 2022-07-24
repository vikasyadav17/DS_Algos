package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequenceUse {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

		/*
		 * 7 15 24 23 12 19 11 16
		 */

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 1);

		}
		int start = 0;
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			int x = 1, max = 1;
			while (map.containsKey(arr[i] + x)) {
				max++;
				x++;
			}
			if (max > maxLength) {
				start = arr[i];
				maxLength = max;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(start);
		list.add(start + maxLength - 1);
		return list;
	}
}
