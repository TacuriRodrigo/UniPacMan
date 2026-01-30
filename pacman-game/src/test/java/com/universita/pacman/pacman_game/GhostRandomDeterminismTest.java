package com.universita.pacman.pacman_game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class GhostRandomDeterminismTest {

    @Test
    void randomMoveIsDeterministicWithSeed() throws Exception {
        Ghost g1 = new Ghost(0, 0, new Random(123));
        Ghost g2 = new Ghost(0, 0, new Random(123));

        // simula "sono già uscito" e "sono bloccato", così randomMove sceglie una direzione
        g1.startProcess = true;
        g2.startProcess = true;
        g1.block = true;
        g2.block = true;

        g1.randomMove();
        g2.randomMove();

        assertEquals(g1.deltaX, g2.deltaX, 1e-9);
        assertEquals(g1.deltaY, g2.deltaY, 1e-9);
    }
}
