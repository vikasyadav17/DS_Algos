package recursionTwo;

import java.util.Arrays;

public class SubsetSumToKUse {
	
	
	 static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
	
	private static void printSubsetsSumTok(int[] arr, int i, int j, int k) {
		// TODO Auto-generated method stub
		
		if( i < j && j < (arr.length-1))  {
			
		if(arr[i] == k) {
			System.out.println(arr[i]);
			++i;
		}
		
		if( (arr[i] + arr[j]) == k ) {
			System.out.println( arr[i] + " " + arr[j]);
			++j;
		}
		if( (arr[i] + arr[j] > k) ) printSubsetsSumTok(arr, ++i, ++i, k);
		if ((arr[i] + arr[j]) < k) printSubsetsSumTok(arr, i, ++j, k);
		}
		
	}
	
	
	public static void printSubsetsSumTok(int input[], int k) {
	
		bubbleSort(input);
		printSubsetsSumTok(input,0,1,k);
			
	}

	

}
