import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    private static final Random random = new Random();
    public int xVelocity;
    public int yVelocity;
    private static final int INITIAL_SPEED = 2;

    public Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        setXDirection(INITIAL_SPEED);
        setYDirection(INITIAL_SPEED);
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }
}
