package graph;

import javafx.scene.paint.Color;

public class Point {
	public int x,y;
	private Color color = Color.BLACK;
	private boolean black = true;
	
	public int getX() {
		return x;
	}
	public int setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public int setY(int y) {
		this.y = y;
	}
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		this.color = color;
	}
	
	public boolean isBlack() {
		return black;
	}
	
	void setBlack(boolean black) {
		this.blavk = black;
		if(this.black) {
			setColor(Color.BLACK);
		}
		else {
			setColor(Color.WHITE);
		}
	}
}
