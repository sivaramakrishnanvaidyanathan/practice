/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author srk
 *
 */
public class SwappedPermutation {

	/**
	 * @param args
	 */
	
	private class SwapPair {
		Integer i;
		Integer j;
		
		Map<Integer, Set<Integer>> friends = new HashMap<Integer, Set<Integer>> ();
		
		public SwapPair(int i, int j) {
			this.i = i;
			this.j = j;
			
			buildFriends(i, j);
		}	
		
		private void buildFriends(int i,  int j) {
			Set<Integer> friends_i = friends.get(i);
			
			if(friends_i == null) {
				friends_i = new HashSet<Integer>();
			} else {
				friends_i.add(i);
				friends_i.add(j);
			}
			
			Set<Integer> friends_j = friends.get(j);
			if (friends_j == null) {
				friends_j = new HashSet<Integer>();
			} else {
				friends_j.add(i);
				friends_j.add(j);
			}
		}
	}
	
	
	
	private void solve(char[] a, List<SwapPair> swappers) {
		
	}
	public static void main(String[] args) {
		List<SwapPair> swappers = new ArrayList<SwapPair>();
		
		SwappedPermutation ex = new SwappedPermutation();
		SwapPair _1 = ex.createSwappedPermutation(1,4);
		SwapPair _2 = ex.createSwappedPermutation(3,4);
		
		char[] ip = {'x','y','a','b','z'};
		ex.solve(ip, swappers);
	}
	/**
	 * @param i
	 * @param j
	 * @return
	 */
	private SwapPair createSwappedPermutation(int i, int j) {
		return new SwapPair(i, j);
	}

}
