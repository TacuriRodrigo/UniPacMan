package com.universita.pacman.view;

import com.universita.pacman.model.Mappa;
import com.universita.pacman.model.Ghost;

import java.util.ArrayList;
import java.util.List;


import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.*;
import com.universita.pacman.model.Pacman;

import javax.imageio.ImageIO;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.KeyEvent;


public class GamePanel extends JPanel {
	
	private final Pacman pacman;
	

	private final BufferedImage pacUp;
	private final BufferedImage pacDown;
	private final BufferedImage pacLeft;
	private final BufferedImage pacRight;
	
	private final BufferedImage pointImg;
	
	private final BufferedImage heartImg;
	
	private long invincibleUntilMs = 0;
	private boolean gameOver = false;


	
	private final List<Ghost> ghosts = new ArrayList<Ghost>();

	private final BufferedImage ghostBlue;
	private final BufferedImage ghostPink;
	private final BufferedImage ghostOrange;
	private final BufferedImage ghostRed;

	private final double pacSpawnX;
	private final double pacSpawnY;

	private final double[] ghostSpawnX;
	private final double[] ghostSpawnY;
	
	private int highScore = 0;



	private Direction pacDir = Direction.RIGHT;

	private enum Direction { UP, DOWN, LEFT, RIGHT }


    private final Mappa mappa;

    public GamePanel() throws Exception {
        this.mappa = new Mappa();
        setPreferredSize(new Dimension(mappa.getMapWidth(), mappa.getMapHeight()));
        setFocusable(true);
        
        this.pacman = mappa.placePacman();

        pacUp = load("/images/PacmanUp.png");
        pacDown = load("/images/PacmanDown.png");
        pacLeft = load("/images/PacmanLeft.png");
        pacRight = load("/images/PacmanRight.png");
        
        pacSpawnX = pacman.getX();
        pacSpawnY = pacman.getY();

        
        pointImg = load("/images/NormalPoint.png");

        heartImg = load("/images/Heart.png");
        
        ghostBlue = load("/images/BlueRight.png");
        ghostPink = load("/images/PinkRight.png");
        ghostOrange = load("/images/OrangeRight.png");
        ghostRed = load("/images/RedLeft.png");

        // spawn nella ghost house (riga ~14, colonne 13-14 sono centrali)
        double tileW = mappa.getSquareWidth();
        double tileH = mappa.getSquareHeight();

        ghosts.add(new Ghost(13*tileW + tileW/2.0, 14*tileH + tileH/2.0));
        ghosts.add(new Ghost(14*tileW + tileW/2.0, 14*tileH + tileH/2.0));
        ghosts.add(new Ghost(13*tileW + tileW/2.0, 15*tileH + tileH/2.0));
        ghosts.add(new Ghost(14*tileW + tileW/2.0, 15*tileH + tileH/2.0));
        
        
        ghostSpawnX = new double[ghosts.size()];
        ghostSpawnY = new double[ghosts.size()];
        for (int i = 0; i < ghosts.size(); i++) {
            ghostSpawnX[i] = ghosts.get(i).getX();
            ghostSpawnY[i] = ghosts.get(i).getY();
        }



        setupKeyBindings();

        // loop ~60 FPS
        Timer timer = new Timer(16, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {if (!gameOver) {
                pacman.move(mappa);

                for (Ghost g : ghosts) {
                    g.move(mappa, pacman);
                }
                // aggiorna high score
                if (pacman.getScore() > highScore) {
                    highScore = pacman.getScore();
                }

                long now = System.currentTimeMillis();
                if (now >= invincibleUntilMs) {
                    for (Ghost g : ghosts) {
                        if (g.isCollidingWith(pacman, mappa)) {
                            pacman.loseLife();

                            if (pacman.getLives() <= 0) {
                                gameOver = true;
                            } else {
                                resetRound();
                                invincibleUntilMs = now + 800; // 0.8s invincibilità
                            }
                            break;
                        }
                    }
                }
            }
            repaint();

                
            }
        });
        timer.start();
    }
    
    
    private void resetRound() {
        pacman.setPosition(pacSpawnX, pacSpawnY);
        pacman.stop();

        for (int i = 0; i < ghosts.size(); i++) {
            Ghost g = ghosts.get(i);
            g.setPosition(ghostSpawnX[i], ghostSpawnY[i]);
            g.startProcess = false;   // rientra nella logica uscita
            g.block = false;
            // opzionale: azzera delta se vuoi
            // g.deltaX = 0; g.deltaY = 0;  (se sono accessibili)
        }
    }

    
    
    
    private void drawPacman(Graphics2D g2) {
    	
    	BufferedImage sprite;
    	switch (pacDir) {
    	    case UP:
    	        sprite = pacUp;
    	        break;
    	    case DOWN:
    	        sprite = pacDown;
    	        break;
    	    case LEFT:
    	        sprite = pacLeft;
    	        break;
    	    case RIGHT:
    	    default:
    	        sprite = pacRight;
    	        break;
    	}



        int tileW = (int) mappa.getSquareWidth();
        int tileH = (int) mappa.getSquareHeight();

        // x,y sono il centro
        int drawX = (int) Math.round(pacman.getX() - tileW / 2.0);
        int drawY = (int) Math.round(pacman.getY() - tileH / 2.0);

        g2.drawImage(sprite, drawX, drawY, tileW, tileH, null);
    }
    
    
    
    
    private void drawGhosts(Graphics2D g2) {
        int tileW = (int) mappa.getSquareWidth();
        int tileH = (int) mappa.getSquareHeight();

        for (int i = 0; i < ghosts.size(); i++) {
            Ghost g = ghosts.get(i);

            BufferedImage sprite;
            switch (i) {
                case 0: sprite = ghostRed; break;
                case 1: sprite = ghostPink; break;
                case 2: sprite = ghostBlue; break;
                case 3: sprite = ghostOrange; break;
                default: sprite = ghostRed; break;
            }

            int drawX = (int) Math.round(g.getX() - tileW / 2.0);
            int drawY = (int) Math.round(g.getY() - tileH / 2.0);

            g2.drawImage(sprite, drawX, drawY, tileW, tileH, null);
        }
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // sfondo
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());

        drawMap(g2);
        drawHUD(g2);

        
        drawPacman(g2);
        drawGhosts(g2);

    }
    
    private void drawHUD(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Arial", Font.BOLD, 18));

        // SCORE (sinistra)
        g2.drawString("SCORE: " + pacman.getScore(), 12, 22);

        // HIGH SCORE (destra)
        String hs = "HIGH SCORE: " + highScore;
        FontMetrics fmHS = g2.getFontMetrics();
        int xHS = getWidth() - fmHS.stringWidth(hs) - 12;
        g2.drawString(hs, xHS, 22);

        // Vite come cuori
        int lives = pacman.getLives();
        int size = 18;
        int startX = 12;
        int y = 28;

        for (int i = 0; i < lives; i++) {
            g2.drawImage(heartImg, startX + i * (size + 6), y, size, size, null);
        }

        // GAME OVER
        if (gameOver) {
            g2.setFont(new Font("Arial", Font.BOLD, 42));
            String msg = "GAME OVER";
            FontMetrics fm = g2.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(msg)) / 2;
            int yy = getHeight() / 2;
            g2.drawString(msg, x, yy);

            g2.setFont(new Font("Arial", Font.PLAIN, 18));
            String sub = "Premi R per riavviare";
            FontMetrics fm2 = g2.getFontMetrics();
            int x2 = (getWidth() - fm2.stringWidth(sub)) / 2;
            g2.drawString(sub, x2, yy + 30);

            // HIGH SCORE sotto al game over (opzionale ma carino)
            String hs2 = "HIGH SCORE: " + highScore;
            FontMetrics fm3 = g2.getFontMetrics();
            int x3 = (getWidth() - fm3.stringWidth(hs2)) / 2;
            g2.drawString(hs2, x3, yy + 55);
        }
    }


    
    

    private void drawMap(Graphics2D g2) {
        int rows = 31;
        int cols = 28;

        int tileW = (int) mappa.getSquareWidth();
        int tileH = (int) mappa.getSquareHeight();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int tile = mappa.getTile(r, c);
                int px = c * tileW;
                int py = r * tileH;

                if (tile == 1) { // muro
                    g2.setColor(new Color(0, 0, 180));
                    g2.fillRect(px, py, tileW, tileH);
                } else if (tile == 2) { // cibo
                    int s = Math.max(4, tileW / 3);
                    int ox = px + (tileW - s) / 2;
                    int oy = py + (tileH - s) / 2;
                    g2.drawImage(pointImg, ox, oy, s, s, null);
                } else if (tile == 4) { // GATE
                    g2.setColor(Color.WHITE);
                    g2.fillRect(px, py + tileH/2 - 2, tileW, 4); // linea orizzontale tipo "porta"
                }

            }
        }
    }
    
    
    private BufferedImage load(String path) throws IOException {
        java.io.InputStream is = getClass().getResourceAsStream(path);
        if (is == null) throw new IOException("Risorsa non trovata: " + path);
        try {
            return ImageIO.read(is);
        } finally {
            try { is.close(); } catch (IOException ignored) {}
        }
    }
    
    private void restartGame() {
        // reset stato
        gameOver = false;
        invincibleUntilMs = 0;

        // reset pacman
        pacman.resetLives();
        pacman.resetScore();   // vediamo sotto
        pacman.setPosition(pacSpawnX, pacSpawnY);
        pacman.stop();

        // reset ghost
        for (int i = 0; i < ghosts.size(); i++) {
            Ghost g = ghosts.get(i);
            g.setPosition(ghostSpawnX[i], ghostSpawnY[i]);
            g.startProcess = false;
            g.block = false;
        }

        // reset mappa (pallini)
        mappa.resetFood();
    }


    
    
    private void setupKeyBindings() {
        InputMap im = getInputMap(WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = getActionMap();

        im.put(KeyStroke.getKeyStroke("UP"), "up");
        im.put(KeyStroke.getKeyStroke("DOWN"), "down");
        im.put(KeyStroke.getKeyStroke("LEFT"), "left");
        im.put(KeyStroke.getKeyStroke("RIGHT"), "right");
        im.put(KeyStroke.getKeyStroke("SPACE"), "stop");
        
        im.put(KeyStroke.getKeyStroke('R'), "restart");
        im.put(KeyStroke.getKeyStroke("pressed r"), "restart");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "restart");



        am.put("up", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {
                pacman.setSu();
                pacDir = Direction.UP;
            }
        });
        am.put("down", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {
                pacman.setGiù();
                pacDir = Direction.DOWN;
            }
        });
        am.put("left", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {
                pacman.setSx();
                pacDir = Direction.LEFT;
            }
        });
        am.put("right", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {
                pacman.setDx();
                pacDir = Direction.RIGHT;
            }
        });
        am.put("stop", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {
                pacman.stop();
            }
        });
        
        am.put("restart", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameOver) {
                    restartGame();
                    repaint();
                }
            }
        });
        
        

    }


}
