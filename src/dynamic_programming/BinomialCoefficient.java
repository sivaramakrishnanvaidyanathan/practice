/**
 * 
 */
package dynamic_programming;

/**
 * @author srk
 *
 */
public class BinomialCoefficient {

	/**
	 * @param args
	 */
	
	private int solve(int n, int k) {
		if (k == 0) {
			return 1;
		}
		int a[] = new int[n+1];
		a[0] = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = Math.min(i, k); j >= 1; --j) {
				a[j] = a[j] + a[j-1];
			}
		}
		
		return a[k];
	}
	
	public static void main(String[] args) {
		
		System.out.println(new BinomialCoefficient().solve(8,2));
		
		System.out.println(new BinomialCoefficient().solve(10,5));

	}

}
