package week1.assignments;

public class FindFibonacciSeries {

	public static void main(String[] args) {
	
		//int k, a=1, b=1;
		
		//System.out.println("1\n1");
//		while(k<=8)
//		{
//			k=a+b;
//			System.out.println(k+" ");
//			a=b;
//			b=k;
//			
//		}
	
		int n=8, firstnum=0, secondnum=1;
		int nextnum;
		
		for(int i=0; i<n; i++ )
		{
			System.out.print(firstnum+",");
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}
	}

}
