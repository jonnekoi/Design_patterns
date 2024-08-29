public class ButtonA extends Button {
    private String text;

    ButtonA(String text) {
        this.text = text;
    }
    @Override
    void display () {
        System.out.println("\u001B[32m Button A " + text + "\u001B[0m");
    }

    @Override
    public void setText(String text2) {
        this.text = text2;
    }
}
