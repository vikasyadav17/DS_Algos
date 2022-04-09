package recursion;

public class SumOfArraysSolution {


	public static int sum(int input[]) {
		
		if(input.length == 0) {
			System.out.println("length is 0");
			return 0;
		}
		
		
		int newArray[] =  new int[input.length-1];
		for(int i=0;i<newArray.length;i++) {
			newArray[i] = input[i];
			
		}
		System.out.println(input[input.length-1]);
		return sum(newArray) + input[input.length-1] ;
	
		
	}
	
}
