package recursion;

public class PrintKeypadCombinationsCodeUse {
    
    
    public static String[] integerToFigure(int z) {
		
			if(z == 0 || z == 1) {
				String[] ans = {""};
				return ans;
			}
		 
		 if(z == 2) {
			 String[] ans = {"a","b","c"}; return ans;
		 }
		 if(z == 3) {
			 String[] ans = {"d","e","f"}; return ans;
		 }
		 if(z == 4) {
			 String[] ans = {"g","h","i"}; return ans;
		 }
		 if(z == 5) {
			 String[] ans = {"j","k","l"}; return ans;
		 }
		 if(z == 6) {
			 String[] ans = {"m","n","o"}; return ans;
		 }
		 if(z == 7) {
			 String[] ans = {"p","q","r","s"}; return ans;
		 }
		 if(z == 8) {
			 String[] ans = {"t","u","v"}; return ans;
		 }
		 if(z == 9) {
			 String[] ans = {"w","x","y","z"}; return ans;
		 }
		 
		 String[] ans = {""};
		return ans;
		
	}
	
	public static String[] keypad(int n){
		
		if( n/10 == 0 ) {
			return integerToFigure(n);
		}
		int k = n%10;
		String[] smallAns = keypad(n/10);
		String[] Ans = integerToFigure(k);
		String[] Result = new String[smallAns.length * Ans.length];
		int j = 0 , l = 0;
		for(int i=0;i<Result.length;i++) {
			if(l > Ans.length-1) {
				l=0;
				j++;
			}
			Result[i] = smallAns[j] + Ans[l++]; 
		}
		
		return Result;
	
	}

	public static void printKeypad(int input) {
		// TODO Auto-generated method stub
        
        String[] Result = keypad(input);
        
        for(int i=0;i<Result.length;i++){
            System.out.println(Result[i]);
        }
		
	}

}
