public class Novice implements Character {
    private GameCharacter character;

    public Novice(GameCharacter character) {
        this.character = character;
    }
    @Override
    public void train() {
        character.addExperience(10);
    }
    @Override
    public void meditate() {
        System.out.println("Novice cannot meditate");
    }
    @Override
    public void fight() {
        System.out.println("Novice cannot fight");
    }
    @Override
    public void checkState() {
        if (character.experiencePoints >= 30) {
            character.setState(new Intermediate(character));
        }
    }
}
