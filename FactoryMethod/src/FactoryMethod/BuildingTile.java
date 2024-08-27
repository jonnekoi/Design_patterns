package FactoryMethod;

public class BuildingTile implements Tile {
    public char getChar() {
        return 'B';
    }

    public String getType() {
        return "building";
    }
}
