package recursion;

public class Subsequences {

	
	private static String[] findSubSequences(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==0) {
			String[] ans = {""};
			return ans;
		}
		
		String[] smallerAnswer = findSubSequences(str.substring(1)); // yz , z, ""
		String[] ans = new String[smallerAnswer.length*2];
		
		for(int i=0;i<smallerAnswer.length;i++) {
			 ans[i] =  smallerAnswer[i]; // ""
		}
		
		for(int i=0;i<smallerAnswer.length;i++) {
			ans[i +  smallerAnswer.length] = str.charAt(0) + smallerAnswer[i];
		}
	
		return ans;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String str = "xyz";
		String[] ans = findSubSequences(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}



}
