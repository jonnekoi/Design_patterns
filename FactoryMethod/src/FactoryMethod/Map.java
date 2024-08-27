package FactoryMethod;

public abstract class Map {
    protected Tile[][] tiles;
    int height = 20;
    int width = 20;

    public Map() {
        tiles = new Tile[height][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    Tile createTile() {
        return null;
    }

    void display() {
        for (Tile[] tile : tiles) {
            for (Tile value : tile) {
                System.out.print(value.getChar() + " ");
            }
            System.out.println();
        }
    }
}

