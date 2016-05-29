/**
 * 
 */
package arrays;

/**
 * @author srk
 *
 */
public class StockBuyAndSell {

	/**
	 * @param args
	 */
	
	@Deprecated
	private void solve(int[] a) {
		int min = a[0];
		int max = Integer.MAX_VALUE;
		boolean increasing = false;
		int max_diff = Integer.MIN_VALUE;
		
		for (int i = 1; i < a.length ; i++) {
			if (a[i] - min > max_diff) {
				max_diff = a[i] - min;
				max = a[i];
				increasing = true;
			} else {
				System.out.println("Buying at " + min + " Selling at " + max);
				increasing = false;
				min = a[i];
				max_diff = Integer.MIN_VALUE;
			}
		}
		
		if (max_diff > 0) {
			System.out.println("Buying at " + min + " Selling at " + max);
			
		}
	}
	private void solve2() {
		
	}
	
	public static void main(String[] args) {
		int price[] = {100, 180, 260, 310, 40, 535, 695};
		new StockBuyAndSell().solve(price);
	}

}
