package com.universita.pacman.pacman_game;

public class Mappa {
	final int W=1;//muro
	final int F=2;//cibo 
	final int E=3;//vuoto
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
			{E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E},
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
	
	
}
