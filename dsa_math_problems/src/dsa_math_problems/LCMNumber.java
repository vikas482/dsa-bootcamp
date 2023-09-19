package dsa_math_problems;

public class LCMNumber {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int gcd = LCMNumber.calculateLCM(4,6);
	
		System.out.println("Least common multiple is="+gcd);
	}

	private static int calculateLCM(int a, int b) {
		// TODO Auto-generated method stub
		
		//4,8
		int res = Math.max(a, b);
		
		while(true) {
			
			if( res%a == 0 && res%b == 0) 
			return res;		
		
			res++;
					
		}
	}

	
	
}
