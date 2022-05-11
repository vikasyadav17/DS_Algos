package test;

public class DoesSContainTUse {
	
	 static int indexOf = -1;
	public static boolean checkSequence(String a, String b) {
	
	   
		if(b.length() == 1) {
			boolean d = a.contains(b.toString()) ? true : false;
	
			int tempIndex = a.indexOf(b.toString());
			if(indexOf < tempIndex && d == true) {
				
				indexOf = tempIndex;
				return true;
			}
			return false;
		}
		
		boolean c  = checkSequence(a,b.substring(1));
		if(c == false) {
			return false;
		}
		
		boolean d =  a.contains("" + b.charAt(0)) ? true : false;
		
		int tempIndex = a.indexOf("" + b.charAt(0));
	
		if(indexOf > tempIndex && d == true) {
			indexOf = tempIndex;
			return true;
		}
		return false;
	}

}

// failed for 
// opmkaugygagagdnmcds4tr3ht3iudhdushhakhdfgdfaahahdfyttadrwq
// manishakhattar
