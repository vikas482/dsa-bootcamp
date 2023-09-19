package dsa_math_problems;

public class EfficentFactorialTrailingZeros {

	static int factorialNumber(int number) {
		
		int temp=1;
		for(int i=2;i<=number;i++) {			
			temp = temp * i;						
		}
		
		System.out.println("temp="+temp);
			
		return temp;
	}
	
	//log5n
	static int countZeros(int n) {
		
		int res =0;
		for(int i=5;i<=n;i=i*5) {
						
			res = res + n/i;
							
		}
		return res;
	
	}
	
	
	public static void main(String[] args) {
		
//		int factorialNumber = EfficentFactorialTrailingZeros.factorialNumber(5);
//		System.out.println("factorialNumber="+factorialNumber);
		
		int count = EfficentFactorialTrailingZeros.countZeros(50);
		System.out.println("Trailing zeros="+count);		
	}

}
