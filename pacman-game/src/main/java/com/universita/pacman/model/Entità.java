package com.universita.pacman.model;

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
        if (!flag) return;

        double tileH = mappa.getSquareHeight();
        double tileW = mappa.getSquareWidth();

        // Assunzione: x,y sono il CENTRO dell'entità.
        // Hitbox leggermente più piccola del tile per evitare incastri grafici.
        double halfW = tileW * 0.34;
        double halfH = tileH * 0.34;
        
     // --- Tunnel wrap (asse X) prima delle collisioni ---
        int rowNow = (int) Math.floor(y / tileH);
        double halfTile = tileW / 2.0;

        // Se siamo sulla riga del tunnel
        if (rowNow == 14 && deltaX !=0) {
            double nextX = x + deltaX;

            // Se oltrepassi a sinistra -> vai a destra
            if (nextX - halfW <0 ) {
                x = mappa.getMapWidth() - halfTile;
                return;
            }

            // Se oltrepassi a destra -> vai a sinistra
            if (nextX + halfW > mappa.getMapWidth() ) {
                x = halfTile;
                return;
            }
        }


        // ---- 1) Prova movimento su X ----
        double nextX = x + deltaX;
        if (!collidesWithWall(nextX, y, halfW, halfH, mappa, tileW, tileH)) {
            x = nextX;
        } else if (this instanceof Ghost) {
            block = true;
        }

        // ---- 2) Prova movimento su Y ----
        double nextY = y + deltaY;
        if (!collidesWithWall(x, nextY, halfW, halfH, mappa, tileW, tileH)) {
            y = nextY;
        } else if (this instanceof Ghost) {
            block = true;
        }



        /*if (warmAll(gridX, gridY, mappa)) return;*/

        // Eat food: usa la cella del centro (ok)
        if (this instanceof Pacman) {
            int pacCol = (int) Math.floor(x / tileW);
            int pacRow = (int) Math.floor(y / tileH);

            boolean ate = mappa.eatFood(pacRow, pacCol);
            if (ate) {
                ((Pacman) this).addScore(10);
            }
        }

    }

    private boolean isClearForThisEntity(Mappa mappa, int row, int col) {
        if (this instanceof Pacman) {
            return mappa.isClearForPacman(row, col);
        } else if (this instanceof Ghost) {
            return mappa.isClearForGhost(row, col);
        } else {
            return mappa.isClear(row, col); // fallback
        }
    }

    
    private boolean collidesWithWall(
            double cx, double cy,
            double halfW, double halfH,
            Mappa mappa,
            double tileW, double tileH
    ) {
        // 4 angoli della hitbox
        double left = cx - halfW;
        double right = cx + halfW;
        double top = cy - halfH;
        double bottom = cy + halfH;

        int leftCol   = (int) Math.floor(left / tileW);
        int rightCol  = (int) Math.floor(right / tileW);
        int topRow    = (int) Math.floor(top / tileH);
        int bottomRow = (int) Math.floor(bottom / tileH);


        // Se qualunque cella toccata è muro -> collisione
        // isClear(row, col) => true se non muro
        if (!isClearForThisEntity(mappa, topRow, leftCol)) return true;
        if (!isClearForThisEntity(mappa, topRow, rightCol)) return true;
        if (!isClearForThisEntity(mappa, bottomRow, leftCol)) return true;
        if (!isClearForThisEntity(mappa, bottomRow, rightCol)) return true;
        return false;
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
    
    /*
    private boolean warmAll(int gridX, int gridY, Mappa mappa) {
        // Se siamo sulla riga 14 e usciamo a sinistra/destra
        if (gridY == 14 && (gridX <= 0 || gridX >= 27)) {

            double halfTile = mappa.getSquareWidth() / 2.0;

            if (gridX >= 27) { 
                // Uscito a DESTRA -> rientra a SINISTRA
                this.x = halfTile;
            } else { 
                // Uscito a SINISTRA -> rientra a DESTRA
                this.x = mappa.getMapWidth() - halfTile;
            }

            return true;
        }
        return false;
    }
    */


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