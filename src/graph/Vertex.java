/**
 * 
 */
package graph;

/**
 * @author srk
 *
 */
public class Vertex implements Comparable<Vertex>{
	
	private static class IDManager {
		static int last = -1;
		
	}
	
	private String label;
	
	private int id;
	
	public Vertex(float x, float y) {
		this.id = ++IDManager.last;
		this.x = x;
		this.y = y;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private float x;
	
	private float y;

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Vertex o) {
		if (this.getId() == o.getId()) {
			return 0;
		} else if (this.getId() < o.getId()) {
			return -1;
		} else {
			return 1;
		}
		
	}
	
}
