package recursionTwo;

public class MergeSortByYoursTrulyUse {
	
	private static void doMergeSort(int[] arr, int beginIndex, int endIndex) {
		// TODO Auto-generated method stub
		
		int mid = beginIndex + (endIndex - beginIndex)/2;
		
		int [] num = new int[endIndex - beginIndex + 1];
		int i=beginIndex, j = mid+1 , k=0;
		while(i<=mid && j<=endIndex) {
			if(arr[i]>arr[j]) {		
				num[k] = arr[j];
				k++;
				j++;
			}
			else {
				num[k] = arr[i];
				k++;
				i++;
			}
			
		}
		while(i<=mid) {
			num[k++]=arr[i++];
		}
		while(j<=endIndex) {
			num[k++] = arr[j++];
		}
		for(int l=0;l<num.length;l++) {
			arr[beginIndex + l] = num[l];
    	}
		
	}

	public static void mergeSort(int [] arr , int beginIndex , int endIndex) {
		
		if(beginIndex >= endIndex) {
			return ;
		}
		
		int mid = beginIndex + (endIndex - beginIndex)/2;
		
		mergeSort(arr,beginIndex,mid);
		mergeSort(arr,mid+1,endIndex);
		
		doMergeSort(arr,beginIndex,endIndex);
		
	}
	
	public static void mergeSort(int[] input){
		mergeSort(input,0,input.length-1);
	}

}
