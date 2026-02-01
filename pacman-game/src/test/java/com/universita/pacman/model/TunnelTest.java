package com.universita.pacman.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.universita.pacman.model.Mappa;
import com.universita.pacman.model.Pacman;

public class TunnelTest {

	@Test
	void pacmanWrapsAtLeastOnce() throws Exception {
	    Mappa m = new Mappa();
	    double tileW = m.getSquareWidth();
	    double tileH = m.getSquareHeight();
	    double half = tileW / 2.0;

	    Pacman p = new Pacman(half, 14*tileH + tileH/2.0);
	    p.setSx();

	    double maxX = p.getX();
	    for (int i = 0; i < 50; i++) {
	        p.move(m);
	        maxX = Math.max(maxX, p.getX());
	    }

	    assertTrue(maxX > m.getMapWidth() - tileW,
	            "Non è mai stato vicino al bordo destro: maxX=" + maxX + " finalX=" + p.getX());
	}
	@Test
	void pacmanWrapsFromRightToLeftOnTunnelRow() throws Exception {
	    Mappa m = new Mappa();
	    double tileW = m.getSquareWidth();
	    double tileH = m.getSquareHeight();
	    double half = tileW / 2.0;

	    Pacman p = new Pacman(m.getMapWidth() - half, 14*tileH + tileH/2.0);
	    p.setDx();

	    double minX = p.getX();
	    for (int i = 0; i < 50; i++) {
	        p.move(m);
	        minX = Math.min(minX, p.getX());
	    }

	    assertTrue(minX < tileW, "Non è mai stato vicino al bordo sinistro: minX=" + minX + " finalX=" + p.getX());
	}


}
