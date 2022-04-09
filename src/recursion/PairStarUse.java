package recursion;

public class PairStarUse {

	public static String addStars(String s) {
		
		 if(s.length() == 1){
	            return s;
	        }
	        
	        String str = addStars(s.substring(1));
	        
	        
	        if(s.charAt(0) == s.charAt(1)) {
	            return s.charAt(0) + "*" + str;
	        }
	        
	        return  s.charAt(0) + str;
	        
		}		
	}
