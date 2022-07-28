package hashmap;

public class LongestSubsetZeroSumUse {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here

		if(arr.length==0) {
			return 0;
		}
		
		
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int currentLength=0;
			int sum=0;
			for(int j=i;j<arr.length;j++){
				sum = sum + arr[j];
				currentLength++;
				if(sum==0) {
					if(currentLength > count) {
						count= currentLength;
					}
				}
			}
			
		}
		
		
	return count;
	
	}
	
	
}
