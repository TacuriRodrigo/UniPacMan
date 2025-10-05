package com.universita.pacman.pacman_game;

public class  Entità {
	protected double x,y;
	protected double deltaX, deltaY;
	double Xi,Yi;
	boolean flag;
	static double pacmanX;
	static double pacmanY;
	public boolean block;
	
	//Entita inizia in un posto x e y - iesimo
	
	public Entità(double xi,double yi) {
		flag=false;
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
	
	
	
	public void move() {

		// Controllo Iniziale del Flag
		// Se 'flag' è false, significa che la Board (o contesto di gioco) non è stata
		// ancora inizializzata o impostata correttamente per l'entità.
		if (!flag)
			return; // Esci senza muovere l'entità
		
		// --- Calcolo delle Coordinate della Mappa (Grid) ---
		
		int mapHeight = 416; // Altezza totale dell'area di gioco in pixel
		int mapWidth = 429;  // Larghezza totale dell'area di gioco in pixel
		double squareHeight = mapHeight / 31; // Altezza in pixel di una singola cella della griglia (31 righe)
		double squareWidth = mapWidth / 28;  // Larghezza in pixel di una singola cella della griglia (28 colonne)
		
		// Calcola la posizione futura (prossima) dell'entità nel sistema di coordinate della griglia.
		// `Xi` e `Yi` rappresentano la posizione del *centro* dell'entità nella griglia.
		// (x + deltaX - squareWidth / 2) è una formula comune per convertire da coordinate pixel a coordinate griglia.
		Xi = (this.x + deltaX - squareWidth / 2) / squareWidth;
		Yi = (this.y + deltaY - squareHeight / 2) / squareHeight;

		// --- Controlli Pre-Movimento ---

		// Controlla se il movimento porterebbe l'entità fuori dai limiti consentiti.
		if (outOfRange()) {
			return; // Se 'outOfRange' è vero (gestito internamente nel metodo) blocca il movimento
		}

		// Gestisce i comportamenti speciali nelle aree "calde" (probabilmente i tunnel di teletrasporto).
		if (warmAll(Xi, Yi))
			return; // Se la condizione del tunnel è soddisfatta, l'entità è teletrasportata e non si muove ulteriormente.

		
		// --- Logica di Movimento e Collisione (Commentata) ---
		/*	
		if (board.isClear((int) Yi + 1, (int) Xi + 1)) {
			// Se la prossima cella (nella Board) è libera:
			this.x = x + deltaX; // Aggiorna la posizione X
			this.y = y + deltaY; // Aggiorna la posizione Y
			if (this instanceof Pacman)
				board.eat((int) Yi + 1, (int) Xi + 1); // Se è Pac-Man, mangia il punto
		} else if (this instanceof Ghost) {
			// Se la cella non è libera e l'entità è un Fantasma:
			block = true; // Imposta il flag 'block' (come visto in Ghost.randomMove()) per fargli cambiare direzione.
		}
		*/
		// La logica di movimento è *commentata* perché richiede l'implementazione della classe 'Board'.
		// In assenza della Board, l'entità in realtà non si muove in questo punto del codice.
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
	
	
	// Da implementare con GHOST!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
	private boolean outOfRange() {
		return false;
	}

}

	
	
