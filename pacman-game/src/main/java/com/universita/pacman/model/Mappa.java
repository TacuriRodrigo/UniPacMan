package com.universita.pacman.model;

import java.io.IOException;

public class Mappa {
	final int W=1;	//Muro
	final int F=2;	//Cibo 
	final int E=3;	//Vuoto
	final int G=4;

	private final int rows;
	private final int cols;
	
	private final int tilesize;           //intero
	private final int mapHeight;
	private final int mapWidth;
    private final double squareHeight;
    private final double squareWidth;
    
    private final int[][] originalBoard;

	
	private int board[][] = {
			//-----------------------X-----------------------------//
			{W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,W,W,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,F,W},
			{W,F,F,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,F,F,W},
			{W,W,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,W,W},
			{E,E,E,E,E,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,F,F,F,F,F,F,F,F,F,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,W,W,W,E,E,W,W,W,F,W,W,F,W,E,E,E,E,E},
			{W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W},
			{F,F,F,F,F,F,F,F,F,F,W,E,E,E,E,E,E,W,F,F,F,F,F,F,F,F,F,F},
			{W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W},
			{E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,F,F,F,F,F,F,F,F,F,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E},
			{W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,W,W,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,F,F,W,W,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,W,W,F,F,F,W},
			{W,W,W,F,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,F,W,W,W},
			{W,W,W,F,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,F,W,W,W},
			{W,F,F,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,W,W,F,W},
			{W,F,W,W,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,W,W,F,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W}
	};
	
	public Mappa() {
		rows = board.length;
		cols = board[0].length;
		
		tilesize = 16; //!!!!!!!!!!!!scegli tra 16/20/24/32 in base alla grafica px
		mapHeight = board.length *tilesize;
		mapWidth = board[0].length *tilesize;
		squareHeight=tilesize;
		squareWidth=tilesize;
		
		board[12][13] = G;
		board[12][14] = G;
		
		originalBoard = new int[board.length][board[0].length];
		for (int r = 0; r < board.length; r++) {
		    System.arraycopy(board[r], 0, originalBoard[r], 0, board[r].length);
		}

		
	}
	public Pacman placePacman() {
	    int spawnRow = 23;
	    int spawnCol = 13;

	    return new Pacman(
	        spawnCol * squareWidth + squareWidth / 2.0,
	        spawnRow * squareHeight + squareHeight / 2.0
	    );
	}
	
	
	public void resetFood() {
	    for (int r = 0; r < board.length; r++) {
	        System.arraycopy(originalBoard[r], 0, board[r], 0, board[r].length);
	    }
	}
	 
	public int getMapWidth() {
		return mapWidth;
	}
	
	public double getSquareHeight(){
		return squareHeight;
	}
	
	public double getSquareWidth(){
		return squareWidth;
	}
	
	public int getMapHeight() {
		return mapHeight;
	}
	
	public String toString(){
		String s="";
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				s = s+","+board[i][j];
			}
			s=s+"\n";
		}
		return s;
	}
	
	public boolean isClear(int r,int c ) {
		//controllo delle coordinate se sono dentro i limiti dell'array
		if(r<0 || r>=rows || c<0 || c>=cols) {
			return false;
		}
		return board[r][c]!=W;
	}
	
	// Metodo per "mangiare" il cibo e restituire se era cibo
    public boolean eatFood(int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols) return false;
        if (board[r][c] == F) {
            board[r][c] = E;
            return true;
        }
        return false;
    }

	// Metodo di utilità per controllare cosa c'è in una casella
	public int getTile(int r, int c) {
	    if (r < 0 || r >= rows || c < 0 || c >= cols) {
	        return W; // Se fuori mappa, è un muro
	    }
	    return board[r][c];
	}
	
	public boolean isClearForPacman(int r, int c) {
	    if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
	    return board[r][c] != W && board[r][c] != G; // Pacman NON passa sul gate
	}

	public boolean isClearForGhost(int r, int c) {
	    if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
	    return board[r][c] != W; // Ghost passa su tutto tranne muro (quindi anche gate)
	}

	 
}
