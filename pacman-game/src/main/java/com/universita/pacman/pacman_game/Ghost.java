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

    // randomMove ora imposta solo la direzione, non chiama super.move()
    void randomMove() {

        //esci dal box
        if (!startProcess) {
            deltaX = 0;
            deltaY = -1;
            // NON modificare x e y direttamente, lascia che 'super.move' lo faccia
            // this.x = deltaX+x;  <- RIMOSSO
            // this.y = deltaY+y;  <- RIMOSSO
            if (this.y <= 140) { // Uso <= per sicurezza
                startProcess = true;
            }
            return; // Ritorna dopo aver impostato la direzione
        }

        if (block) {
            block = false;
            // Logica per il numero casuale (Semplificata!)
            Random rnd = new Random();
            int i = rnd.nextInt(4); // Genera direttamente un numero tra 0 e 3

            switch (i) {
                case 0: deltaX = 0; deltaY = -1; break; // SU
                case 1: deltaX = 0; deltaY = 1; break; // GIÙ
                case 2: deltaX = -1; deltaY = 0; break; // SINISTRA
                case 3: deltaX = 1; deltaY = 0; break; // DESTRA
            }
        }
        
        // La chiamata a super.move() è stata RIMOSSA da qui
    }

    @Override
    // La firma ora accetta Xi e Yi come parametri
    protected boolean outOfRange(double Xi, double Yi) { 
        // Ho rimosso 'this instanceof Ghost', non serve, siamo già in Ghost
        if (this.x + deltaX < 0 && Yi + 1 != 14) {
            deltaX = 1;
        }
        if (this.y + deltaY < 11) {
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