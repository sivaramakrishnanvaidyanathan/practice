package sorting_searching;
/**
 * @author srk
 *
 * merge three arrays and simultaneously catch elements that are the same
 */

public class IntersectionOfThreeSortedArrays {
	
	private int min3elements (int a, int b, int c) {
		int ab_min = Math.min(a, b);
		int abc_min = Math.min(ab_min, c);
		
		return abc_min;
	}
	private void merge(int[] ar1, int[] ar2, int[] ar3) {
		int i = 0, j = 0, k = 0;
		
		while (i < ar1.length && j < ar2.length && k < ar3.length) {
			
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) { //three elements are equal, intersection
				System.out.println("Common element:" + ar1[i]);
				i++;
				j++;
				k++;
			} else {
				int min = min3elements(ar1[i], ar2[j], ar3[k]);
				if (min == ar1[i]) {
					i++;
				} else if (min == ar2[j]) {
					j++;
				} else if (min == ar3[k]) {
					k++;
				}
			}
		}
	}
	
	public static void main (String[] args) {
		
		int ar1[] = {1, 5, 10, 20, 40, 80};
		int ar2[] = {6, 7, 20, 80, 100};
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		IntersectionOfThreeSortedArrays ex1 = new IntersectionOfThreeSortedArrays();
		ex1.merge(ar1, ar2, ar3);
		
		ar1 = new int []{1, 5, 5};
		ar2 = new int []{3, 4, 5, 5, 10};
		ar3 = new int []{5, 5, 10, 20};
		
		IntersectionOfThreeSortedArrays ex2 = new IntersectionOfThreeSortedArrays();
		ex2.merge(ar1, ar2, ar3);
	
	}

}
