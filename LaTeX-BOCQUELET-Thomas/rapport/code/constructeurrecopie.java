public class Carre {
	private Point point;
	private int longueur;
	
	public Carre(int x, int y, int longueur) { //constructeur avec parametres
		point = new Point();
		point.setX(x);
		point.setY(y);
		this.longueur = longueur;
	}
	public Carre(Carre carre) { //constructeur par recopie
		this.longueur = carre.longueur;
		this.point=newPoint();
		this.point.setX(carre.point.getX());
		this.point.setY(carre.point.getY());
	}
	
	public void setX(int x) {
		this.point.setX(x);
	}
}
