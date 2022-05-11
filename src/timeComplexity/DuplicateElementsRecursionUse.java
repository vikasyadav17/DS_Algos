package timeComplexity;

public class DuplicateElementsRecursionUse {
	
	public static int findDuplicate(int[] arr, int i) {
		
		if(i == arr.length) {
			return 0;
		}
		
		int sum = findDuplicate(arr, i+1);
		sum = sum + arr[i];
		
		return sum;
	}
	
	
	
	public static int findDuplicate(int[] arr) {
		//Your code goes here

		int resultant =    findDuplicate(arr,0);
		
		int expected = ((arr.length-1)*(arr.length-2))/2;
		
		return resultant - expected;
	
	
	}


}
