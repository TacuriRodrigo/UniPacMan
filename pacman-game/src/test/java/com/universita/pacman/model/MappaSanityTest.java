package com.universita.pacman.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.universita.pacman.model.Mappa;

public class MappaSanityTest {
    @Test
    void tileSizeAndDimensionsAreConsistent() throws Exception {
        Mappa m = new Mappa();
        assertTrue(m.getSquareWidth() > 0);
        assertTrue(m.getSquareHeight() > 0);
        assertTrue(m.getMapWidth() > 0);
        assertTrue(m.getMapHeight() > 0);

        // Con tileSize intero, width/height dovrebbero essere multipli del tile
        assertEquals(0, m.getMapWidth() % (int)m.getSquareWidth());
        assertEquals(0, m.getMapHeight() % (int)m.getSquareHeight());
    }
}
