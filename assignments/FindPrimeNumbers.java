package week1.assignments;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		int n = 17;
		boolean isPrime= true;
		for (int i=2; i<=n/2; i++) {
			
			if(n%i==0) {
				 isPrime=false;
				 break;
			}
		}
		if (isPrime) {
			System.out.println("Given number is prime");
			
		}else
		{
			System.out.println("Given number is non prime");
}
}
}