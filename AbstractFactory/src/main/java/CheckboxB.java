public class CheckboxB extends Checkbox {
    private String text;

    CheckboxB(String text) {
        this.text = text;
    }
    @Override
    void display () {
        System.out.println("\u001B[35m checkbox B " + text + "\u001B[0m");
    }
    @Override
    public void setText(String text2) {
        this.text = text2;
    }
}
