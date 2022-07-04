package stacks;

import java.util.Iterator;
import java.util.Stack;

public class StackSpanUse {

	public static int[] stockSpan(int[] price) {

		// Your code goes here
		int[] result = new int[price.length];

		for(int i=0;i<price.length;i++) {
			if(i==0) {
				result[0]=1;
			}
			
			else if(price[i] > price[i-1]) {
				int j=i-1;
				int count=1;
				while(j!=-1) {
					if(price[j]<price[i]) {
						count++;
						j--;
					}
					else break;
					
				}
				result[i]=count;
			}
			else result[i]=1;
		}
		
		return result;
	}

}
