package fr.dauphine.javaavance.td1;

public class Ring extends Circle {
	private Point center;//useless 
	private double inner_radius;//useless 
	private double outer_radius;
	
	public Ring(Point c, double r_inner, double r_outer) {
		super(r_inner,c);
		this.center=c; //useless 
		this.outer_radius=r_outer;//useless 
		this.inner_radius=r_inner;//useless 
	}
	
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Point)) {
			return false;
		}
		Ring p = (Ring) o;
		return (this.center.equals(p.center) && this.inner_radius==p.inner_radius && this.outer_radius==p.outer_radius);
	}
	public String toString() {
		return("("+this.center.toString()+";"+this.inner_radius+";"+this.outer_radius+")");
	}
	public boolean contains(Point p) {
		double diff_x = (this.center.getX()-p.getX())*(this.center.getX()-p.getX());
		double diff_y = (this.center.getY()-p.getY())*(this.center.getY()-p.getY());
		double distance_eucl = Math.sqrt(diff_x+diff_y);
		if(distance_eucl<=this.outer_radius && this.inner_radius<=distance_eucl){ // outer > inner et pour etre dans le ring il faut etre entre les deux.
			return true;
		}
		return false;
	}
	public boolean contains(Point p, Ring...rings) {
		for(Ring r:rings) {
			if(r.contains(p)==true) {
				return true;
			}
		}
		return false;
	}
}
