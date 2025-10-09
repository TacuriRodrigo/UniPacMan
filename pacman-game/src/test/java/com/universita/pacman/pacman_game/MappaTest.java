package com.universita.pacman.pacman_game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class MappaTest {

    private Mappa mappa;

    @BeforeEach // Questo metodo viene eseguito PRIMA di ogni test
    void setUp() throws IOException {
        mappa = new Mappa();
    }

    @Test
    void isClearShouldReturnFalseForWall() {
        // I muri si trovano alla riga 0, colonna 0
        assertFalse(mappa.isClear(0, 0), "La casella (0,0) dovrebbe essere un muro.");
    }

    @Test
    void isClearShouldReturnTrueForFood() {
        // Il cibo si trova alla riga 1, colonna 1
        assertTrue(mappa.isClear(1, 1), "La casella (1,1) dovrebbe essere libera (cibo).");
    }

    @Test
    void mapDimensionsShouldBeCalculatedCorrectly() {
        // Larghezza: 429px / 28 colonne = 15.32...
        // Altezza: 416px / 31 righe = 13.41...
        assertTrue(mappa.getsquareWidth() > 15, "La larghezza di una casella non è corretta.");
        assertTrue(mappa.getsquareHeight() > 13, "L'altezza di una casella non è corretta.");
    }
}