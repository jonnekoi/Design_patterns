import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history

    private List<IMemento> redoHistory; // + this line

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>(); // + this line
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        redoHistory.clear(); // + this line
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
        redoHistory.clear(); // + this line
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) { // Check if there are states to undo
            IMemento currentState = model.createMemento(); // Save the current state
            redoHistory.add(currentState); // Add the current state to redo history
            IMemento previousState = history.remove(history.size() - 1); // Get the last state from history
            model.restoreState(previousState); // Restore the previous state
            gui.updateGui(); // Update the GUI to reflect the restored state
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) { // Check if there are states to redo
            IMemento currentState = model.createMemento(); // Save the current state
            history.add(currentState); // Add the current state to history
            IMemento nextState = redoHistory.remove(redoHistory.size() - 1); // Get the last state from redo history
            model.restoreState(nextState); // Restore the next state
            gui.updateGui(); // Update the GUI to reflect the restored state
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }
}