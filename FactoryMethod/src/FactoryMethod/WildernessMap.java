package FactoryMethod;

import java.util.Random;

public class WildernessMap extends Map {

    static Random random = new Random();
    static String[] tiles = {"swamp", "water", "forest"};

    @Override
    public Tile createTile() {
        int num = random.nextInt(tiles.length);
        return switch (tiles[num]) {
            case "swamp" -> new SwampTile();
            case "water" -> new WaterTile();
            case "forest" -> new ForestTile();
            default -> throw new IllegalStateException("Unexpected value" );
        };
    }
}