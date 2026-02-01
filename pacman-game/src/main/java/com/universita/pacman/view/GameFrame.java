package com.universita.pacman.view;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private final CardLayout cards = new CardLayout();
    private final JPanel root = new JPanel(cards);

    public GameFrame() throws Exception {
        setTitle("UNIPACMAN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        final GamePanel gamePanel = new GamePanel();
        final HomePanel homePanel = new HomePanel(new Runnable() {
            @Override
            public void run() {
                cards.show(root, "GAME");
                gamePanel.requestFocusInWindow(); // fondamentale per frecce / keybindings
            }
        });

        root.add(homePanel, "HOME");
        root.add(gamePanel, "GAME");

        setContentPane(root);

        pack();
        setLocationRelativeTo(null);

        cards.show(root, "HOME"); // parte dalla home
    }
}
