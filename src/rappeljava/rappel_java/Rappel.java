package rappel_java;

public class Rappel {

	// on met le mot-clé 'static' car en dehors de main
	/*
	static String name = "Elmahdi";
	static int age = 33;
	static boolean single = true;
	*/
	
	public static void main(String[] args) {
		String name = "Elmahdi";
		byte age = 33;		
		boolean single = true;
		
		// TODO Auto-generated method stub
		System.out.println("Bonjour je m'appelle " + name + ".\n");
		System.out.println("J'ai " + age + " ans.");
		System.out.println("Je suis " + ((single) ? "célibataire" : "en couple")+ ".\n");
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 
		// cars[13] = "Mercedes";
		for(String car: cars) { 
			System.out.println("voiture : "+car);
		}
		
		for (int i=0;i<10;i++) {
			if (i==4) continue;
			if (i==8) break;
			System.out.println(i);
		}
	}
}
