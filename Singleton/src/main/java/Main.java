public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("logger.txt");
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation ended");
        logger.close();

    }
}
