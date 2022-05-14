package stacks;

import java.util.Stack;

public class StackSpanUse {

	public static int[] stockSpan(int[] price) {
	
		//Your code goes here
		
		if(price.length==0 || price.length==1) {
			return price;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		int[] result = new int[price.length];
		
		for(int i=0;i<price.length;i++) {
			
			if(stack.isEmpty()) {
				stack.push(price[i]);
				result[i] =  1;
				continue;
			}
			
			else if(stack.peek()>=price[i]) {
				stack.push(price[i]);
			 result[i]=1;
			 continue;
			}
			else {
				stack.push(price[i]);
				int j=i-1;
				int counter=1;
				while(j>=0) {
					if(price[i]<price[j]) break;
					else if(price[i]>price[j]) {
						counter++;
						--j;
					}
					else --j;
				}
				result[i]=counter;
			}
			
		}
		
		return result;		
	}

}
