package recursion;

public class RemoveDuplicateCharactersRecursivelyUse {
	
	public static String removeConsecutiveDuplicates(String s) {
		
		if(s.length() == 0) {
			return "";
		}
		if(s.length() == 1) {
			return s;
		}
		if(s.charAt(1) == s.charAt(0)) {
			return removeConsecutiveDuplicates(s.substring(1)); 
		}
	
		return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
	}
	

}
