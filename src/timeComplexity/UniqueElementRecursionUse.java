package timeComplexity;

public class UniqueElementRecursionUse {
	
	
	public static int findUnique(int[] arr, int i) {
		// TODO Auto-generated method stub
		
		if(i == (arr.length)) {
			return 0;
		}
		
		int sum  = findUnique(arr,i+1);
		sum = sum ^ arr[i];
				
		return sum;
	}
	
	public static int findUnique(int[] arr) {
		//Your code goes here
	
		return findUnique(arr,0);
		
		
  }
}
	


