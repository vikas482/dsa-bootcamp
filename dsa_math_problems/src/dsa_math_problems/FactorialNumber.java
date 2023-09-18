package dsa_math_problems;

public class FactorialNumber {

	
	static int factorialNumber(int number) {
		
		int temp=1;
		for(int i=1;i<=number;i++) {			
			temp = temp * i;						
			System.out.println("temp="+temp);
		}
			
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FactorialNumber.factorialNumber(6));
		
	}
	
}
