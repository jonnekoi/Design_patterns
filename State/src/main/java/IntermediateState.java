public class IntermediateState implements CharacterState {
    private GameCharacter character;

    public IntermediateState(GameCharacter character) {
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
            character.setState(new ExpertState(character));
        }
    }
}
