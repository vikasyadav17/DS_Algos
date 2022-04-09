package timeComplexity;

public class RotateArrayUse {
	
	 public static void rotate(int[] arr, int d) {
		 if(d==0) {
			 return ;
		 }
		 d= d % arr.length;
		
		 int i=0;
		 while(i<d) {
			 int temp = arr[0];
			 for(int j=0;j<arr.length-1;j++) {
				 arr[j]=arr[j+1];
			 }
			 arr[arr.length-1] = temp;
			 i++;
		 }
		 
	 }

}
