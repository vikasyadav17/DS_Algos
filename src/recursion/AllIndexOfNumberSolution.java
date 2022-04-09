package recursion;

public class AllIndexOfNumberSolution {
	
	private static int[] allIndexedRecursive(int[] input, int x, int length) {
	
	 if(input.length == length) return new int[0];
     
     int[] smallAns = allIndexedRecursive(input,x,length+1);
     
     if(input[length] != x ) return smallAns;
     
     int[] finalAns = new int[smallAns.length + 1];
     
     for(int i=0 ; i < smallAns.length ; i++ ) finalAns[i+1] = smallAns[i] ;
     
     finalAns[0] = length;
     
     return finalAns;
     
     
             
	}	
	
	public static int[] allIndexes(int input[], int x) {
		// TODO Auto-generated method stub
		
		return allIndexedRecursive(input,x,0);
	 }
	
	
}