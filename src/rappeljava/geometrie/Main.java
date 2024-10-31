package geometrie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pointCentre = new Point(1, 2);
		Point pointCirconference = new Point(4, 6);

		System.out.println("Point("+pointCentre.getX()+"; "+pointCentre.getY()+")");
		System.out.println("Point("+pointCirconference.getX()+"; "+pointCirconference.getY()+")");
		
		Cercle cercle = new Cercle(pointCentre, pointCirconference);
		cercle.calculerRayon();
		cercle.calculerCirconference();
		cercle.calculerSurface();
	}
}
