/**
 * 
 */
package recursion;

import java.util.Stack;

/**
 * @author srk
 *
 */

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Count1 {

	/**
	 * @param args
	 */
	private void solveIterative(int[][] a, int i, int j, Stack<Point> s) {
		
		int count = 0;
		while (!s.isEmpty()) {
			Point p1 = s.pop();
			if (p1.x >=0 && p1.x < a.length && p1.y >=0 && p1.y < a[0].length) {
				
				if (a[p1.x][p1.y] == 1) {
					count += a[p1.x][p1.y];
					s.push(new Point(i-1,j-1));
					s.push(new Point(i-1,j));
					s.push(new Point(i-1,j+1));
					s.push(new Point(i,j-1));
					s.push(new Point(i,j+1));
					s.push(new Point(i+1,j-1));
					s.push(new Point(i+1,j));
					s.push(new Point(i+1,j+1));
				}
			}
		}
		
		System.out.println("Count: " + count);
		
	}
	public static void main(String[] args) {
		int[][] a = {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,1,0}};
		Count1 ob = new Count1();
		
		Stack<Point> s = new Stack<Point>();
		Point p = new Point (1, 2);
		s.push(p);
		ob.solveIterative(a, 1, 2, s);
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[0].length ;j++)  {
//				if (a[i][j] == 1) {
//					Stack<Point> s = new Stack<Point>();
//					Point p = new Point (i, j);
//					s.push(p);
//					ob.solveIterative(a, i, j, s);
//				}
//				
//			}
//		}

	}

}
