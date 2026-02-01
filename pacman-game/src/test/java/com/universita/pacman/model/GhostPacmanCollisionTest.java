package com.universita.pacman.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.universita.pacman.model.Ghost;
import com.universita.pacman.model.Mappa;
import com.universita.pacman.model.Pacman;

import java.util.Random;

public class GhostPacmanCollisionTest {

    @Test
    void ghostCollidesWithPacmanWhenOverlapping() throws Exception {
        Mappa m = new Mappa();
        double tileW = m.getSquareWidth();
        double tileH = m.getSquareHeight();

        // cella libera (1,1)
        double cx = 1*tileW + tileW/2.0;
        double cy = 1*tileH + tileH/2.0;

        Pacman p = new Pacman(cx, cy);
        Ghost g = new Ghost(cx, cy, new Random(123));

        assertTrue(g.isCollidingWith(p, m), "Dovrebbe collidere quando sono nella stessa cella");
    }

    @Test
    void ghostDoesNotCollideWhenFar() throws Exception {
        Mappa m = new Mappa();
        double tileW = m.getSquareWidth();
        double tileH = m.getSquareHeight();

        Pacman p = new Pacman(1*tileW + tileW/2.0, 1*tileH + tileH/2.0);
        Ghost g = new Ghost(10*tileW + tileW/2.0, 10*tileH + tileH/2.0, new Random(123));

        assertFalse(g.isCollidingWith(p, m), "Non dovrebbe collidere se sono lontani");
    }
}
