package com.universita.pacman.pacman_game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EatFoodTest {

    @Test
    void pacmanEatsFoodAndTileBecomesEmpty() throws Exception {
        Mappa m = new Mappa();
        int row = 1, col = 1;

        assertEquals(2, m.getTile(row, col), "Precondizione: atteso Food (2)");

        double tileW = m.getSquareWidth();
        double tileH = m.getSquareHeight();

        Pacman p = new Pacman(col*tileW + tileW/2.0, row*tileH + tileH/2.0);

        // move() di Entità chiama eatFood sulla cella in cui è (o in cui entra)
        p.move(m);

        assertEquals(3, m.getTile(row, col), "Dopo eat: atteso Empty (3)");
    }
    @Test
    void foodIsEatenOnlyOnce() throws Exception {
        Mappa m = new Mappa();
        int row = 1, col = 1;

        assertEquals(2, m.getTile(row, col));

        assertTrue(m.eatFood(row, col));
        assertEquals(3, m.getTile(row, col));

        assertFalse(m.eatFood(row, col));
        assertEquals(3, m.getTile(row, col));
    }

}
