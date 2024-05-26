import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Tile> tiles;

    public World(int width, int height) {
        tiles = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                tiles.add(new Tile(i * 20, j * 20));
            }
        }
    }

    public void render() {
        for (Tile tile : tiles) {
            tile.render();
        }
    }
}
