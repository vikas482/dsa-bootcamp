package dsa_math_problems;

//Time complexity - O(N)
public class CountDigits {

	static int countDigits(int number) {
		
		int count =0;
		while(number>0) {
			
			number = number/10;
			System.out.println(number);
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CountDigits.countDigits(1234));
		
	}

}
