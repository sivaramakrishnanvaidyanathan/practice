/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author srk
 *
 */
public class StockBuyAndSellOnce {

	/**
	 * @param args
	 */
	
	@Deprecated
	private void solve(int[] a) {
		int min = a[0];
		int max_diff = a[1] - a[0];
		int[] sol = new int[2];
		
		for (int i = 1; i < a.length; ++i) {
			if (a[i] < min) {
				min = a[i];
			} else {
				if (i!= 1 && a[i]- min > max_diff) {
					max_diff = a[i] - min;
					sol[0] = min;
					sol[1] = a[i];
				}
			}
		}
		
		System.out.println("sol[0] = " + sol[0] + " sol[1] = " + sol[1]);
	}
	
	
	private void solve2(List<Integer> prices) {
		Double maxProfit = 0.0;
		Double minPrice = Double.MAX_VALUE;
		
		for (Integer price: prices) {
			maxProfit = Math.max(maxProfit, price - minPrice);
			minPrice = Math.min(price, minPrice);
		}
		
		System.out.println("Max Profit: " + maxProfit);
	}
	
	private void testSubtraction () {
		Double price = 4.0;
		
		System.out.println(price - Double.MAX_VALUE);
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {2, 3, 10, 6, 4, 8, 1};
		int[] b = new int[] {3, 2, 10, 6, 4, 8, 1};
		Integer[] c = new Integer[] {10, 6, 4, 8, 1, 12};
		
		new StockBuyAndSellOnce().solve2(new ArrayList<Integer>(Arrays.asList(c)));
		new StockBuyAndSellOnce().testSubtraction();
	}

}
