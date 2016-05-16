package sorting_searching;

/**
 * @author srk
 *
 * ${tags}
 */
public class NumPairsClosest {
	
	private void solve(int[] a, int sum) {
		
		if (a != null && a.length > 1) {
			int i = 0;
			int j = a.length-1;
			int min_diff = Integer.MAX_VALUE;
			int p1 = 0;
			int p2 = 0;
			
			while (i < j) {
				int diff = Math.abs(a[i] + a[j] - sum);
				if (diff < min_diff) {
					p1 = a[i];
					p2 = a[j];
					min_diff = diff; 
				}
				
				if (a[i] + a[j] > sum) {
					j--;
				} else {
					i++;
				}
			}
			
			System.out.println("p1: " + p1 + ", p2: " + p2 + ", min_diff: " + min_diff);
		}
		
	}
	
	public static void main(String[] args) {
		NumPairsClosest ex1 = new NumPairsClosest();
		NumPairsClosest ex2 = new NumPairsClosest();
		
		int[] a = {10,22,28,29,30,40};
		int a_sum = 54;
		int[] b = {1,3,4,7,10};
		int b_sum = 15;
		
		ex1.solve(a, a_sum);
		ex2.solve(b, b_sum);
	}

}
