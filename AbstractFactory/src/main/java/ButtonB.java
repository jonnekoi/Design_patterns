public class ButtonB extends Button {
    private String text;

    ButtonB(String text) {
        this.text = text;
    }
    @Override
    void display () {
        System.out.println("\u001B[35m Button B " + text + "\u001B[0m");
    }
    @Override
    public void setText(String text2) {
        this.text = text2;
    }
}
