package week1.assignments;

public class FindMissingNumbersinArray {

	public static void main(String[] args) {
		//arrray should not have duplicate values
		//numbers  should be in range
		//array numbers need not be sorted 
		
		
		int a[]= {1,2,3,5};
		
		int sum1=0;
	
		for(int i=0; i<a.length; i++) {
			
			sum1=sum1+a[i];
		}
			System.out.println("The sum of numbers in an array is: "+sum1 );
		
			int	sum2=0;
		
		for(int i=1; i<=5; i++) { // 1+2+x`x`
			sum2=sum2+i;
		}
			System.out.println("The sum of range of numbers in an array is: " +sum2);
			
			System.out.println("The missing number is: " +(sum2-sum1));
			
			
		}
		
		
	}

