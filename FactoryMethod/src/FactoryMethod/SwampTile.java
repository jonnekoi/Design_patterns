package FactoryMethod;

public class SwampTile implements Tile{
    @Override
    public char getChar() {
        return 'S';
    }

    @Override
    public String getType() {
        return "Swamp";
    }
}
