package com.universita.pacman.model;

public class Pacman extends Entità{
	
	private static final double SPEED = 2.0;
	
	private double reqDX = 0;
	private double reqDY=0;
	
	
	public Pacman(double Xini, double Yini){
		super (Xini,Yini);

	}
	
	public void setSu() {
		reqDX=0; 
		reqDY=-SPEED;
	}
	
	public void setGiù() {
		reqDX=0;
		reqDY=SPEED;
	}
	
	public void setDx() {
		reqDX=SPEED;
		reqDY=0;
	}
	
	public void setSx() {
		reqDX=-SPEED;
		reqDY=0;
	}
	
	
	public void stop() {
		reqDX=0;
		reqDY=0;
		deltaX=0;
		deltaY=0;
	}
	
	/* metodo per il test */
	
	private void updatePos() {
		this.x+=deltaX;
		this.y+=deltaY;
	}
	
	/************************/
	
	@Override
	public void move(Mappa mappa){
		if(canMove(mappa, reqDX,reqDY)) {
			deltaX=reqDX;
			deltaY=reqDY;
		}
		
		super.move(mappa);
	}

	private boolean canMove(Mappa mappa, double dx, double dy) {
		if(dx==0 && dy==0) return true;
		
		double tileW = mappa.getSquareWidth();
		double tileH = mappa.getSquareHeight();
		
		double nextX=x+dx;
		double nextY=y+dy;
		
		int col = (int)Math.floor(nextX / tileW);
		int row = (int)Math.floor(nextY / tileH);
		
		return mappa.isClear(row, col);
	}
	




}
