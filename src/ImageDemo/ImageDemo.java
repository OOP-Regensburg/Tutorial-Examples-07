package ImageDemo;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Image;


public class ImageDemo extends GraphicsApp {

    private static final int SCREEN_WIDTH = 500;
    private static final int SCREEN_HEIGHT = 500;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_WIDTH);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
    }
}
