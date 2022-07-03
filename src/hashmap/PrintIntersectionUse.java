package hashmap;

import java.util.HashMap;

public class PrintIntersectionUse {

	public static void printIntersection(int[] arr, int[] arr2) {

		if (arr.length == 0 || arr2.length == 0)
			return;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i]) + 1);

		}
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				if (map.get(arr2[i]) > 0) {
					System.out.println(arr2[i]);
					map.put(arr2[i], map.get(arr2[i]) - 1);

				}

			}

		}

	}
}
