import org.jgfx.JGFX;
import org.jgfx.GamePanel;

import java.awt.Graphics2D;
import java.awt.Color;

public class Main {

    // JGFX arguements
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 675;
    private static final String TITLE = "Hello, World!";

    public static void main(String[] args) {
        new JGFX(TITLE, WIDTH, HEIGHT,
                new Runnable() {
                    @Override
                    public void run() {
                        // GRAPHICS //
                        Graphics2D gtd = (Graphics2D) GamePanel.g;

                        gtd.setColor(Color.RED);
                        gtd.fillRect(2, 2, 50, 50);
                        gtd.setColor(Color.BLACK);
                        gtd.drawString("Hello World!", 100, 2);
                    }
                });
    }
}
