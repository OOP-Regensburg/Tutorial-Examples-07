package DifferentBalls;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

public class DifferentBalls  extends GraphicsApp {

    private static final int SCREEN_WIDTH = 500;
    private static final int SCREEN_HEIGHT = 500;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;

    Ball[] balls;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        initBalls();
    }

    // Initialisieren der drei unterschiedlichen Bälle als Elemente eines Arrays
    private void initBalls() {
        balls = new Ball[3];
        balls[0] = new Ball(50,50);
        // Die spezialisierten Subklassen BlinkingBall und StoppingBall können als
        // Instanzen der Oberklasse Ball angesprochen und z.B. in einem entsprechend
        // typisierten Array gespeichert werden. Ohne weitere Maßnahmen (Casting) können
        // die dort liegenden Objekte dann aber nur noch als Ball verwendet werden. Der
        // Funktionsumfang (öffentliche Methoden) reduziert sich auf die Methoden der
        // Elternklasse.
        balls[1] = new BlinkingBall(150,50);
        balls[2] = new StoppingBall(250,50, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        drawBalls();
    }

    // Zeichnen der drei unterschiedlichen Bälle
    private void drawBalls() {
        for(int i = 0; i < balls.length; i++) {
            balls[i].update();
            balls[i].draw();
        }
    }
}
