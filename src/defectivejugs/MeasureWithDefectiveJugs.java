package defectivejugs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import custom.ListInterface;

/**
 * @author srk
 *
 * Greedy Technique
 */
public class MeasureWithDefectiveJugs {
	
	private Random r = new Random();
	
	private enum Jugs {
		
		A("A", 230, 240),
		B("B", 290, 310),
		C("C", 500, 515);
		
		String label;
		int min_vol;
		int max_vol;
		
		private Jugs(String label, int min_vol, int max_vol) {
			this.label = label;
			this.min_vol = min_vol;
			this.max_vol = max_vol;
		}
		
		int getMin() {
			return min_vol;
		}
		
		int getMax() {
			return max_vol;
		}		
		
		String getLabel() {
			return label;
		}
		
		public Jugs getNextJug() {
			if (this == C) {
				return B;
			} 
			if (this == B) {
				return A;
			}
			return null;
		}
	}	
	
	public boolean measure (int min, int max, List<String> sol, int current, Jugs jugToUse) {
				
		if (jugToUse != null && current < min) {
			int val = r.nextInt(jugToUse.getMax() + 1 - jugToUse.getMin()) + jugToUse.getMin();
			if (val + current > max) {
				return measure(min, max, sol, current, jugToUse.getNextJug());				
			}
			
			sol.add(jugToUse.getLabel() + "->" + val);
			if (val + current >= min && val + current <= max) {
				return true;
			}
			else if (val + current < min) {				
				return measure(min, max, sol, current + val, jugToUse);
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		
		MeasureWithDefectiveJugs ex = new MeasureWithDefectiveJugs();		
		
		List<String> sol = new ArrayList<String> ();		
		ex.measure(2100, 2300, sol, 0, Jugs.C);
		
		System.out.println(new ListInterface<String>() {

			@Override
			public String getString(List<String> steps) {
				StringBuffer buf = new StringBuffer();
				for (String step : steps) {
					buf.append(step);
					buf.append("\n");					
				}
				return buf.toString();
			}
			
		}.getString(sol));

	}

}
