package recursion;

public class ReplaceCharactersRecursivelyUse {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		
		if(input.length()==0) {
			return "";
		}
		if(input.charAt(0) == c1) {
			StringBuffer sb = new StringBuffer(input);
			sb.setCharAt(0, c2);
			input = sb.toString();
			replaceCharacter(sb.substring(1).toString(),c1,c2);
		}
		
		return input.charAt(0) + replaceCharacter(input.substring(1),c1,c2);
	}

}
