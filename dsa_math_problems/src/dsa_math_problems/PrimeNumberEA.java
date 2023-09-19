package dsa_math_problems;

//Time complexity - O(Sqrt(N))
public class PrimeNumberEA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean primerNUmber = PrimeNumberEA.calculatePrimeNumber(10);
		
		if(primerNUmber)
			System.out.println(" I am a prime number");
		else
			System.out.println(" I am not a prime number");
			
		
	}

	private static boolean calculatePrimeNumber(int number) {

		if(number==1) {
			return false;
		}
		
		for(int i=2;i<Math.sqrt(number);i++) {						
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
