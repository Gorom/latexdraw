package net.sf.latexdraw.testautomation;

public class Circle {

	private int posX;
	private int posY;
	private int radius;

	public Circle(int posX, int posY, int radius) {

		this.posX = posX;
		this.posY = posY;
		this.radius = radius;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}