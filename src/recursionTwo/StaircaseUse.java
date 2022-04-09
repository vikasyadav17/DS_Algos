package recursionTwo;

public class StaircaseUse {
	
	public static int staircase(int n){
		// done in one take by yours truly
	
		if(n <= 2 && n>0) {
			return n;
		}
		if(n == 0 ) {
			return 1;
		}
		if(n<0) return -1;
		
		int smallAns = staircase(n-1) + staircase(n-2)  + staircase(n-3);
		
		return smallAns;
		
	}
}
