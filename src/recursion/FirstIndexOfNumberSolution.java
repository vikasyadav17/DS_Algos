package recursion;

public class FirstIndexOfNumberSolution {
	

	public static int findElement(int input[],int startIndex , int x) {
		
        if(input.length == startIndex){
            return -1;
        }
		
        if(input[startIndex] == x) return startIndex;
        
        return findElement(input,startIndex+1,x);
        
	}
	
		
	public static int firstIndex(int input[], int x) {
		
		
		return  findElement(input, 0 , x);
		
		
	}
	
}