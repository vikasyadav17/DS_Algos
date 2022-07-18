package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PairSumToZeroUse {

	public static int PairSum(int[] input, int size) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		if (input.length == 0 || input.length == 1) {
			return 0;
		}
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			
			
			if (map.containsKey(input[i])) {
				map.put(input[i],map.get(input[i]) + 1);
			}

			else
				map.put(input[i], 1);

		}
		
		for(Integer i : map.keySet()) {
			if(map.containsKey(-i) && i!=0) {
				count = count + map.get(i) * map.get(-i);
				map.put(i, 0);
			}
			
		}
		
		if(map.containsKey(0)) {
			if(map.get(0)!=1) {
                int val = map.get(0);
				count= count + val*(val-1)/2;
			}
		}
		
		
		return count;
	}
}
