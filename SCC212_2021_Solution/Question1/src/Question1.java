import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        int x = 50;
        int y = 100;

        WeatherSystemFactory weatherSystemFactory = new WeatherSystemFactory();

        WeatherSystem satelite = weatherSystemFactory.createWeatherSystem("Satelite");
        WeatherSystem weatherOutpost =  weatherSystemFactory.createWeatherSystem("Official Weather Outpost");
        WeatherSystem weatherStation = weatherSystemFactory.createWeatherSystem("Weather Station");

        ArrayList <WeatherSystem> weatherSystemList = new ArrayList <WeatherSystem>();
        weatherSystemList.add(satelite);
        weatherSystemList.add(weatherOutpost);
        weatherSystemList.add(weatherStation);

        WeatherDisplayer weatherDisplayer = new WeatherDisplayer(weatherSystemList);
        weatherDisplayer.displayWeatherDaya(x, y);
    }
}
