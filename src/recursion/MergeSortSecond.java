package recursion;

public class MergeSortSecond {
	
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
	
}
    public static void mergeSortTwo(int[] input,int sI, int eI){
     if(sI>=eI) {
			return ;
		}
		int mid = (sI + eI)/2;
		
		mergeSortTwo(input,sI,mid);
		mergeSortTwo(input,mid+1,eI);
		merge(input,sI, eI);
		
    }
    
	
	public static void mergeSort(int[] input){
    		mergeSortTwo(input,0,input.length-1);
    }

}
