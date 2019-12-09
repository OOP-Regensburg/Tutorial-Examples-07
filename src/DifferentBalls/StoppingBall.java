package DifferentBalls;

/**
 * Spezialisierte Variante des Balls, deren Bewegung bei Erreichen des unteren Bildschirmrandes stoppt.
 */


public class StoppingBall extends Ball {

    // Instanzvariable um den "fallenden"-Zustand abzubilden
    private boolean isFalling;
    private int screenHeight;

    public StoppingBall(int xPos, int yPos, int screenHeight) {
        super(xPos, yPos);
        isFalling = true;
        this.screenHeight = screenHeight;
    }

    @Override
    public void update() {
        // Wenn der Ball sich im fallenden Zustand befindet ..
        if(isFalling == true) {
            // ... wird die geerbte Update-Methode (Positionsveränderung) ausgeführt ...
            super.update();
            // ... und die aktuelle Distanz zum Boden berechnet ...
            int distanceToBottom = (int) (screenHeight - getBall().getYPos());
            // ... wenn der Boden erreicht wurde, wird dies über die Veränderung der Instanzvariable gespeichert
            if(distanceToBottom <= getBall().getRadius()) {
                isFalling = false;
            }
        }
    }
}
