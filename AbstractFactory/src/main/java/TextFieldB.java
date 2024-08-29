
public class TextFieldB extends TextField {
    private String text;

    TextFieldB(String text) {
        this.text = text;
    }
    @Override
    void display () {
        System.out.println("\u001B[35m textfield B " + text + "\u001B[0m");
    }
}
