package recursionTwo;

public class BinarySearchUsingRecursionUse {

	
	private static int binarySearch(int[] input,int beginIndex , int endIndex, int element) {
		// TODO Auto-generated method stub
		
		if(beginIndex <= input.length -1  && endIndex >= beginIndex ) {
		
		
		int mid = beginIndex + (endIndex - beginIndex)/2;
		if(input[mid] == element) return mid;
		if(input[mid] > element) {
			return binarySearch(input, beginIndex, mid-1, element);
		}
		else  return binarySearch(input,mid+1,endIndex,element);
		
			
	 }
		return -1;
}		
	
	public static int binarySearch(int[] input, int element) {
		// TODO Auto-generated method stub
		return binarySearch(input, 0 ,input.length-1 , element);		
	}
}
