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


	
}
