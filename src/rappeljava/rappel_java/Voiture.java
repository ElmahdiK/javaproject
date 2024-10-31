package rappel_java;

public class Voiture {
	String marque;
	String modele;
	short anneeFabrication;
	int vitesseActuelle = 0;
	
	public Voiture(String marque, String modele, short anneeFabrication, int vitesseActuelle) {
		this.marque = marque;
		this.modele = modele;
		this.anneeFabrication = anneeFabrication;
		this.vitesseActuelle = vitesseActuelle;
	}
	
	void demarrer() {
		System.out.println("Voiture démarrée.");
	}

	void accelerer(int vitesse) {
		this.vitesseActuelle += vitesse;
	}
	
	void freiner(int vitesse) {
		if (this.vitesseActuelle - vitesse > 0) {
			this.vitesseActuelle -= vitesse;			
		} else System.out.println("Impossible de freiner");
	}
	
	void afficherEtat() {
		System.out.println("Informations : "+ this.marque +" - "+ this.modele +" - "+ this.anneeFabrication + " ___ Vitesse actuelle : "+ this.vitesseActuelle);
		//System.out.println("\n");
	}
}
