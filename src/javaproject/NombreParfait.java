package javaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Exercice 2 : "L'énigme du nombre parfait"
public class NombreParfait {
	List<Integer> listDiviseurPropre = new ArrayList<Integer>();
	
	public List<Integer> getListDiviseurPropre() {
		return listDiviseurPropre;
	}

	public void setListDiviseurPropre(List<Integer> listDiviseurPropre) {
		this.listDiviseurPropre = listDiviseurPropre;
	}

	public boolean isParfait(int nbAtester) {
		int sommeDiviseurPropre = 0;
		for (int i=1; i<nbAtester; i++) {
			if (nbAtester%i == 0) {
				listDiviseurPropre.add(i);
				sommeDiviseurPropre += i;
			}
		}
		return nbAtester == sommeDiviseurPropre;
	}
	
	public static void main(String[] args) {
		NombreParfait nombreParfait = new NombreParfait();
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter le nombre souhaité :");

	    int nombreAtester = myObj.nextInt();  // Read user input
	    System.out.println(nombreAtester + " est un nombre " + (nombreParfait.isParfait(nombreAtester) ? "Parfait !": "non parfait"));
	    System.out.println("\nLes diviseurs propres de " + nombreAtester +" sont "+nombreParfait.getListDiviseurPropre());
	    int sumDiviseursPropres = nombreParfait.getListDiviseurPropre().stream().mapToInt(Integer::intValue).sum();
	    System.out.println("La somme de ces diviseurs propres vaut : "+sumDiviseursPropres);
	    
	}
}
