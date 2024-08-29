public class Main {
    public static void main(String[] args) {
        UIFactory afactory = new AFactory();
        UIFactory bfactory = new BFactory();

        Button buttonA = afactory.createButton("a nappi");
        TextField textFieldA = afactory.createTextField("a textfield");
        Checkbox checkboxA = afactory.createCheckbox("checkfield A");

        Button buttonB = bfactory.createButton("B NAPPULA");
        TextField textFieldb = bfactory.createTextField("B textfield");
        Checkbox checkboxb = bfactory.createCheckbox("B checkbox");

        buttonA.display();
        buttonB.display();

        textFieldA.display();
        textFieldb.display();

        checkboxA.display();
        checkboxb.display();

        buttonA.setText("uusi Teksti!");
        buttonA.display();

    }
}