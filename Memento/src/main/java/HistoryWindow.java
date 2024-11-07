// HistoryWindow.java
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HistoryWindow {
    private Controller controller;

    public HistoryWindow(Controller controller) {
        this.controller = controller;
    }

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("History");

        ListView<String> listView = new ListView<>();
        for (IMemento memento : controller.getHistory()) {
            listView.getItems().add(memento.toString());
        }

        listView.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                int index = listView.getSelectionModel().getSelectedIndex();
                if (index >= 0) {
                    controller.restoreFromHistory(index);
                    stage.close();
                }
            }
        });

        VBox vBox = new VBox(listView);
        Scene scene = new Scene(vBox, 300, 400);
        stage.setScene(scene);
        stage.show();
    }
}