package recursion;

public class printNumberSolution {

	static int x = 1;
	
	public static void print(int n){
		
		if(x == n ) {
			System.out.print(n);
			return ;
		}
		
		System.out.print(x + " ");
		x++;
		print(n);
	}
}
