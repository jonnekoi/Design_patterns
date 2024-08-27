package FactoryMethod;

public class Game {
    public static Map createMap(String type) {
        return switch (type) {
            case "wilderness" -> new WildernessMap();
            case "city" -> new CityMap();
            default -> throw new IllegalArgumentException("Unknown");
        };
    }

    public static void main(String[] args) {
        Map map = createMap("city");
        map.display();
    }
}