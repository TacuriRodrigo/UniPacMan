package com.universita.pacman.pacman_game;

public class  Entità {
	protected double x,y;
	protected double deltaX, deltaY;
	double Xi,Yi;
	boolean flag;
	static double pacmanX;
	static double pacmanY;
	boolean block;
	
	//Entita inizia in un posto x e y - iesimo
	
	public Entità(double xi,double yi) {
		flag=false;
		deltaX=0;
		deltaY=0;
		this.deltaX=xi;
		this.deltaY=yi;
	}
	
	public void punto_origine(double a, double b) {
		this.x=a;
		this.y=b;
		deltaX=0;
		deltaY=0;
	}
	
	public void setPman(double x, double y) {
		pacmanX=x;
		pacmanY=y;
	}
	
	public double getPacx(){
		return pacmanX;
	}
	
	public double getPacy(){
		return pacmanY;
	}
	
	
	
	
}
