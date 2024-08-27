package FactoryMethod;

import java.util.Random;

public class CityMap extends Map {

    static Random random = new Random();
    static String[] tiles = {"road", "building", "forest"};

    @Override
    public Tile createTile() {
        int num = random.nextInt(tiles.length);
        return switch (tiles[num]) {
            case "road" -> new RoadTile();
            case "building" -> new BuildingTile();
            case "forest" -> new ForestTile();
            default -> throw new IllegalStateException("Unexpected value");
        };
    }
}