package com.universita.pacman.view;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {

    public HomePanel(Runnable onStart) {
        setBackground(Color.BLACK);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createVerticalGlue());

        JLabel title = new JLabel("UNIPACMAN");
        title.setAlignmentX(CENTER_ALIGNMENT);
        title.setForeground(Color.YELLOW);
        title.setFont(new Font("Arial", Font.BOLD, 48));
        add(title);

        add(Box.createRigidArea(new Dimension(0, 40)));

        JButton startBtn = new JButton("START");
        startBtn.setAlignmentX(CENTER_ALIGNMENT);
        startBtn.setFont(new Font("Arial", Font.BOLD, 24));
        startBtn.setFocusPainted(false);
        startBtn.addActionListener(e -> onStart.run());
        add(startBtn);

        add(Box.createVerticalGlue());
    }
}
