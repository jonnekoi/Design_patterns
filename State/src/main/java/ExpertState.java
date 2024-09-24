public class ExpertState implements CharacterState {
    private GameCharacter character;

    public ExpertState(GameCharacter character) {
        this.character = character;
    }
    @Override
    public void train() {
        character.addExperience(20);
    }
    @Override
    public void meditate() {
        character.increaseHealth(10);
    }
    @Override
    public void fight() {
        character.reduceHealth(10);
        character.addExperience(30);
    }
    @Override
    public void checkState() {
        if (character.experiencePoints >= 100) {
            character.setState(new MasterState(character));
        }
    }
}
