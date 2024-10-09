package javaproject;

import java.util.Arrays;

public class CalculateurMoyenne {

	static float[] notesEleve1 = {10, 20, 15};
	static float[] notesEleve2 = {1, 2, 20};
	static float[] notesEleve3 = {0, 0, 18};
	
	public float calculMoyenne(float[] notes) {
		float somme = 0;
		for (float note: notes) somme += note;
		return somme/notes.length;
	}
	
	public static void main(String[] args) {
		CalculateurMoyenne calculateurMoyenne = new CalculateurMoyenne();
		
		float moyenneEleve1 = calculateurMoyenne.calculMoyenne(notesEleve1);
		float moyenneEleve2 = calculateurMoyenne.calculMoyenne(notesEleve2);
		float moyenneEleve3 = calculateurMoyenne.calculMoyenne(notesEleve3);
		
		float[] notesMoyennes = {moyenneEleve1, moyenneEleve2, moyenneEleve3};
		float moyenneGenerale = calculateurMoyenne.calculMoyenne(notesMoyennes);
		
		System.out.println(Arrays.toString(notesEleve1) + " => La moyenne de l'élève 1 est : " + moyenneEleve1);
		System.out.println(Arrays.toString(notesEleve2) + " => La moyenne de l'élève 2 est : " + moyenneEleve2);
		System.out.println(Arrays.toString(notesEleve3) + " => La moyenne de l'élève 3 est : " + moyenneEleve3);
		System.out.println("La moyenne générale est de : " + moyenneGenerale);
	}
}
