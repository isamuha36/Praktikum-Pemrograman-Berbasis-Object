import org.lwjgl.opengl.GL11;

public class Tile {
    private float x, y;

    public Tile(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void render() {
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, 0);
        GL11.glColor3f(0.5f, 0.5f, 0.5f);
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2f(0, 0);
        GL11.glVertex2f(20, 0);
        GL11.glVertex2f(20, 20);
        GL11.glVertex2f(0, 20);
        GL11.glEnd();
        GL11.glPopMatrix();
    }
}
