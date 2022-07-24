package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class PairWithDifferenceKUse {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		// Write your code here

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Inserting alll elements in the hashmap
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);

		}
		int count = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (k == 0) {
				count = count + entry.getKey() * (entry.getKey() - 1) / 2;
			}

			else if (map.containsKey(entry.getKey() - k)) {
				if (entry.getValue() == 1 && map.get(entry.getKey() - k) == 1) {
					count++;
				}
				else {
					
					
					count = count + entry.getValue() * map.get(entry.getKey()-k);
				}

			}

		}

		return count;
	}

}
