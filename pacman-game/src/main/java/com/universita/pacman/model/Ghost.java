package com.universita.pacman.model;

import java.util.Random;

public class Ghost extends Entità {

    public boolean startProcess;
    private static final double SPEED = 1.6;


    private final Random rnd;

    public Ghost(double xi, double yi) {
        this(xi,yi,new Random());
    }
    
    public Ghost(double xi, double yi, Random rnd) {
    	super(xi, yi);
        this.rnd = rnd;
        startProcess = false;
        block = false;
        
        deltaX=1;
        deltaY=0;
    }

    
    protected void randomMove() {

        if (deltaX == 0 && deltaY == 0) {
            deltaX = SPEED;
            deltaY = 0;
        }
    	// --- OBIETTIVO: Uscire dalla Scatola ---
    	if (!startProcess) {
         
    		// Se 'block' è true, significa che abbiamo sbattuto contro il tetto (riga 12)
    		// Questo è il nostro segnale per uscire!
    		if (block) {
    			block = false;         // Resetta il blocco, abbiamo capito
    			startProcess = true;   // SIAMO FUORI!
             
    			// Ora impostiamo una mossa laterale casuale per andarcene
    			deltaX = (rnd.nextBoolean()) ? SPEED : -SPEED; // 1 (destra) o -1 (sinistra)
    			deltaY = 0;
    			return; // Fatto
    		}
         
    		// Se non siamo bloccati, continua a muoverti SU per raggiungere il tetto
    		deltaX = 0;
    		deltaY = -SPEED;
    		return;
    	}

    	// --- OBIETTIVO: Muoversi a Caso (Logica normale) ---
    	// Questa parte viene eseguita solo se startProcess è true
    	if (block) {
    		block = false;
    		int i = rnd.nextInt(4); // Genera direttamente un numero tra 0 e 3
    		switch (i) {
             	case 0: deltaX = 0; deltaY = -SPEED; break; // SU
             	case 1: deltaX = 0; deltaY = SPEED; break; // GIÙ
             	case 2: deltaX = -SPEED; deltaY = 0; break; // SINISTRA
             	case 3: deltaX = SPEED; deltaY = 0; break; // DESTRA
    		}
    	}
    }

    
    @Override
    protected boolean outOfRange(int gridX, int gridY) {
        // Esempio: se non sei nella riga tunnel, evita di uscire a sinistra fuori mappa
        if (gridX < 0 && gridY != 14) {
            deltaX = 1; 
            deltaY = 0;
            return true; // ho gestito io, non continuare
        }

        // Logica "scatola": se sei sopra una certa riga, scegli una direzione per rientrare/uscire
        // Qui 11 deve essere una RIGA, non pixel
        if (gridY < 11) {
            int i = rnd.nextInt(3);
            switch (i) {
                case 0: deltaX = 0; deltaY = 1; break;
                case 1: deltaX = 1; deltaY = 0; break;
                case 2: deltaX = -1; deltaY = 0; break;
            }
            return true;
        }

        return false;
    }


    public boolean isCollidingWith(Pacman pacman, Mappa mappa) {
        double dx = this.x - pacman.getX();
        double dy = this.y - pacman.getY();
        double distance = Math.sqrt(dx*dx + dy*dy);

        double radius = mappa.getSquareWidth() * 0.45; // circa metà tile
        return distance < radius;
    }

    // La firma ora accetta anche Pacman
    public void move(Mappa mappa, Pacman pacman) {
        // 1. Decidi la mossa
        randomMove();
        
        // 2. Controlla la collisione
        if (isCollidingWith(pacman,mappa)) {
            startProcess = false;
        }
        
        // 3. Esegui la mossa (usando la logica di Entita)
        super.move(mappa);
    }
    
    @Override
    public void move(Mappa mappa) {
        randomMove();
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
    
    void moveWithoutAI(Mappa mappa) {
        super.move(mappa);
    }

    

}