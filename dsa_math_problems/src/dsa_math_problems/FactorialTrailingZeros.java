package dsa_math_problems;

public class FactorialTrailingZeros {

	static int factorialNumber(int number) {
		
		int temp=1;
		for(int i=2;i<=number;i++) {			
			temp = temp * i;						
		}
			
		return temp;
	}
	
	static int countZeros(int number) {
		
		int temp = number;
		int count=0;
		while(temp%10==0) {						
			count++;			
			temp = temp/10;		
		}		
		return count;
						
	}
	
	
	public static void main(String[] args) {
		int count = FactorialTrailingZeros.countZeros(FactorialTrailingZeros.factorialNumber(10));
		System.out.println("count="+count);		
	}

}
