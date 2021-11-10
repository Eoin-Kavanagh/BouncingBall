package main;

public class Ball {
	
	private int posX;
	private int posY;
	private int diameter;
	private int dirX;
	private int dirY;
	
	public Ball(int posX, int posY, int diameter, int dirX, int dirY) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.diameter = diameter;
		this.dirX = dirX;
		this.dirY = dirY;
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
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}
	
	

}
