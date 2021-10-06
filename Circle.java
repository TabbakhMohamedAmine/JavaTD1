package fr.dauphine.javaavance.td1;

public class Circle {
	protected Point center;
	protected double radius;
	
	public Circle(double r, Point p) {
		this.center=p;
		this.radius=r;
	}
	public String toString() {
		return ("("+this.center.toString()+";"+this.radius+";"+this.area()+")");
	}
	public void translate(double dx,double dy) {
		//this.center.translate_mutable(dx, dy);
		this.center = this.center.translate_non_mutable(dx, dy);
	}
	public Point getCenter() {
		return this.center;
	}
	public double area() {
		return (Math.PI*this.radius*this.radius);
	}
	public boolean contains(Point p) {
		// calcule la distance euclidéenne entre d(c,p) avec c le centre du cercle.
		double diff_x = (this.center.getX()-p.getX())*(this.center.getX()-p.getX());
		double diff_y = (this.center.getY()-p.getY())*(this.center.getY()-p.getY());
		double distance_eucl = Math.sqrt(diff_x+diff_y);
		if(distance_eucl<=this.radius) {
			return true;
		}
		return false;
	}
	public boolean contains_lot(Point p, Circle...circles) {
		for(Circle c : circles) {
			if(c.contains(p)==true) {
				return true;
			}
		}
		return false;
	}
}
