import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private Printer wrappedPrinter;

    public FilePrinter(Printer wrappedPrinter) {
        this.wrappedPrinter = wrappedPrinter;
    }

    @Override
    public void print(String message) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        wrappedPrinter.print(message);
    }
}
