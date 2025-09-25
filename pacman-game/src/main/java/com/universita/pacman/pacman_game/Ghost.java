package com.universita.pacman.pacman_game;

public class Ghost extends Entità{
	
	public boolean startProcess;
	
	public Ghost(double xi,double yi){
		super(xi,yi);
		
		startProcess=false;
	}
	/*
	private boolean eatPacman() {
		return Math.sqrt(Math.pow(this.x-pacmanX, 2 )+Math.pow(this.y-pacmanY, 2))<15;
	}
	
	*/

}