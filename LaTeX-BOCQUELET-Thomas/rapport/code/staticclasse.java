public class Etudiant {
	private static int nombre_etudiants = 0;
	
	private String nom;
	private int numCarte;
	
	private static void nouvelleInscription() {
		nombre_etudiants++;
	}
	private static int getNbEtudiants() {
		return nombre_etudiants;
	}
	
	public Etudiant(String nom) {
		nouvelleInscription();
		this.nom = nom;
		this.numCarte = getNbEtudiants();
	}
	public String getNom() {
		return nom;
	}
	public int getNumCarte() {
		return numCarte;
	}
} 
