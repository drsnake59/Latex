public class Personne { //classe mere
	public String nom;
	public String prenom;
	
	...
}

public class Etudiant extends Personne {
	public int numCarte;
	
	public Etudiant(String nom, String prenom) {
		super(nom);
		super(prenom);
		this.numCarte = ... ;
	}
}
