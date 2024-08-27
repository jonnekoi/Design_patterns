package FactoryMethod;

public class ForestTile implements Tile {
    public char getChar() {
        return 'F';
    }

    public String getType() {
        return "forest";
    }
}
