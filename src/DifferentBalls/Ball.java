package DifferentBalls;

import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;

public class Ball {

    private static final Color DEFAULT_BALL_COLOR = Colors.RED;
    private static final int DEFAULT_BALL_RADIUS = 15;
    private static final int DEFAULT_BALL_SPEED_X = 0;
    private static final int DEFAULT_BALL_SPEED_Y = 1;

    private Circle ball;
    private int currentSpeedX;
    private int currentSpeedY;

    public Ball(int xPos, int yPos) {
        ball = new Circle(xPos, yPos, DEFAULT_BALL_RADIUS, DEFAULT_BALL_COLOR);
        currentSpeedX = DEFAULT_BALL_SPEED_X;
        currentSpeedY = DEFAULT_BALL_SPEED_Y;
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        currentSpeedX = xSpeed;
        currentSpeedY = ySpeed;
    }

    public Circle getBall() {
        return ball;
    }

    public void update() {
        ball.move(currentSpeedX, currentSpeedY);
    }

    public void draw() {
        ball.draw();
    }
}
