package javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

// Exercice 5 : "Le générateur de mot de passe sécurisé"
public class Password {
	List<Object> motdePasseChar = new ArrayList<Object>();
	
    
    public List<Object> getMotdePasseChar() {
		return motdePasseChar;
	}

	public void setMotdePasseChar(List<Object> motdePasseChar) {
		this.motdePasseChar = motdePasseChar;
	}

    public boolean containsSpecialCharacter(String s) {
        return (s == null) ? false : s.matches("[^A-Za-z0-9]");
    }
    
	public static void main(String[] args) {
		Password password = new Password();

	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter la longueur du mot de passe :");
	    int passwordSize = myObj.nextInt();

		int min = 0;
		int max = 9;

	    //System.out.println(password.getMotdePasseChar().size() + " - passwordSize :" + passwordSize);
		
		String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~";
		
		while(password.getMotdePasseChar().size() < passwordSize) {			
			// 1 - des lettres majuscules,
			Random randomMaj = new Random();
			char randomMajChar = (char)(randomMaj.nextInt(26) + 'a');
			password.getMotdePasseChar().add(Character.toUpperCase(randomMajChar));
			if (password.getMotdePasseChar().size() >= passwordSize) break;
			
			// 2 - des lettres minuscules,
			Random randomMin = new Random();
			char randomMinChar = (char)(randomMin.nextInt(26) + 'a');
			password.getMotdePasseChar().add(Character.toLowerCase(randomMinChar));
			if (password.getMotdePasseChar().size() >= passwordSize) break;

			// 3 - des chiffres 
			Random randomNum = new Random();
			int randomNumChar = randomNum.nextInt(max + 1 - min) + min;
			password.getMotdePasseChar().add(randomNumChar);
			if (password.getMotdePasseChar().size() >= passwordSize) break;

			// 4 - et des symboles spéciaux. 
			Random randomSpe = new Random();
			int randomNumSpe = randomSpe.nextInt((specialCharacters.length()-1) + 1 - 0) + 0;
			char randomSpeChar = specialCharacters.charAt(randomNumSpe);
			password.getMotdePasseChar().add(randomSpeChar);
			if (password.getMotdePasseChar().size() >= passwordSize) break;
		}

		System.out.println("Le mot de passe contient : " +  password.getMotdePasseChar().size() + " caractères => "+ password.getMotdePasseChar());
		Collections.shuffle(password.getMotdePasseChar());
		System.out.println(password.getMotdePasseChar());
		
		// String joined = String.join("",(Object) Arrays.asList(password.getMotdePasseChar()));
		// System.out.println(joined);
		/*
			String[] arrayPassword = new String[password.getMotdePasseChar().size()];
			String[] arr = password.getMotdePasseChar().toArray(new String[] {});
			System.out.println(Arrays.deepToString(arr));
		*/
	}
}
