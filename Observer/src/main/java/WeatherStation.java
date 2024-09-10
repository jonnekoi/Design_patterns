import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<WeatherObserver> observers;
    private int temperature;
    private final int maxTemp = 40;
    private final int minTemp = -10;
    private boolean running;

    public WeatherStation() {
        observers = new ArrayList<>();
        Random rand = new Random();
        temperature = rand.nextInt(15) + 1;
        running = true;
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    private void updateTemperature() {
        Random rand = new Random();
        int change = rand.nextInt(3) - 1;
        temperature += change;
        if (temperature > maxTemp) {
            temperature = maxTemp;
        }
        if (temperature < minTemp) {
            temperature = minTemp;
        }
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (running) {
            try {
                Thread.sleep(rand.nextInt(4000) + 1000);
                updateTemperature();
                notifyObservers();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
