package com.universita.pacman;

import javax.swing.SwingUtilities;
import com.universita.pacman.view.GameFrame;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new GameFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
