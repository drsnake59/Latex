public class Droite {
	private Point p1, p2;
	
	public Droite() { //constructeur par defaut
			this(0,0,0,0);
	}
	
	public Droite(int x1, int y1, int x2, int y2) { //constructeur avec parametres
		p1 = new Point();
		p1.setX(x1);
		p1.setY(y1);
		
		p2 = new Point();
		p2.setX(x2);
		p2.setY(y2);
	}
}
