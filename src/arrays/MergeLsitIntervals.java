/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srk
 *
 */
public class MergeLsitIntervals {
	
	private class Interval {
		int min;
		int max;
		
		public Interval(int min, int max) {
			this.min = min;
			this.max = max;
		}
		
		public String toString() {
			return "(" + min + "," + max + ")";
		}
	}
	
	private void mergeIntervals (List<Interval> a, List<Interval> b) { //simple merge like in mergesort
		
		int i = 0, j = 0, k = 0;
		List<Interval> sum = new ArrayList<Interval>();
		
		while (i < a.size() && j < b.size()) {
			if (a.get(i).min < b.get(j).min) {
				sum.add(a.get(i));
				i++;
			} else if (a.get(i).min > b.get(j).min) {
				sum.add(b.get(j));
				j++;
			} else {
				sum.add(a.get(i));
				sum.add(b.get(j));
				i++;
				j++;
			}	
		}
		
		while (i < a.size()) {
			sum.add(a.get(i));
			i++;
		}
		
		while (j < b.size()) {
			sum.add(b.get(j));
			j++;
		}
		
		//all intervals in sum, now merge recursively
		
		i = 0;
		while (i + 1 < sum.size()) {
			if (sum.get(i).max > sum.get(i+1).min) { //merge
				int max = sum.get(i + 1).max;
				sum.remove(i+1);
				sum.get(i).max = max;
				
			} else {
				i++;
			}
		}
		
		System.out.println("Merged: " + sum.toString());
		
	}
	
	private Interval createInterval (int min, int max) {
		return new Interval (min, max);
	}
	
	public static void main (String[] args) {
		List<Interval> a = new ArrayList<Interval>();
		List<Interval> b = new ArrayList<Interval>();
		
		MergeLsitIntervals ex = new MergeLsitIntervals();
		
		Interval _1 = ex.createInterval(3, 11);
		Interval _2 = ex.createInterval(6, 18);
		Interval _3 = ex.createInterval(17, 25);
		Interval _4 = ex.createInterval(40, 47);
		Interval _5 = ex.createInterval(58, 73);
		
		a.add(_1);
		a.add(_3);
		a.add(_5);
		
		
		b.add(_2);
		b.add(_4);
		
		ex.mergeIntervals(a, b);
		
	}

}
