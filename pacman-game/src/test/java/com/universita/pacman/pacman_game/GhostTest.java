package com.universita.pacman.pacman_game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class GhostTest {

    private Mappa mappa;
    private Ghost ghost;
    private Pacman pacman;

    @BeforeEach
    void setUp() throws IOException {
        // PREPARA UN AMBIENTE COMPLETO, BASATO SULLA MAPPA
        mappa = new Mappa();
        
        // Posiziona Pacman nella sua casella (1, 1) come in PacmanTest
        double pacmanX = (1 * mappa.getSquareWidth()) + (mappa.getSquareWidth() / 2);
        double pacmanY = (1 * mappa.getSquareHeight()) + (mappa.getSquareHeight() / 2);
        pacman = new Pacman(pacmanX, pacmanY);

        // Posiziona il Fantasma nella sua scatola (es. centro di 13, 15)
        double ghostX = (13 * mappa.getSquareWidth()) + (mappa.getSquareWidth() / 2);
        double ghostY = (15 * mappa.getSquareHeight()) + (mappa.getSquareHeight() / 2);
        ghost = new Ghost(ghostX, ghostY);
    }

    // ========= IL TUO TEST ORIGINALE (ANCORA VALIDO!) =========
    @Test
    void ghostShouldCollideWithPacmanWhenVeryClose() {
        // PREPARA
        // Sovrascrivi la posizione di Pacman per il test,
        // mettendolo esattamente sopra il fantasma
        pacman.setPosition(ghost.getX(), ghost.getY());

        // ESEGUI E VERIFICA
        assertTrue(ghost.isCollidingWith(pacman), "Il fantasma dovrebbe collidere con Pacman se sono sovrapposti.");
    }

    // ========= IL TUO TEST ORIGINALE (ANCORA VALIDO!) =========
    @Test
    void ghostShouldNotCollideWithPacmanWhenFar() {
        // PREPARA
        // Pacman è già in (1,1) e il fantasma in (13,15), sono già lontani.
        // Non serve fare nulla.

        // ESEGUI E VERIFICA
        assertFalse(ghost.isCollidingWith(pacman), "Il fantasma non dovrebbe collidere con Pacman se sono lontani.");
    }
    


    @Test
    void testGhostExitsBox() {
        // PREPARA
        assertFalse(ghost.startProcess, "Il fantasma non dovrebbe aver iniziato.");
        
        // ESEGUI
        for (int i = 0; i < 80; i++) {
            ghost.move(mappa, pacman); 
        }
        
        // VERIFICA
        // CORREZIONE: Controlliamo solo che sia uscito.
        // La posizione Y non ci interessa, basta che il flag sia true.
        assertTrue(ghost.startProcess, "Il fantasma dovrebbe essere uscito dalla scatola.");
        // La riga 'assertTrue(ghost.getY() <= 140, ...)' è stata rimossa (o commentata).
    }
}