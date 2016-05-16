/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author srk
 *
 */
public class Graph {
	
	private List<Edge> edges;
	
	private List<Vertex> vertices;
	
	public Graph (List<Edge> edges, List<Vertex> vertices) {
		this.edges = edges;
		this.vertices = vertices;
	}
	
	/**
	 * 
	 */
	public Graph() {
		// TODO Auto-generated constructor stub
	}

	public void addVertex(Vertex v) {
		if (vertices == null) {
			vertices = new ArrayList<Vertex> ();
		}
		vertices.add(v);
	}
	
	public void addEdge(Edge e) {
		if (edges == null) {
			edges = new ArrayList<Edge> ();
		}
		edges.add(e);
	}
	
	public List<Vertex> getSorted() {
		Collections.sort(vertices);
		return vertices;
	}
}
