package com.universita.pacman.pacman_game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class PacmanTest {
	/*Test pcman senza mappa*/
	@Test
	void testMoveUp() {
	    Pacman pacman = new Pacman(5, 5);
	    pacman.setSu();          // imposta direzione
	    pacman.updatePos(); // esegue movimento
	    assertEquals(5, pacman.getXInd());
	    assertEquals(4, pacman.getYInd());
	}
	
	void testMoveRight() {
		Pacman pacman = new Pacman(5,5);
		pacman.setDx();
		pacman.updatePos();
		assertEquals(5,pacman.getXInd());
		assertEquals(4,pacman.getXInd());
		
	}
}
