package com.universita.pacman.pacman_game;

import java.util.Random;

public class Ghost extends Entità {

    public boolean startProcess;
    static final double COLLISION_RADIUS = 15.0;
    // La variabile 'public Pacman pacman;' è stata RIMOSSA

    public Ghost(double xi, double yi) {
        super(xi, yi);
        startProcess = false;
        block = false;
    }

 // In Ghost.java
 // SOSTITUISCI IL TUO randomMove() CON QUESTO:

    void randomMove() {

    	// --- OBIETTIVO: Uscire dalla Scatola ---
    	if (!startProcess) {
         
    		// Se 'block' è true, significa che abbiamo sbattuto contro il tetto (riga 12)
    		// Questo è il nostro segnale per uscire!
    		if (block) {
    			block = false;         // Resetta il blocco, abbiamo capito
    			startProcess = true;   // SIAMO FUORI!
             
    			// Ora impostiamo una mossa laterale casuale per andarcene
    			deltaX = (new Random().nextBoolean()) ? 1 : -1; // 1 (destra) o -1 (sinistra)
    			deltaY = 0;
    			return; // Fatto
    		}
         
    		// Se non siamo bloccati, continua a muoverti SU per raggiungere il tetto
    		deltaX = 0;
    		deltaY = -1;
    		return;
    	}

    	// --- OBIETTIVO: Muoversi a Caso (Logica normale) ---
    	// Questa parte viene eseguita solo se startProcess è true
    	if (block) {
    		block = false;
    		Random rnd = new Random();
    		int i = rnd.nextInt(4); // Genera direttamente un numero tra 0 e 3
    		switch (i) {
             	case 0: deltaX = 0; deltaY = -1; break; // SU
             	case 1: deltaX = 0; deltaY = 1; break; // GIÙ
             	case 2: deltaX = -1; deltaY = 0; break; // SINISTRA
             	case 3: deltaX = 1; deltaY = 0; break; // DESTRA
    		}
    	}
    }

    
    // La firma ora accetta Xi e Yi come parametri
    	@Override
    	// La firma ora accetta int e usa i nomi corretti
    protected boolean outOfRange(int gridX, int gridY) { 
    	// Usa i nuovi parametri, non 'Yi'
    if (this.x + deltaX < 0 && gridY != 14) { // Logica semplificata, 14 è la riga del tunnel
    	 deltaX = 1;
     }
     if (this.y + deltaY < 11) { // Questo controlla l'uscita dalla "scatola"
         Random rnd = new Random();
         int i = rnd.nextInt(87); // Lascio la tua logica originale
         i = i % 3;
         switch (i) {
             	case 0: deltaX = 0; deltaY = 1; break;
             	case 1: deltaX = 1; deltaY = 0; break;
             	case 2: deltaX = -1; deltaY = 0; break;
         	}
     	}
     	return false;
    }

    public boolean isCollidingWith(Pacman pacman) {
        // Calcola la distanza tra il centro del fantasma e il centro di pacman
        double distance = Math.sqrt(
            // Usa i nuovi metodi getX() e getY() ereditati da Entita
            Math.pow(this.x - pacman.getX(), 2) +
            Math.pow(this.y - pacman.getY(), 2)
        );

        return distance < COLLISION_RADIUS;
    }

    // La firma ora accetta anche Pacman
    public void move(Mappa mappa, Pacman pacman) {
        // 1. Decidi la mossa
        randomMove();
        
        // 2. Controlla la collisione
        if (isCollidingWith(pacman)) {
            startProcess = false;
        }
        
        // 3. Esegui la mossa (usando la logica di Entita)
        super.move(mappa);
    }

    @SuppressWarnings("unused")
    void setDirection(int Tx, int Ty, int Sx, int Sy) {
        //turn left
        if (Tx < Sx) {
            deltaX = -1; deltaY = 0;
        }
        //turn right
        if (Tx > Sx) {
            deltaX = 1; deltaY = 0;
        }
        //turn down
        if (Ty < Sy) {
            deltaX = 0; deltaY = 1;
        }
        //turn up
        if (Ty > Sy) {
            deltaX = 0; deltaY = -1;
        }
        
        // La chiamata a super.move() è stata RIMOSSA anche da qui
    }
    

}