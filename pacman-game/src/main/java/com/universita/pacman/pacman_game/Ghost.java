package com.universita.pacman.pacman_game;

import java.util.Random;

public class Ghost extends Entità{
	
	public boolean startProcess;
	
	public Ghost(double xi,double yi){
		super(xi,yi);
		
		startProcess=false;
		block = false;
	}
	
	  void randomMove() {
		
		//esci dal box
		if(!startProcess) {
			deltaX=0;
			deltaY=-1;
			this.x = deltaX+x;
			this.y=deltaY+y;
			if(this.y==140) {
				startProcess=true;
			}
			return;
		}
		
		if(block) {
			block=false;
			Random Rnd1=new Random();
			Random Rnd2=new Random();
			
			int i=Rnd1.nextInt(900);
			int j=Rnd2.nextInt(900);
			
			i=i*j;
			i=i%4;
			
			switch(i) {
			case 0:
				deltaX=0; deltaY=-1;
				break;
			case 1:
				deltaX=0; deltaY=1;
				  break;
			case 2:
				deltaX=-1; deltaY=0;
				  break;
			case 3:
				deltaX=1; deltaY=0;
				  break;
			}
		}
		
		
		//super.move();
		
	}
	
	boolean eatPacman() {
		return Math.sqrt(Math.pow(this.x-pacmanX, 2 )+Math.pow(this.y-pacmanY, 2))<15;
	}
	
	public void move() {
		randomMove();
			if(eatPacman()) {
				//this.board.restart();
				startProcess=false;
			}
		//repaint();
	}
	
	@SuppressWarnings("unused")
	 void setDirection(int Tx ,int Ty ,int Sx , int Sy) {
		//turn left
		if (Tx<Sx){
			deltaX=-1; deltaY=0;
		}
		//turn right
		if (Tx>Sx){
			deltaX=1; deltaY=0;

		}
		//turn down
		if (Ty<Sy){
			deltaX=0; deltaY=1;


		}
		//turn up
		if (Ty>Sy){
			deltaX=0; deltaY=-1;

		}
			
			//super.move();

	}

}