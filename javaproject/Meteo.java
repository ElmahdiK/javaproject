package javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Exercice 3 : "Les températures extrêmes"
public class Meteo {
	List<Integer> listTemperatures = new ArrayList<Integer>();

	public List<Integer> getListTemperatures() {
		return listTemperatures;
	}

	public void setListTemperatures(List<Integer> listTemperatures) {
		this.listTemperatures = listTemperatures;
	}

	public static void main(String[] args) {
		Meteo meteo = new Meteo();
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Sur combien de jours souhaitez vous enregistrer les températures ? :");
	    int nbJours = myObj.nextInt();  // Read user input	    
		System.out.println("Ok ça sera sur : " + nbJours + " jours");
		
		for (int i =1; i <= nbJours; i++) {
		    Scanner readObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Entrer la température pour le jour n°" + i + " : ");
		    meteo.getListTemperatures().add(readObj.nextInt());  // Read user input	    
		}

		System.out.println("Récapitulatif : Les "+nbJours+" températures enregistrées sont les suivantes : " + meteo.getListTemperatures());
		System.out.println("La température la plus élevée enregistrée est : " + Collections.max(meteo.getListTemperatures()));
		System.out.println("La température la plus basse enregistrée est : " + Collections.min(meteo.getListTemperatures()));
	}
}
