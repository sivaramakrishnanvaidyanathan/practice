/**
 * 
 */
package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

import custom.CustomInterface;

/**
 * @author srk
 *
 */


public class SearchSequence2DArray {
	
	private class Position {
		int i;
		int j;
		
		Position (int i, int j) {
			this.i = i;
			this.j = j;
		}
		
		String getString() {
			return "(" + i + "," + j + ")"; 
		}
	}

	/**
	 * @param args
	 */
	
	private int[][] a;
	
	public SearchSequence2DArray(int[][] a) {
		this.a = a;
	}
	
	private boolean isInRange(int index) {
		if (index >= 0 && index < a.length) {
			return true;
		} return false;
	}
	
	private boolean beginSearch(int i, int j, int[] s, int c, List<Position> sol) {
	
		if (c < s.length && isInRange(i) && isInRange(j) && a[i][j] == s[c]) {
			sol.add(new Position(i,j));
			if (sol.size() == s.length) {
				return true;
			}
			if (beginSearch(i, j-1, s, c+1, sol) || beginSearch(i, j+1, s, c+1, sol) || beginSearch(i-1, j, s, c+1, sol) || beginSearch(i+1, j, s, c+1, sol)) {
				return true;
			}
			
		} return false;
	}
	
	public static void main(String[] args) {
		int a[][] = new int[][] {
				{1,2,3},{4,5,6},{3,2,1}
		};
		
		
		SearchSequence2DArray ex = new SearchSequence2DArray(a);
		int[] s = new int[] {1,4,5,2};
		int[] s2 = new int[] {1,2,5,6,1};
		
		int[] s3 = {2,5,6,1};
		int c = 0;
		
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				
				List<Position> sol = new ArrayList<Position>();
				
				if (ex.beginSearch(i, j, s, c, sol)) {
					System.out.println("Found: " + new CustomInterface<Position>() {
						
						@Override
						public String getCustomString(List<Position> sol) {
							StringBuffer buf = new StringBuffer();
							for (Position position: sol) {
								if (position == sol.get(sol.size() - 1)) {
									buf.append(position.getString());
								} else {
									buf.append(position.getString() + "->");
								}
							}
							return buf.toString();
						}
					}.getCustomString(sol));
				}
				
				sol = new ArrayList<Position>();
				
				if (ex.beginSearch(i, j, s2, c, sol)) {
					System.out.println("Found: " + new CustomInterface<Position>() {
						
						@Override
						public String getCustomString(List<Position> sol) {
							StringBuffer buf = new StringBuffer();
							for (Position position: sol) {
								if (position == sol.get(sol.size() - 1)) {
									buf.append(position.getString());
								} else {
									buf.append(position.getString() + "->");
								}
							}
							return buf.toString();
						}
					}.getCustomString(sol));
				}
				
				sol = new ArrayList<Position>();
				
				if (ex.beginSearch(i, j, s3, c, sol)) {
					System.out.println("Found: " + new CustomInterface<Position>() {
						
						@Override
						public String getCustomString(List<Position> sol) {
							StringBuffer buf = new StringBuffer();
							for (Position position: sol) {
								if (position == sol.get(sol.size() - 1)) {
									buf.append(position.getString());
								} else {
									buf.append(position.getString() + "->");
								}
							}
							return buf.toString();
						}
					}.getCustomString(sol));
				}
			}
		}
		
		
	}	
	
}
