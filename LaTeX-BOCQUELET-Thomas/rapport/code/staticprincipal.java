public static void main(String[] args) {
	Etudiant sacha, helmut, omer;
	
	sacha = new Etudiant("Touille");
	helmut = new Etudiant("Hardelpik");
	omer = new Etudiant("Dalors");
	
	int NB = Etudiant.getNBEtudiants();
	System.out.println(NB);
	
	//affichage de l'etudiant "helmut"
	System.out.println(helmut.getNom());
	System.out.println(helmut.getNumCarte());
}
