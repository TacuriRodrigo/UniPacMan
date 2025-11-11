package com.universita.pacman.pacman_game;

// java.util.Random non è più usato qui, sarà usato in Ghost.java
// import java.util.Random; 

public class Entità {
    protected double x, y;
    protected double deltaX, deltaY;
    boolean flag;
    public boolean block;

    public Entità(double xi, double yi) {
        flag = true; // Impostato a true per permettere il movimento
        deltaX = 0;
        deltaY = 0;
        this.x = xi;
        this.y = yi;
    }

    public void punto_origine(double a, double b) {
        this.x = a;
        this.y = b;
        deltaX = 0;
        deltaY = 0;
    }

    public void move(Mappa mappa) {
        // 1. Controllo Flag
        if (!flag) {
            return;
        }

        // 2. Ottieni dimensioni
        double squareHeight = mappa.getSquareHeight();
        double squareWidth = mappa.getSquareWidth();

        // 3. Calcola posizione futura in pixel
        double nextPixelX = this.x + deltaX;
        double nextPixelY = this.y + deltaY;

        // 4. Calcola casella futura in griglia (LA FORMULA CORRETTA)
        // Questa è la conversione standard da pixel a indice di array
        int nextGridX = (int) (nextPixelX / squareWidth);
        int nextGridY = (int) (nextPixelY / squareHeight);

        // 5. Gestione Tunnel
        if (warmAll(nextGridX, nextGridY, mappa)) {
            return; // Il teletrasporto è avvenuto
        }

        // 6. Gestione Fuori Limiti (specifica per Ghost)
        if (outOfRange(nextGridX, nextGridY)) {
            return;
        }

        // 7. Controllo Muro
        // La tua mappa usa (riga, colonna) -> (Y, X)
        if (mappa.isClear(nextGridY, nextGridX)) {
            // OK, muovi
            this.x = nextPixelX;
            this.y = nextPixelY;
            
            if (this instanceof Pacman) {
                // Nota: qui passiamo la casella in cui ci siamo APPENA SPOSTATI
                // (nextGridY, nextGridX)
                mappa.eatFood(nextGridY, nextGridX);
            }
            
        } else if (this instanceof Ghost) {
            // Muro e sei un Fantasma
            block = true; // Segnala al fantasma di cambiare direzione
        }
        // Se sei Pacman e c'è un muro, non fai nulla (non ti muovi)
    }

    /**
     * CORREZIONE 1: La firma deve accettare int.
     * Questo è il metodo "base" per Entita (non fa nulla).
     * Sarà sovrascritto da Ghost.
     */
    protected boolean outOfRange(int gridX, int gridY) {
        return false;
    }

    /**
     * CORREZIONE 2: La firma è cambiata per passare la mappa (per le coordinate di teletrasporto)
     * CORREZIONE 3: Il corpo del metodo ora usa i parametri gridX e gridY, NON Xi.
     */
    private boolean warmAll(int gridX, int gridY, Mappa mappa) {
        boolean ans = false;

        // Logica Semplificata: Se siamo sulla riga 14 E all'estrema sinistra o destra
        if (gridY == 14 && (gridX <= 0 || gridX >= 27)) {

            if (gridX >= 27) { // Se all'estrema destra
                // Teletrasporta all'inizio della mappa a sinistra
                this.x = 0; 
            } else { // Se all'estrema sinistra
                // Teletrasporta alla fine della mappa a destra
                this.x = mappa.getMapWidth() - mappa.getSquareWidth(); 
            }
            
            ans = true; // Teletrasporto avvenuto
        }
        return ans;
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