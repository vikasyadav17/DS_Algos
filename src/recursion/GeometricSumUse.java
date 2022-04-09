package recursion;

public class GeometricSumUse {
	
	
	public static double findGeometricSum(int k, int power) {
		 
       
		       if(power == k) {
		           
		           return 1/(Math.pow(2,power));
		       }
		       
		      double result = 1/Math.pow(2,power) + findGeometricSum(k,power+1);
		       
		       return result;
		      
		       
		   } 
		    

		   public static double findGeometricSum(int k){
				// Write your code here
				
		       return findGeometricSum(k,0);
		       
		   }
		       
		}
