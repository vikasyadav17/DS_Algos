package timeComplexity;



public class UniqueElementUse {

	public static int findUnique(int[] arr) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=0;i<arr.length;i++) {
			 result = result^arr[i]; 
		}
		
		
		return result;
	}

// XOR of two same numbers will always be zero
	
	

}
