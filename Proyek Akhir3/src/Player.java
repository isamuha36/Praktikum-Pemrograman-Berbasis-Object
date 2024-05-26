import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public class Player {
    private float x, y;

    public Player() {
        this.x = 400;
        this.y = 300;
    }

    public void update() {
        if (GLFW.glfwGetKey(Game.getWindow(), GLFW.GLFW_KEY_W) == GLFW.GLFW_PRESS) {
            y += 0.1f;
        }
        if (GLFW.glfwGetKey(Game.getWindow(), GLFW.GLFW_KEY_S) == GLFW.GLFW_PRESS) {
            y -= 0.1f;
        }
        if (GLFW.glfwGetKey(Game.getWindow(), GLFW.GLFW_KEY_A) == GLFW.GLFW_PRESS) {
            x -= 0.1f;
        }
        if (GLFW.glfwGetKey(Game.getWindow(), GLFW.GLFW_KEY_D) == GLFW.GLFW_PRESS) {
            x += 0.1f;
        }
    }

    public void render() {
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, 0);
        GL11.glColor3f(1.0f, 0.0f, 0.0f);
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2f(-10, -10);
        GL11.glVertex2f(10, -10);
        GL11.glVertex2f(10, 10);
        GL11.glVertex2f(-10, 10);
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
