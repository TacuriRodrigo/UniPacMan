package com.universita.pacman.model;

public class Pacman extends Entità{
	
	private static final double SPEED = 2.0;
	
	private int lives = 3;
	
	private double reqDX = 0;
	private double reqDY=0;
	
	private int score = 0;
	
	private static final double SNAP_EPS = 4; // tolleranza in pixel (2..4 va bene)

	
	
	public Pacman(double Xini, double Yini){
		super (Xini,Yini);

	}
	
	
	public int getLives() {
	    return lives;
	}
	
	public void resetScore() {
	    score = 0;
	}


	public void loseLife() {
	    lives--;
	}

	public void resetLives() {
	    lives = 3;
	}
	
	
	
	public void addScore(int points) {
	    score += points;
	}

	public int getScore() {
	    return score;
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
	public void move(Mappa mappa) {

	    // Se posso prendere la direzione richiesta, applicala
	    if (canMove(mappa, reqDX, reqDY)) {

	        // Se sto cambiando asse (turn)
	        boolean turningToVertical = (reqDX == 0 && reqDY != 0 && deltaX != 0);
	        boolean turningToHorizontal = (reqDY == 0 && reqDX != 0 && deltaY != 0);

	        double tileW = mappa.getSquareWidth();
	        double tileH = mappa.getSquareHeight();

	        if (turningToVertical) {
	            // snap X al centro della colonna se sono "quasi" centrato
	            double targetX = (Math.floor(x / tileW) * tileW) + tileW / 2.0;
	            if (Math.abs(x - targetX) <= SNAP_EPS) {
	                x = targetX;
	            }
	        } else if (turningToHorizontal) {
	            // snap Y al centro della riga se sono "quasi" centrato
	            double targetY = (Math.floor(y / tileH) * tileH) + tileH / 2.0;
	            if (Math.abs(y - targetY) <= SNAP_EPS) {
	                y = targetY;
	            }
	        }

	        deltaX = reqDX;
	        deltaY = reqDY;
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
