package FactoryMethod;

public class RoadTile implements Tile {
    public char getChar() {
        return 'R';
    }

    public String getType() {
        return "road";
    }
}
