package recursion;

public class CheckNumberSolution {

	public static boolean checkNumber(int input[], int x) {
		
		if(input.length == 0) {
			return false;
		}
		
		if(input[input.length-1] == x) {
			return true ;
		}
				
	
		int newArray[] =  new int[input.length-1];
		for(int i=0;i<newArray.length;i++) {
			newArray[i] = input[i];
			
		}
		return checkNumber(newArray,x);
		
		
		
	}

}
