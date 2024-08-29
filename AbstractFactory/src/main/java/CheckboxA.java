public class CheckboxA extends Checkbox {

    private String text;

    CheckboxA(String text) {
        this.text = text;
    }
    @Override
    void display () {
        System.out.println("\u001B[32m CheckBox A " + text + "\u001B[0m");
    }
    @Override
    public void setText(String text2) {
        this.text = text2;
    }
}
