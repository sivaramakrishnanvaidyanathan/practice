/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author srk
 *
 */
public class EnumerateAllPermutations {

	/**
	 * @param args
	 */

	
	public void enumerateAllPermutations(int index, List<Integer> a, List<List<Integer>> result) {
		if (index == a.size() - 1) {
			result.add(new ArrayList<Integer>(a));
			return;
		}
		
		for (int j = index; j < a.size(); ++j) {
			Collections.swap(a, index, j);
			enumerateAllPermutations(index + 1, a, result);
			Collections.swap(a, index, j);
		}
	}
	
	public static void main(String[] args) {
		EnumerateAllPermutations o = new EnumerateAllPermutations();
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		o.enumerateAllPermutations(0, a, result);
		
		for (List list: result) {
			System.out.println(list);
		}
	}

}
