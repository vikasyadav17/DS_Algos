package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequenceUse {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int seqLength = 1;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}

		for (int i = 0; i < arr.length; i++) {
			int tempCount = 1;
			int k = 1;
			while (map.containsKey(arr[i] + k)) {
				tempCount++;
				k++;
			}
			if (tempCount > seqLength) {
				list.add(0, arr[i]);
				list.add(1, arr[i] + k);
				seqLength=tempCount;
			}
			if (tempCount == seqLength && seqLength != 1) {
				if (list.get(i) < arr[i]) {
					list.add(0, arr[i]);
					list.add(1, arr[i] + k);
				}
			}
		}

		return list;

	}

}
