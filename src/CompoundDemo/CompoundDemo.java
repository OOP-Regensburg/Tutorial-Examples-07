package CompoundDemo;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.graphics.Compound;
import de.ur.mi.oop.graphics.Rectangle;
import org.w3c.dom.css.Rect;


/**
 * Diese Anwendung demonstriert den Einsatz der Compound-Klasse zur einheitlichen Verwaltung
 * mehrerer Graphics-Objects. Die Anwendung stellt eine "Schlange", aufgebaut aus mehreren
 * Rechtecken, dar, die sich über den Bildschirm bewegt.
 */

public class CompoundDemo extends GraphicsApp {

    private static final int SCREEN_WIDTH = 500;
    private static final int SCREEN_HEIGHT = 500;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;
    /**
     * Anzahl und Größe der einzelnen Segmente der Schlange.
     */
    private static final int SEGMENT_COUNT = 10;
    private static final int SEGMENT_SIZE = 30;

    private Compound snake;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        initSnake();
    }

    private void initSnake() {
        // Erstellen des leeren Compounds an der Position 0,0
        snake = new Compound(0, 0);
        // Erstellen und Hinzufügen der einzelnen Segmente über eine Schleife
        for (int i = 0; i < SEGMENT_COUNT; i++) {
            float xPos = snake.getXPos() - (i * SEGMENT_SIZE);
            float yPos = snake.getYPos();
            Rectangle segment = getSegment(xPos, yPos);
            snake.add(segment);
        }
    }

    private Rectangle getSegment(float xPos, float yPos) {
        Color color = Colors.getRandomColor();
        Rectangle segment = new Rectangle(xPos, yPos, SEGMENT_SIZE, SEGMENT_SIZE, color);
        segment.setBorderWeight(0);
        return segment;
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        // Bewegen des Conmpounds (alle Rechtecke werden gleichzeitig bewegt)
        snake.move(1, 0);
        // Zeichnen des Compounds (alle Rechtecke werden gezeichnet)
        snake.draw();
    }
}
