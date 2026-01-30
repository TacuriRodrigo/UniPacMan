package com.universita.pacman.pacman_game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PacmanWallCollisionTest {

    @Test
    void pacmanDoesNotMoveIntoWall() throws Exception {
        Mappa m = new Mappa();

        double tileW = m.getSquareWidth();
        double tileH = m.getSquareHeight();

        Pacman p = new Pacman(1*tileW + tileW/2.0, 1*tileH + tileH/2.0);

        double x0 = p.getX();
        double y0 = p.getY();

        p.setSu();  // verso muro
        p.move(m);

        assertEquals(x0, p.getX(), 1e-9);
        assertEquals(y0, p.getY(), 1e-9);
    }
}
