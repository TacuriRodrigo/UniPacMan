package com.universita.pacman.pacman_game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PacmanSpawnTest {
	
	

    @Test
    void pacmanSpawnIsClear() throws Exception {
        Mappa m = new Mappa();
        Pacman p = m.placePacman();

        int col = (int)(p.getX() / m.getSquareWidth());
        int row = (int)(p.getY() / m.getSquareHeight());
        
        System.out.println("tileW=" + m.getSquareWidth() + " tileH=" + m.getSquareHeight());
        System.out.println("spawnX=" + p.getX() + " spawnY=" + p.getY());
        System.out.println("spawnCol=" + (int)(p.getX()/m.getSquareWidth()) +
                           " spawnRow=" + (int)(p.getY()/m.getSquareHeight()));
        System.out.println("mapW=" + m.getMapWidth() + " mapH=" + m.getMapHeight());


        assertTrue(m.isClear(row, col), "Spawn in muro: row=" + row + " col=" + col +
                " tile=" + m.getTile(row, col));
    }
    @Test
    void pacmanDoesNotMoveWhenStopped() throws Exception {
        Mappa m = new Mappa();
        Pacman p = m.placePacman();

        double x0 = p.getX(), y0 = p.getY();
        p.stop();
        for (int i = 0; i < 10; i++) p.move(m);

        assertEquals(x0, p.getX(), 1e-9);
        assertEquals(y0, p.getY(), 1e-9);
    }

    
    
}
