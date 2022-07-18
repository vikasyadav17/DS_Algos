package hashmap;

import java.util.HashMap;

public class ExtractUniqueCharactersUse {

	public static String uniqueChar(String str) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		if(str.length()==0) {
			return "";
		}
		
		String s = "";

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), str.charAt(i));
				s = s + str.charAt(i);
			}
		}

		
		
		return s;
	}

}
