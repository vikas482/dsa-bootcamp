package dsa_math_problems;

public class GCDNaive {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int gcd = GCDNaive.calculateGCD(6,14);
	
		System.out.println("Greatest common divisor is"+gcd);
	}

	private static int calculateGCD(int a, int b) {
		// TODO Auto-generated method stub
		
		//4,8
		int res = Math.min(a, b);
		while(res>0) {
			if( a%res==0 && b%res==0) {
				return res;
			}else {
				res--;
			}		
		}
		return res;
	}

}
