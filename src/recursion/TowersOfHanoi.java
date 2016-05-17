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
public class TowersOfHanoi {

	/**
	 * @param args
	 */
	
	private class Stack {
		List<Integer> s;
		int top = -1;
		
		Stack () { 
			s = new ArrayList<Integer>();
			
		}
		
		void push(int disk) {
			if (s.size() == 0) {
				s.add(disk);
				++top;
			} else {
				int last = s.get(top);
				if (last > disk) {
					s.add(disk);
					++top;
				}
			}
		}
		
		int pop() {
			if (s.size() != 0) {
				int disk = s.get(top);
				s.remove(s.get(top));
				top--;
				return disk;
			} else {
				return -1;
			}
			
		}
		
		String getBottomUpView() {
			String str = "";
			for (Integer i : s) {
				if (str.equalsIgnoreCase("")) {
					str = str + i;
				} else {
					str = str + "," + i;
				}
			} return str;
		}
	}
	
	public Stack createNewPeg() {
		return new Stack();
	}
	
	public void moveDisk(int disk, Stack source, Stack destination) {
		destination.push(source.pop());
	}
	
	public void moveTowers(int disk, Stack source, Stack destination, Stack helper) {
		if (disk >= 1) {
			moveDisk(disk, source, destination);
		} else {
			moveTowers(disk - 1, source, helper, destination);
			moveDisk(disk, source, destination);
			moveTowers(disk - 1, helper, destination, source);
		}
	}
	
	public static void main(String[] args) {
		TowersOfHanoi ex  = new TowersOfHanoi();
		Stack source = ex.createNewPeg();
		Stack destination = ex.createNewPeg();
		Stack helper = ex.createNewPeg();
		
		source.push(5);
		source.push(4);
		source.push(3);
		source.push(2);
		source.push(1);
		
		ex.moveTowers(5, source, destination, helper);
		System.out.println(destination.getBottomUpView());
		
	}

}
