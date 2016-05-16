/**
 * 
 */
package graph;

/**
 * @author srk
 *
 */
public class Edge {
	
	private Vertex a;
	
	private Vertex b;
	
	public Edge(Vertex a, Vertex b) {
		this.a = a;
		this.b = b;
	}
	
	public static double distance(Vertex a, Vertex b) {
		if (a != null && b != null) {
			return Math.sqrt(Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(), 2));
		} else return 0;
	}

}
