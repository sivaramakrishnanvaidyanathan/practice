/**
 * 
 */
package dynamic_programming;

import java.util.List;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

/**
 * @author srk
 * Question and Solution are taken from GeeksforGeeks. 
 * Original post: http://www.geeksforgeeks.org/minimum-cost-polygon-triangulation/ 
 */
public class MinimumCostPolygonTriangulation {

	/**
	 * @param args
	 */
	
	private double minCost(List<Vertex> vertices, int i, int j) {
		if (j <= i + 2) {
			return 0;
		}
		
		double minCost = Double.MAX_VALUE;
		for (int k = i + 1; k <= j - 1 ; k++) {
			double cost = minCost(vertices, i, k) + minCost(vertices, k, j) + cost(vertices.get(i), vertices.get(j), vertices.get(k));
			minCost = Math.min(minCost, cost);
		} return minCost;
	}
	
	private double cost(Vertex a, Vertex b, Vertex c) {
		return Edge.distance(a, b) + Edge.distance(b, c) + Edge.distance(a, c);
	}
	
	public static void main(String[] args) {
		Graph g = new Graph();
		Vertex v1 = new Vertex(0,2);
		Vertex v2 = new Vertex(1,2);
		Vertex v3 = new Vertex(2,1);
		Vertex v4 = new Vertex(1,0);
		Vertex v5 = new Vertex(0,0);
		
		Edge e1 = new Edge(v1, v2);
		Edge e2 = new Edge(v2, v3);
		Edge e3 = new Edge(v3, v4);
		Edge e4 = new Edge(v4, v5);
		Edge e5 = new Edge(v5, v1);
		
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addVertex(v5);
		
		g.addEdge(e1);
		g.addEdge(e2);
		g.addEdge(e3);
		g.addEdge(e4);
		g.addEdge(e5);
		
		System.out.println(new MinimumCostPolygonTriangulation().minCost(g.getSorted(), 0, 4));
		
	}

}
