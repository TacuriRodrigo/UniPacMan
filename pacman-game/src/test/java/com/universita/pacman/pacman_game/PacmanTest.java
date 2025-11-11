package com.universita.pacman.pacman_game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class PacmanTest {

    private Mappa mappa;
    private Pacman pacman;

    @BeforeEach
    void setUp() throws IOException {
        mappa = new Mappa();
        // Posizioniamo Pacman in un punto di partenza noto (es: riga 1, colonna 1)
        // (Usa getSquareWidth() e non getsquareWidth() se hai corretto lo stile)
        double startX = 1.5 * mappa.getSquareWidth();
        double startY = 1.5 * mappa.getSquareHeight();
        pacman = new Pacman(startX, startY);
    }

    @Test
    void pacmanShouldMoveOnEmptySpace() {
        // PREPARA
        double initialX = pacman.getX();

        // ESEGUI
        pacman.setDx();
        pacman.move(mappa); // <-- Stiamo testando il metodo VERO!

        // VERIFICA
        assertTrue(pacman.getX() > initialX, "Pacman dovrebbe essersi mosso a destra.");
    }

    @Test
    void pacmanShouldStopAtWall() throws IOException {
        // PREPARA
        Mappa mappa = new Mappa();
        // C'è un muro in (2,2). Mettiamo Pacman in (1,2), subito sopra il muro.
        pacman.setPosition(1.5 * mappa.getSquareWidth(), 2.5 * mappa.getSquareHeight());
        
        double initialY = pacman.getY(); // Salva la posizione iniziale

        // ESEGUI
        pacman.setSu(); // Imposta la direzione verso il muro (in questo caso Y=2)
        pacman.move(mappa);         // Tenta di muoversi

        // VERIFICA
        assertEquals(initialY, pacman.getY(), "Pacman non dovrebbe superare un muro sopra di lui.");
    }
}
