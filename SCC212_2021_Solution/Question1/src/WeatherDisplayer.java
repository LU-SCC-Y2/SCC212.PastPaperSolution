import java.util.ArrayList;

public class WeatherDisplayer {
    private ArrayList <WeatherSystem> weatherSystemsList;

    public WeatherDisplayer(ArrayList <WeatherSystem> weatherSystemsList){
        this.weatherSystemsList = weatherSystemsList;
    }

    public void displayWeatherDaya(int x, int y){
        if (weatherSystemsList.size() > 0){

            for (WeatherSystem system: weatherSystemsList){
                system.getLocation(x, y);
            }
        }
        else{
            calculateAverageWeatherData();
        }

    }

    public void calculateAverageWeatherData(){
        // Calculate the average of each WeatherData by using a for loop
        // then return weatherData so that each average value can be displayed
        // void is used in this case to avoid errors, else it should be 
        // public WeatherData calculateAverageWeatherData()
    }   


}
