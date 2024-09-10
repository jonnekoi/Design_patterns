import java.io.FileWriter;

public class Logger {

    private static Logger instance = null;

    private String fileName;
    private FileWriter fileWriter;


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        try {
            if (fileWriter != null) {
                fileWriter.close();
            }
            this.fileName = fileName;
            fileWriter = new FileWriter(fileName, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void write(String message) {
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}