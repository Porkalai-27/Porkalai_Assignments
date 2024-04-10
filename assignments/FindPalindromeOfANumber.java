package week1.assignments;

public class FindPalindromeOfANumber {

	public static void main(String[] args) {

		int num= 272792;
		int remainder;
		int temp=num;
		int output=0;
		
		while (num>0) {
			remainder=num%10;             //2     //7
			output=(output*10)+remainder; //2
			num=num/10;                   //2727
		}
		
			if(output==temp) {
				System.out.println("Number is Palindrome");
			}
			
			else {
				System.out.println("Number is not Palindrome");
			}
		}
				
		
		
	}


