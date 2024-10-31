package rappel_java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Voiture voiture = new Voiture("BMW", "Berline", (short) 1994, 120);
		
		//
		voiture.demarrer();
		voiture.afficherEtat();
		
		//
		voiture.accelerer(10);
		voiture.afficherEtat();
		
		//
		voiture.freiner(1);
		voiture.afficherEtat();
		
		
		//
		voiture.freiner(180);
		voiture.afficherEtat();
	}

}
