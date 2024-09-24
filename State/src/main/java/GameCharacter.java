public class GameCharacter {
    private String name;
    public int experiencePoints;
    public int healthPoints;
    private CharacterState currentState;

    public GameCharacter(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.healthPoints = 100;
        setState(new NoviceState(this));
    }
    public void setState(CharacterState state) {
        this.currentState = state;
    }
    public void train() {
        currentState.train();
    }
    public void meditate() {
        currentState.meditate();
    }
    public void fight() {
        currentState.fight();
    }
    public void updateState() {
        currentState.checkState();
    }
    public void addExperience(int points) {
        experiencePoints += points;
        System.out.println(name + " gained " + points + " experience points");
        updateState();
    }
    public void reduceHealth(int points) {
        healthPoints -= points;
        System.out.println(name + " lost " + points + " health points");
    }
    public void increaseHealth(int points) {
        healthPoints += points;
        System.out.println(name + " gained " + points + " health points");
    }
    public String getStatus() {
        return String.format("Name: %s, Level: %s, Experience Points: %d, Health Points: %d",
                name, currentState.getClass().getSimpleName(), experiencePoints, healthPoints);
    }
}
