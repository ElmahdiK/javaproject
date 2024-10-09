package javaproject;

// Exercice 2 : "La sécurité du musée"
public class Musee {
	int age = 20;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isAgeAutorisee() {
		return this.age > 18;
	}

	public static void main(String[] args) {
		Musee musee = new Musee();
		System.out.println(musee.isAgeAutorisee() ? "autorisée" : "non autorisée");
		musee.setAge(15);
		System.out.println(musee.isAgeAutorisee() ? "autorisée" : "non autorisée");
	}
}
