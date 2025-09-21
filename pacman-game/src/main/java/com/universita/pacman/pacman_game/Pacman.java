package com.universita.pacman.pacman_game;

public class Pacman extends Entità{
	
	public Pacman(double Xini, double Yini){
		super (Xini,Yini);
		setPman(Xini, Yini);
	}
	
	public void setSu() {
		deltaX=0; 
		deltaY=-1;
	}
	
	public void setGiù() {
		deltaX=0;
		deltaY=1;
	}
	
	public void setDx() {
		deltaX=1;
		deltaY=0;
	}
	
	public void setSx() {
		deltaX=-1;
		deltaY=0;
	}
	
	public double getXInd() {
		return this.x;
	}
	
	public double getYInd() {
		return this.y;
	} 
	
	public void setXind(double nx) {
		this.x=nx;
	}
	
	public void setYind(double ny) {
		this.y=ny;
	}
	
	public void OdeltaXY() {
		deltaX=0;
		deltaY=0;
	}
	
	/* metodo per il test */
	
	public void updatePos() {
		this.x+=deltaX;
		this.y+=deltaY;
	}
	
	/************************/

}
