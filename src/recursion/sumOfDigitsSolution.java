package recursion;

public class sumOfDigitsSolution {

 public static int sumOfDigits(int input){
		// Write your code here

		 if(input/10 == 0){
	           return input;
	       }
	        
	       return input%10 + sumOfDigits(input/10); 
	        
		}
}
