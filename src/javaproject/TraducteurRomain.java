package javaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Votre client vous demande de concevoir un programme capable de convertir des chiffres arabes (par exemple 1987) 
en chiffres romains (par exemple MCMLXXXVII). 
Le programme doit demander à l'utilisateur un nombre et ensuite afficher son équivalent en chiffres romains.
*/

// Exercice 4 : "Le traducteur de chiffres romains"
public class TraducteurRomain {
	String[][] myNumbers = {{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "50", "100", "500", "1000"},{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIX", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "L", "C", "D", "M"}};
 
	public String[][] getMyNumbers() {
		return myNumbers;
	}

	public void setMyNumbers(String[][] myNumbers) {
		this.myNumbers = myNumbers;
	}
	
	public int calculQuotien(int chiffreA, int chiffreB) {
		int quotien = (chiffreA) / (chiffreB);
		return quotien;
	}
	
	public static void main(String[] args) {
		TraducteurRomain traducteurRomain = new TraducteurRomain();

		List<String> listChiffreRomain = new ArrayList<String>();
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter le nombre à convertir :");

	    String nombreAConvertir = myObj.nextLine();  // Read user input
	    String NombreArabe = nombreAConvertir;
	    
	    int quotien = 0;
	    int reste = -1;
	    
	    while (reste != 0) {
		    for (int i=traducteurRomain.myNumbers[0].length-1; i >=0 ;i--){
	    		
	    		if (nombreAConvertir.equals(traducteurRomain.myNumbers[0][i])) {
        			listChiffreRomain.add(traducteurRomain.myNumbers[1][i]);
	    			reste = 0;
	    			break;
	    		}else {
	        		quotien = traducteurRomain.calculQuotien(Integer.parseInt(nombreAConvertir), Integer.parseInt(traducteurRomain.myNumbers[0][i]));
	        		if (quotien != 0) {
	            		for (int j = 0; j < quotien; j++) {
	            			listChiffreRomain.add(traducteurRomain.myNumbers[1][i]);
	            		}
	            		reste = Integer.parseInt(nombreAConvertir) - (quotien * Integer.parseInt(traducteurRomain.myNumbers[0][i]));
	            		quotien = 0;
	            		nombreAConvertir = String.valueOf(reste);
	        		}
	    		}
		    }
	    }

		System.out.println(NombreArabe + " <=> "+String.join("", listChiffreRomain));
	}
}
