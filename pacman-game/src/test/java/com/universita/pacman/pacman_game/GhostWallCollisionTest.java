package com.universita.pacman.pacman_game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GhostWallCollisionTest {

    static class GhostNoAI extends Ghost {
        public GhostNoAI(double x, double y) {
            super(x, y, new java.util.Random(123));
        }
        @Override
        public void move(Mappa mappa) {
            // NON chiamare randomMove
            super.move(mappa); // <-- attenzione: questo richiamerebbe Ghost.move
        }
    }
    
    @Test
    void ghostDoesNotMoveIntoWall() throws Exception {
        Mappa m = new Mappa();
        double tileW = m.getSquareWidth();
        double tileH = m.getSquareHeight();

        Ghost g = new Ghost(1*tileW + tileW/2.0, 1*tileH + tileH/2.0, new java.util.Random(123));

        g.deltaX = 0;
        g.deltaY = -tileH; // tenta di entrare nella riga 0 (muro)

        double x0 = g.getX();
        double y0 = g.getY();

        g.moveWithoutAI(m);

        assertEquals(x0, g.getX(), 1e-9);
        assertEquals(y0, g.getY(), 1e-9);
    }

}
