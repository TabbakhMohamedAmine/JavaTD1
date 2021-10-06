package fr.dauphine.javaavance.td1;

public class Point {
	private  double x;
	private  double y;
	public static int number_points=0;
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
		number_points+=1;
	}
	//public void Test_point() {
		//Point p = new Point();
		//System.out.println(p.x+" "+p.y);
	//}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public Point(Point p2) {
		this.x=p2.x;
		this.y=p2.y;
	}
	public String toString() {
		return ("("+this.x+","+this.y+")");
	}
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		if(!(p==this)) { // 2 points différents mais même coordonnée type p1 et p3 dans notre exemple.
			return false;
		}
		return (this.x==p.x && this.y==p.y);
	}
	public void translate_mutable(double dx,double dy) {
		this.x+=dx;
		this.y+=dy;
	}
	public Point translate_non_mutable(double dx,double dy) {
		return new Point(this.x+dx,this.y+dy);
	}
}
