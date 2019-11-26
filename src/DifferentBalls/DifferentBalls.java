package DifferentBalls;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

public class DifferentBalls  extends GraphicsApp {

    private static final int SCREEN_WIDTH = 500;
    private static final int SCREEN_HEIGHT = 500;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;

    Ball ball;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        ball = new Ball(50,50);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        ball.update();
        ball.draw();
    }
}
