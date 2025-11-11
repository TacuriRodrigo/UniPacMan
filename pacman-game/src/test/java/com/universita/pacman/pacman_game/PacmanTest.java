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
        
        // POSIZIONA PACMAN AL CENTRO DELLA CASELLA (1, 1)
        double startX = (1 * mappa.getSquareWidth()) + (mappa.getSquareWidth() / 2);
        double startY = (1 * mappa.getSquareHeight()) + (mappa.getSquareHeight() / 2);
        
        pacman = new Pacman(startX, startY);
    }

    @Test
    void pacmanShouldMoveOnEmptySpace() {
        // PREPARA
        double initialX = pacman.getX();
        
        System.out.println("VALORE LARGHEZZA CASELLA: " + mappa.getSquareWidth());

        // ESEGUI
        pacman.setDx();
        pacman.move(mappa); // <-- Stiamo testando il metodo VERO!

        // VERIFICA
        assertTrue(pacman.getX() > initialX, "Pacman dovrebbe essersi mosso a destra.");
    }

 // Sostituisci il tuo vecchio test "pacmanShouldStopAtWall" con questo:
    @Test
    void pacmanShouldStopAtWall() throws IOException {
        // PREPARA
        // Pacman è già al centro della cella (1, 1) grazie a setUp()
        pacman.setSu(); // Imposta la direzione verso il muro in (0, 1)

        // ESEGUI
        // Chiama move() 10 volte di fila. 
        // Pacman si muoverà (y=19, y=18,...) fino a che non sbatte.
        for (int i = 0; i < 10; i++) {
            pacman.move(mappa);
        }

        // VERIFICA
        // Dopo 10 tentativi di movimento, la sua Y si sarà bloccata
        // al bordo della cella 1, senza mai entrare nella cella 0.
        
        // Calcoliamo la sua casella di griglia finale
        int finalGridY = (int) (pacman.getY() / mappa.getSquareHeight());

        // Dovrà essere ancora nella casella 1.
        assertEquals(1, finalGridY, "Pacman non dovrebbe aver attraversato il muro sopra di lui.");
    }

    @Test
    void testPacmanEatsFood() {
        // PREPARA
        // setup() ha già posizionato Pacman in (1, 1) (centro)
        // Controlliamo che la casella (1, 1) sia CIBO
        assertEquals(mappa.F, mappa.getTile(1, 1), "La casella (1,1) dovrebbe essere cibo prima del test.");

        // ESEGUI
        // Non dobbiamo muoverci, siamo già sulla casella (1,1)
        // Chiamiamo move() per far scattare la logica 'eatFood'
        // (anche se non ci muoviamo, la logica di 'eatFood' viene eseguita)
        pacman.move(mappa); 

        // VERIFICA
        // Dopo che Pacman ha eseguito 'move' su quella casella,
        // la casella (1, 1) dovrebbe essere VUOTA
        assertEquals(mappa.E, mappa.getTile(1, 1), "Pacman avrebbe dovuto mangiare il cibo in (1,1).");
    }

    @Test
    void testPacmanUsesTunnel() {
        // PREPARA
        // Posizioniamo Pacman sulla riga 14, all'estrema destra (casella 27)
        double startY = (14 * mappa.getSquareHeight()) + (mappa.getSquareHeight() / 2);
        double startX = (27 * mappa.getSquareWidth()) + (mappa.getSquareWidth() / 2);
        pacman.setPosition(startX, startY);
        
        // Diciamo a Pacman di andare a destra (verso l'uscita del tunnel)
        pacman.setDx();
        
        // ESEGUI
        // Chiamiamo move(). Il metodo warmAll() dovrebbe attivarsi.
        pacman.move(mappa);
        
        // VERIFICA
        // Il metodo warmAll() dovrebbe aver teletrasportato Pacman
        // all'estrema sinistra (es. x < 50)
        assertTrue(pacman.getX() < 50, "Pacman dovrebbe essere stato teletrasportato a sinistra.");
    }
}
