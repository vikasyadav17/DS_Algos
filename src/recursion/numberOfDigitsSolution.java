package recursion;

public class numberOfDigitsSolution {

	static int count = 0;
	
	public static int count(int n){
		
		
		
		//Write your code here
	
		if(n/10 == 0) {
			count++;
			return count;
		}
		
		count++; // 2
		return count(n/10); // 15
 }
}