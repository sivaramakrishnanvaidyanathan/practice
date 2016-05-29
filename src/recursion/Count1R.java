/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srk
 *
 */
public class Count1R {

	/**
	 * @param args
	 */
	
	private int solve(int[][] a, int i, int j, int val) {
//		if (i < 0 || i >= a.length) {
//			return 0;
//		}
//		
//		if (j < 0 || j >= a[i].length) {
//			return 0;
//		}
		
		if (i != 0 && a[i-1][j] == 1) {
			val += solve(a, i-1, j, a[i-1][j]);
		}
		
		if (j != 0 && a[i][j-1] == 1) {
			val += solve(a, i, j-1, a[i][j-1]);
		}
		
		
		if (i != a.length - 1 && a[i+1][j]==1) {
			val += solve(a, i+1, j, a[i+1][j]);
		}
		
		if (j != a.length - 1 && a[i][j+1]==1) {
			val += solve(a, i, j+1, a[i][j+1]);
		}
		
		return val;
	}
	public static void main(String[] args) {
		int[][] a = {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,1,0}};
		Count1R ob = new Count1R();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length ;j++)  {
				if (a[i][j] == 1)
					System.out.println("Count:" + ob.solve(a, i, j, a[i][j]));
				
			}
		}

	}

}
