package CompoundDemo;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Compound;
import de.ur.mi.oop.graphics.Rectangle;
import org.w3c.dom.css.Rect;

public class CompoundDemo extends GraphicsApp {

    private static final int SCREEN_WIDTH = 500;
    private static final int SCREEN_HEIGHT = 500;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;
    private static final int SEGMENT_COUNT = 10;
    private static final int SEGMENT_SIZE = 30;

    private Compound snake;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        initSnake();
    }

    private void initSnake() {
        snake = new Compound(SEGMENT_SIZE,SEGMENT_SIZE);
        for(int i = 0; i < SEGMENT_COUNT; i++) {
            float xPos = snake.getXPos() - (i*SEGMENT_SIZE);
            float yPos = snake.getYPos();
            Rectangle segment = getSegment(xPos, yPos);
            snake.add(segment);
        }
    }

    private Rectangle getSegment(float xPos, float yPos) {
        Color color = Colors.getRandomColor();
        Rectangle segment = new Rectangle(xPos, yPos, SEGMENT_SIZE, SEGMENT_SIZE, color);
        segment.setBorderWeight(0);
        return  segment;
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        snake.move(1,0);
        snake.draw();
    }
}
