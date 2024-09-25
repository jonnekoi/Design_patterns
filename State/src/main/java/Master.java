public class Master implements Character {
    private GameCharacter character;

    public Master(GameCharacter character) {
        this.character = character;
    }
    @Override
    public void train() {
        System.out.println("Master has reached the highest level and cannot train anymore");
    }
    @Override
    public void meditate() {
        System.out.println("Master has reached the highest level and cannot meditate anymore");
    }
    @Override
    public void fight() {
        System.out.println("Master has reached the highest level and cannot fight anymore");
    }
    @Override
    public void checkState() {
        System.out.println(character.getStatus());
    }
}
