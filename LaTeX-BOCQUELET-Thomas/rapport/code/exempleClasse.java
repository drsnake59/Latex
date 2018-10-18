public class Circle {
	private double x, y, rayon;
	
	/** Calcul de l'aire
	 * @return l'aire du cercle
	 */
	 
	 public double getArea() {
		 return Math.PI * Math.pow(rayon, 2);
	 }
	 
	 /** Translation sur l'axe X
	  * @param value: decalage de l'axe
	  */
	  
	  public void translateX(double value) {
		  x = x+value;
	  }
}
