package recursion;

public class LastIndexOfNumberSolution {
public static int findElement(int input[],int startIndex , int x) {
		
		if(startIndex < 0) {
			return -1;
		}
		
		
		if(input[startIndex] == x ) {
			return startIndex;
		}
		return findElement(input, startIndex-1,x );
		
	}
	
		
	public static int lastIndex(int input[], int x) {
		
		
		return  findElement(input, input.length-1 , x);
		
		
	}
	
}