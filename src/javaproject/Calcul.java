package javaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Exercice 4 : "Le marathon de calculs" (avec tableaux)
public class Calcul {
	
	public int getRandomNb(int minimum, int maximum) {
		Random rand = new Random();
		int randomNum = minimum + rand.nextInt((maximum - minimum) + 1);
		return randomNum;
	}
	
	public static void main(String[] args) {
		List<Integer> results = new ArrayList<Integer>();
		
		Calcul calcul = new Calcul();
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter le nombre de calcul à effectuer :");

	    int nbCalcul = myObj.nextInt();  // Read user input
	    for (int i = 0; i < nbCalcul;i++) {
	    	int nb1 = calcul.getRandomNb(1,10);
	    	int nb2 = calcul.getRandomNb(1,10);
	    	int somme = nb1+nb2;
			results.add(somme);
			System.out.println(nb1+"+"+nb2+"="+somme);
	    }
	    
	    System.out.println("Tableau de résultats :" + results);
	}
}
