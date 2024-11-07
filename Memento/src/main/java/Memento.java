public class Memento implements IMemento {

    private String operationType;
    private int[] options;
    private boolean isSelected;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone();
        this.isSelected = isSelected;
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options.clone();
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Override
    public String getOperationType() {
        return operationType;
    }

    @Override
    public String toString() {
        return "State: " + " Operation: " + operationType;
    }
}