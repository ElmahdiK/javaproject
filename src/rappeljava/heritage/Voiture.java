package heritage;

public class Voiture extends Vehicule {
	int vitesseActuelle = 0;

	public Voiture(String marque, String modele, short anneeFabrication, int vitesseActuelle) {
		super(marque, modele, anneeFabrication);
		// TODO Auto-generated constructor stub
		this.vitesseActuelle = vitesseActuelle;
	}

	void accelerer(int vitesse) {
		this.vitesseActuelle += vitesse;
	}
	
	void freiner(int vitesse) {
		if (this.vitesseActuelle - vitesse > 0) {
			this.vitesseActuelle -= vitesse;			
		} else System.out.println("Impossible de freiner.");
	}
}