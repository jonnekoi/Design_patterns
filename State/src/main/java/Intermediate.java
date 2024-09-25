public class Intermediate implements Character {
    private GameCharacter character;

    public Intermediate(GameCharacter character) {
        this.character = character;
    }
    @Override
    public void train() {
        character.addExperience(15);
    }
    @Override
    public void meditate() {
        character.increaseHealth(5);
    }
    @Override
    public void fight() {
        System.out.println("Intermediate cannot fight");
    }
    @Override
    public void checkState() {
        if (character.experiencePoints >= 60) {
            character.setState(new Expert(character));
        }
    }
}
