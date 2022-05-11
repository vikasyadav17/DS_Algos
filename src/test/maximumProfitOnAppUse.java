package test;

public class maximumProfitOnAppUse {
	
//	private static int maximumProfit(int[] budget, int i) {
//		// TODO Auto-generated method stub
//		if(i == budget.length) {
//			return 0;
//		}
//		
//		int budgetResult = maximumProfit(budget,i+1);
//		int subsCount=0;
//		for(int j=0;j<budget.length;j++) {
//			if(budget[i] <= budget[j])
//				subsCount++;
//		}
//		int maximumProfit = subsCount * budget[i];
//		return budgetResult>maximumProfit ? budgetResult : maximumProfit;
//	}

	
	public static int maximumProfit(int budget[]) {
		// Write your code here

		int maximProfit = 0;
		int countSubs = 0;
		int j=0;
		while(j<budget.length) {
			countSubs=0;
		for(int i=0;i<budget.length;i++) {
			if(budget[j]<=budget[i]) {
				countSubs++;
			}
			if(budget.length-1 == i) {
				int maxProfitSoFar = countSubs*budget[j];
				maximProfit = maximProfit>maxProfitSoFar ? maximProfit : maxProfitSoFar;
				
			}
		}
		j++;
		}
		return maximProfit;
	}

	
}
