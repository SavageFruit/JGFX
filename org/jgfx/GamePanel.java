package org.jgfx;

import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Graphics;

public class GamePanel extends JPanel {

    private Timer gameLoop;
    Runnable run;
    public static Graphics g;

    public GamePanel(int w, int h, Runnable run) {
        setLocation(0, 0);
        setLayout(null);
        setSize(w, h);
        this.run = run;

        gameLoop = new Timer();
        gameLoop.schedule(new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        }, 0, 1);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        GamePanel.g = g;

        run.run();
    }
}
