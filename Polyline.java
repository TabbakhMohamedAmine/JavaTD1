package fr.dauphine.javaavance.td1;

import java.util.Objects;
import java.util.LinkedList;
import java.util.*;

public class Polyline {
	private int maximum_number;
	private Point[]array;
	private LinkedList<Point> ma_liste;
	
	public Polyline() {
		this.ma_liste = new LinkedList<Point>();
	}
	public void add_list(Point p) {
		this.ma_liste.add(p);
	}
	public boolean cointain_list(Point p) {
		return this.ma_liste.contains(p);
	}
	public int nombre_points_list() {
		return this.ma_liste.size();
	}
	public Polyline(int nombre_max) {
		this.maximum_number=nombre_max;
		array = new Point[nombre_max];
	}
	public void add(Point p) {
		Objects.requireNonNull(p,"On a donné null en paramètre ! \n");
		for(int a=0;a<this.maximum_number;a++) {
			if(this.array[a]==null) {// on remplit la première place vide.
				this.array[a]=p;
				return;
			}
		}
		System.out.println("Tableau full ! \n");
	}
	public int pointCapacity() {
		return this.maximum_number;
	}
	public int nbPoints() {
		int cpt=0;
		for(int a=0;a<this.maximum_number;a++) {
			if(this.array[a]!=null) {
				cpt=cpt+1;
			}
		}
		return cpt;
	}
	public boolean contains(Point p2) {
		for (Point a : this.array) {
			if(a==p2) {
				return true;
			}
		}
		return false;
	}
	
}
