public class EncryptedPrinter implements Printer {
    private Printer wrappedPrinter;
    private static final int SHIFT = 3;

    public EncryptedPrinter(Printer wrappedPrinter) {
        this.wrappedPrinter = wrappedPrinter;
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        wrappedPrinter.print("Encrypted: " + encryptedMessage);
    }

    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + SHIFT));
        }
        return encrypted.toString();
    }
}
