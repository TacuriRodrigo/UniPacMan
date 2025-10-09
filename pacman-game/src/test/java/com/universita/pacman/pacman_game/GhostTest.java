package com.universita.pacman.pacman_game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class GhostTest {

    private Ghost ghost;
    private Pacman pacman;

    @BeforeEach
    void setUp() throws IOException {
        // Prepariamo un fantasma e un pacman per i test
        ghost = new Ghost(100, 100);
        pacman = new Pacman(0, 0);
    }

    @Test
    void ghostShouldCollideWithPacmanWhenVeryClose() {
        // PREPARA
        // Mettiamo Pacman e il Fantasma nella stessa posizione
        pacman.setPosition(100, 100);

        // ESEGUI E VERIFICA
        // Usiamo il metodo che riceve l'oggetto Pacman
        assertTrue(ghost.isCollidingWith(pacman), "Il fantasma dovrebbe collidere con Pacman se sono sovrapposti.");
    }

    @Test
    void ghostShouldNotCollideWithPacmanWhenFar() {
        // PREPARA
        // Lasciamo Pacman alle coordinate (0,0), molto lontano dal fantasma (100,100)
        pacman.setPosition(0, 0);

        // ESEGUI E VERIFICA
        assertFalse(ghost.isCollidingWith(pacman), "Il fantasma non dovrebbe collidere con Pacman se sono lontani.");
    }
}