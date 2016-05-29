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
public class ListMultiplication {

	/**
	 * @param args
	 */
	
	private void multiply (List<Integer> a, List<Integer> b) {
		int sign = a.get(0) < 0 ^ b.get(0) < 0 ? -1 : 1;
		
		a.set(0, Math.abs(a.get(0)));
		b.set(0, Math.abs(b.get(0)));
		
		List<Integer> res = new ArrayList<Integer> (Collections.nCopies(a.size() + b.size(), 0));
		
		for (int i = a.size() - 1; i >= 0 ; --i) {
			for (int j = b.size() - 1; j >= 0; --j) {
				res.set(i + j + 1, res.get(i + j + 1) + a.get(i) * b.get(j));
				res.set(i + j, res.get(i + j) + res.get(i + j + 1) /10 );
				res.set(i + j + 1, res.get(i + j + 1)% 10);
			}
		}
		
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = new Integer[] {1,2,3};
		Integer[] b = new Integer[] {4,5,6};
		
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> B = new ArrayList<Integer>(Arrays.asList(b));
		
		new ListMultiplication().multiply(A, B);
	}

}
