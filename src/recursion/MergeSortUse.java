package recursion;

public class MergeSortUse {

	public static void merge(int[] input,int sI, int eI){
		
		int mid = (sI + eI)/2;
		
		    int ans[] = new int[eI - sI +1];
		    int i = sI , j = mid+1 , k=0;
	    	while(i <= mid && j <= eI) {
			  if(input[i]<input[j]) {
				  ans[k]=input[i];
				  i++;
				  k++;
			  }
			  else {
				  ans[k]=input[j];
				  j++;
				  k++;
			  }
			}
	    	while(i <= mid) {
	    		ans[k++] = input[i];
	    		i++;
	    	}
	    	while( j <= eI ) {
	    		ans[k] = input[i];
	    		k++;
	    		j++;
	    	}
	    	
	    	for(int l=0;l<ans.length;l++) {
	    		input[sI + l] = ans[l];
	    	}
//	    	MergeSort.printArray(ans);
}
	
	public static void mergeSort(int[] input,int sI, int eI){
		if(sI>=eI) {
			return ;
		}
		int mid = (sI + eI)/2;
		
		mergeSort(input,sI,mid);
		mergeSort(input,mid+1,eI);
		merge(input,sI, eI);
		
	}
 }
