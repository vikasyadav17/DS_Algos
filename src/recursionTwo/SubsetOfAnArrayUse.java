package recursionTwo;

public class SubsetOfAnArrayUse {
	
	private static int[][] subsets(int[] input, int n) {
		// TODO Auto-generated method stub
		if(n >= input.length) {
			return new int[1][0];
		}
		
		int smallAns[][] = subsets(input,n+1);
		int ans[][] = new int[smallAns.length*2][];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[i] = new int[smallAns[i].length];
			for(int j=0;j<smallAns.length;j++) {
				ans[i][j] = smallAns[i][j];
			}
		}
		
		return ans;
	}	
	

	public static int[][] subsets(int input[]) {
		// Write your code here

	
		return subsets(input,0);
		
	}
	
}
