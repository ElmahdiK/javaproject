package heritage;

public class Vehicule {
	String marque;
	String modele;
	short anneeFabrication;
	
	public Vehicule(String marque, String modele, short anneeFabrication) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.anneeFabrication = anneeFabrication;
	}

	void demarrer() {
		System.out.println("Voiture démarrée.");
	}
	
	void afficherEtat() {
		System.out.println("Informations : "+ this.marque +" - "+ this.modele +" - "+ this.anneeFabrication);
	}
}