package javaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//exo 5
public class CoffreFort {
	String password = "pass06";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		List<String> listPasswordTest = new ArrayList<String>();
		CoffreFort coffreFort = new CoffreFort();
		
		String passwordTest = "";

		while (!coffreFort.getPassword().equals(passwordTest)) {
		    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter le password :");
		    passwordTest = myObj.nextLine();
		    if (coffreFort.getPassword().equals(passwordTest)) break;
		    listPasswordTest.add(passwordTest);
		}
	    
		System.out.println("Super, vous avez entrée le bon password : " + passwordTest);
	    System.out.println("Tentative des passwords incorrect :" + listPasswordTest);
	}
}
