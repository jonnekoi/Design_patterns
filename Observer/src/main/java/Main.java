public class Main {
    public static void main(String[] args) throws InterruptedException {

        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver observer1 = new WeatherObserver("Observer 1");
        WeatherObserver observer2 = new WeatherObserver("Observer 2");
        WeatherObserver observer3 = new WeatherObserver("Observer 3");


        weatherStation.registerObserver(observer1);
        weatherStation.registerObserver(observer2);
        weatherStation.registerObserver(observer3);

        Thread weatherStationThread = new Thread(weatherStation);
        weatherStationThread.start();

        Thread.sleep(100);
    }
}
