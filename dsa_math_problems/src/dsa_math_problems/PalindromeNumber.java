package dsa_math_problems;

//Time complexity - O(N)
public class PalindromeNumber {

	
	static boolean palindrome(int number) {
		
		boolean flag = false;
		int rev=0;
		int tmp = number;
		
		while(tmp>0) {			
			
			int ld = tmp%10;
			
			System.out.println("ld="+ld);	
			rev = rev*10+ld;
			System.out.println("rev="+rev);	
			
			/*This block is just for loop*/
			tmp = tmp/10;
			/*This block is just for loop*/
		}
		
		return (rev==number);
	}
	
	public static void main(String ar[]){
		
		System.out.println(PalindromeNumber.palindrome(454));
	
	}
	
}
