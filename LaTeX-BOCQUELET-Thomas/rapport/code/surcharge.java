import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locate;

public class Personne {
	private String nom, prenom;
	Calendar naissance;
	int numSecu;
	
	public Personne(String nom, String prenom, int numSecu) {
		this.nom = nom;
		this.prenom = prenom;
		this.numSecu = numSecu;
	}
	
	public void setNaissance(Calendar naissance) {
		this.naissance = naissance;
	}
	
	@Override
	public String toString() { //surcharge de toString()
		String chaine = String.format(Locale.FRANCE, "%s %s [%3$tA %3$te %3$tB %3$tY]", prenom, nom.toUpperCase(), naissance);
		return chaine;
	}
	
	//on implemente une fonction main de test
	public static void main(String[] args) {
		Personne greg = new Personne("Bourguin", "Gregory", 007);
		Calendar calendar = GregorianCalendar.getInstance(Locale.FRANCE);
		greg.setNaissance(calendar);
		
		System.out.println(greg);
	}
}
