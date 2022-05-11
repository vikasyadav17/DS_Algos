package timeComplexity;

public class CheckArrayRotationUse {

	public static int arrayRotateCheck(int[] arr) {
		int count=0;
		for(int i=1;i<arr.length;i++) {
			if(arr.length-1 == i) {
			   return arr[i]>arr[i-1] ? 0 : i;
			}
			if(arr[i]>arr[i-1]) {
				count++;
			}
			if(arr[i]<arr[i-1]) {
				count++;
				return count;
			}
		}
		return count;
	}
}