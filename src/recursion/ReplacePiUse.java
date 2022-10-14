 package recursion;

public class ReplacePiUse {
	
    
    public static String replace(String input){
		
    	if(input.length() == 0){
            return "";
        }
        
        
        if(input.length()==2) {
        	if(input.charAt(0) == 'p' && input.charAt(1)=='i') return "3.14";
        }
            
        
        if(input.length()>2) {
            
            if(input.charAt(0) == 'p' && input.charAt(1)=='i') return "3.14" + replace(input.substring(2));
 			return input.charAt(0) + replace(input.substring(1));       
        }
        
        return input.charAt(0) + replace(input.substring(1)) ;
		
	}

// 2nd method
// 	if (input.length() == 1 || input.length() == 0) {
// 			x = x +input;
// 			return x;
// 		}

// 		else if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {

// 			x = x + "3.14" + replace(input.substring(2));
// 		} else {
// 			x = x + input.charAt(0) + replace(input.substring(1));
// 		}
// 		return x;

	
	
}
