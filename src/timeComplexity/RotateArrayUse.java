package timeComplexity;

public class RotateArrayUse {
	
	 public static int[] rotate(int[] arr, int d) {
		
		if(d > arr.length) {
			d = d % arr.length;
		}
		
		int[] newArray = new int[arr.length];
		int k=0;
		for(int i=d;i<arr.length;i++) {
			newArray[k++] = arr[i]; 
		}
		int l=0;
		while(k<arr.length) {
			newArray[k++] = arr[l++];
		}
		
       for(int i=0;i<arr.length;i++) {
    	   arr[i] = newArray[i];
       }

        return arr;
	 }
	 

}