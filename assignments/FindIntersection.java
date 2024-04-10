package week1.assignments;

import java.util.HashSet;

public class FindIntersection {

	public static void main(String[] args) {
	int array1[]= {1,2,3,4,5};
	int array2[]= {2,4,6, 8,10};
	
	printIntersection(array1, array2);
	
	}

	private static void printIntersection(int[] array1, int[] array2) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for (int i=0; i<array1.length;i++) {
		
		hs.add(array1[i]);
		}
		
		for (int i=0; i<array2.length; i++) {
			
			if(hs.contains(array2[i])){
				System.out.println("Intersection of 2 array is: "+ array2[i]);
			}
			
			
		}
		
		
		
	}

}
