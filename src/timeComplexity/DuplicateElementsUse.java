package timeComplexity;

public class DuplicateElementsUse {

	public static int findDuplicate(int[] input) {
		// TODO Auto-generated method stub
		
		int length = input.length;

		int sum = ((length-1)*(length-2))/2;
		int arraySum=0;
		for(int i=0;i<input.length;i++) {
			arraySum = arraySum + input[i];
		}
		return arraySum-sum;

	}
		
}
