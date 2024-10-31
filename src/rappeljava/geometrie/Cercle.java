package geometrie;

import java.text.DecimalFormat;

public class Cercle {
	Point pointCentre;
	Point pointCirconference;
	
	double rayon = 0;
	DecimalFormat df = new DecimalFormat("#.##");
	
	public Cercle (Point pointCentre, Point pointCirconference) {
		this.pointCentre = pointCentre;
		this.pointCirconference = pointCirconference;
	}

	void calculerRayon() {
		this.rayon = Math.sqrt(Math.pow((this.pointCirconference.x - this.pointCentre.x),2) + Math.pow((this.pointCirconference.y - this.pointCentre.y),2));
		System.out.println("\nrayon => "+df.format(this.rayon));
	}

	void calculerCirconference() {
		double circonference = 2*Math.PI*this.rayon;
		System.out.println("\ncirconférence => "+df.format(circonference));
	}

	void calculerSurface() {
		double surface = Math.PI*Math.pow(this.rayon, 2);
		System.out.println("\nsurface (aire) => "+df.format(surface));
	}
}
