package com.universita.pacman.pacman_game;

import java.util.Random;

public class  Entità {
	protected double x,y;
	protected double deltaX, deltaY;
	boolean flag;
	

	public boolean block;
	
	//Entita inizia in un posto x e y - iesimo
	
	public Entità(double xi,double yi) {
		flag=true;
		deltaX=0;
		deltaY=0;
		this.x=xi;
		this.y=yi;
	}
	
	public void punto_origine(double a, double b) {
		this.x=a;
		this.y=b;
		deltaX=0;
		deltaY=0;
	}	
	


	
	
	
	public void move(Mappa mappa) {

		// Controllo Iniziale del Flag
		// Se 'flag' è false, significa che la Board (o contesto di gioco) non è stata
		// ancora inizializzata o impostata correttamente per l'entità.
		if (!flag)
			return; // Esci senza muovere l'entità
		
		// --- Calcolo delle Coordinate della Mappa (Grid) ---
		
		
		double squareHeight = mappa.getSquareHeight(); // Altezza in pixel di una singola cella della griglia (31 righe)
		double squareWidth = mappa.getSquareWidth();  // Larghezza in pixel di una singola cella della griglia (28 colonne)
		
		// Calcola la posizione futura (prossima) dell'entità nel sistema di coordinate della griglia.
		// `Xi` e `Yi` rappresentano la posizione del *centro* dell'entità nella griglia.
		// (x + deltaX - squareWidth / 2) è una formula comune per convertire da coordinate pixel a coordinate griglia.
		double Xi = (this.x + deltaX - squareWidth / 2) / squareWidth;
		double Yi = (this.y + deltaY - squareHeight / 2) / squareHeight;

		// --- Controlli Pre-Movimento ---

		// Controlla se il movimento porterebbe l'entità fuori dai limiti consentiti.
		if (outOfRange(Xi,Yi)) {
			return; // Se 'outOfRange' è vero (gestito internamente nel metodo) blocca il movimento
		}

		// Gestisce i comportamenti speciali nelle aree "calde" (probabilmente i tunnel di teletrasporto).
		if (warmAll(Xi, Yi))
			return; // Se la condizione del tunnel è soddisfatta, l'entità è teletrasportata e non si muove ulteriormente.

		
		// --- Logica di Movimento e Collisione (Commentata) ---
		
		int nextGridX=(int) (Xi+1);//calcolo la prossima casella
		int nextGridY=(int) (Yi+1);//calcola la prossima casella
			
		if (mappa.isClear(nextGridX,nextGridY)){
			// Se la prossima cella (nella Board) è libera:
			this.x = x + deltaX; // Aggiorna la posizione X
			this.y = y + deltaY; // Aggiorna la posizione Y
		} else if (this instanceof Ghost) {
			// Se la cella non è libera e l'entità è un Fantasma:
			block = true; // Imposta il flag 'block' (come visto in Ghost.randomMove()) per fargli cambiare direzione.
		}
		
		// La logica di movimento è *commentata* perché richiede l'implementazione della classe 'Board'.
		// In assenza della Board, l'entità in realtà non si muove in questo punto del codice.
	}
	
	protected boolean outOfRange(double Xi, double Yi) {
	    return false;
	}
	
	private boolean warmAll(double Xi, double Yi) {
		boolean ans = false;
		
		// Condizione di Ingresso nel Tunnel:
		// 1. La riga della griglia è la riga 14 (la riga del tunnel).
		// 2. La posizione X è all'estrema sinistra (colonna 0) O all'estrema destra (colonna 28).
		if ((int) Yi + 1 == 14 && ((int) Xi + 2 == 0 || Xi + 1 == 28)) {
			
			// Teletrasporto:
			if (Xi + 1 == 28)
				this.x = -9; // Teletrasporto da Destra a Sinistra (impostando X leggermente fuori dal bordo)
			else // Implicitamente (int) Xi + 2 == 0
				this.x = 411.5; // Teletrasporto da Sinistra a Destra (impostando X all'estremo destro)
			
			ans = true; // Indica che il teletrasporto è avvenuto.
		}
		
		return ans; // Restituisce true se il teletrasporto è avvenuto, bloccando il movimento nel metodo move().
	}
	
	


	
	
	
	public void setPosition(double newX, double newY) {
	    this.x = newX;
	    this.y = newY;
	}
	
    public double getX() {
    	return this.x;
    }
    public double getY() {
    	return this.y;
    }
    
    

}

	
	
