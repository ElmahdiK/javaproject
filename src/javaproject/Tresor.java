package javaproject;

import java.util.Date;

// Exercice 3 : "La salle des trésors"
public class Tresor {
	int nbComptabilise = 1;
	Date today = new Date();
	
	public int getNbComptabilise() {
		return nbComptabilise;
	}

	public void setNbComptabilise(int nbComptabilise) {
		this.nbComptabilise = nbComptabilise;
	}
	
	public void addNewTresor() {
		this.setNbComptabilise(this.nbComptabilise + 1);
		System.out.println(this.afficherMessage());
	}
	
	public String afficherMessage() {
		if (this.nbComptabilise % 3 == 0) {
			return "Trésor compté à une position multiple de 3 !";
		}else {
			return "Nouveau trésor ajouté!";
		}
	}
	
	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public static void main(String[] args) {
		Tresor tresor = new Tresor();

		System.out.println(tresor.getToday());
		System.out.println(tresor.getNbComptabilise());
		tresor.addNewTresor();
		System.out.println(tresor.getNbComptabilise());
		tresor.addNewTresor();
		System.out.println(tresor.getNbComptabilise());
	}
}
