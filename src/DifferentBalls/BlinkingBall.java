package DifferentBalls;

import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

/**
 * Spezialisierte Variante des Balls, die bei Bewegung die Farbe ändert.
 */

public class BlinkingBall extends Ball {

    public BlinkingBall(int xPos, int yPos) {
        super(xPos, yPos);
    }

    public void update() {
        super.update();
        Color color = Colors.getRandomColor();
        getBall().setColor(color);
    }
}
