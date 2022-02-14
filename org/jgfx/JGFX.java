package org.jgfx;

import javax.swing.JFrame;

public class JGFX extends JFrame {

    private static final long serialVersionUID = -916592834123452L;
    private int w;
    private int h;
    GamePanel panel;
    Runnable run;

    public JGFX(String title, int width, int height, Runnable run) {
        super(title);
        getContentPane();
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.w = width;
        this.h = height;
        this.run = run;
        panel = new GamePanel(w, h, run);

        setupGFX();

        setVisible(true);
    }

    public void setupGFX() {
        panel.setSize(w, h);
        panel.setLocation(0, 0);
        panel.setVisible(true);
        this.add(panel);
    }
}