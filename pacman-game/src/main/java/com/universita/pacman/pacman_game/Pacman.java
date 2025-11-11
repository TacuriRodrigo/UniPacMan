package com.universita.pacman.pacman_game;

public class Pacman extends Entità{
	
	public Pacman(double Xini, double Yini){
		super (Xini,Yini);

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
	
	
	public void stop() {
		deltaX=0;
		deltaY=0;
	}
	
	/* metodo per il test */
	
	public void updatePos() {
		this.x+=deltaX;
		this.y+=deltaY;
	}
	
	/************************/
	
	@Override
	public void move(Mappa mappa){
		super.move(mappa);
		
		

}

}
