package FactoryMethod;

public class WaterTile implements Tile {
    public char getChar() {
        return 'W';
    }

    public String getType() {
        return "water";
    }
}
