package dsa_math_problems;

public class PrimeNumber {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean primerNUmber = PrimeNumber.calculatePrimeNumber(89);
		
		if(primerNUmber)
			System.out.println(" I am a prime number");
		else
			System.out.println(" I am not a prime number");
			
		
	}

	private static boolean calculatePrimeNumber(int number) {

		if(number==1) {
			return false;
		}
		
		for(int i=2;i<number;i++) {						
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
