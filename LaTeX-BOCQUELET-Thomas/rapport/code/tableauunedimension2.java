import java.util.Random; //generateur de nombre aleatoire

public class TestTab {
	public static void main(String[] args) {
		int tab[];
		Random rand = new Random();
		final int MAX = 20; //declaration d'une constante
		
		int nb_aleatoire = rand.nextInt(MAX); //nombre aleatoire
		tab = new int[nb_aleatoire]; //creation du tableau
		
		System.out.println("Taille du tableau: " + tab.length);
		for(int i=0; i<tab.length; i++) { //on parcourt tout le tableau
			System.out.println("Contenu indice: " + i + " > " + tab[i]);
		}
	}
}
