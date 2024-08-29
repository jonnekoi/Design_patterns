public class TextFieldA extends TextField {
    private String text;

    TextFieldA(String text) {
        this.text = text;
    }

    @Override
    void display () {
        System.out.println("\u001B[32m Textfield A " + text + "\u001B[0m");
    }
}
