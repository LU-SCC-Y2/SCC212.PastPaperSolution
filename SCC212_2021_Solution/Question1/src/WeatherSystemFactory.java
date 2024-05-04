public class WeatherSystemFactory {
    public WeatherSystem createWeatherSystem(String name){
        switch (name){
            case "Satelite":
                System.out.println("Created Satelite");
                return new Satelite();
            
            case "Official Weather Outpost":
                System.out.println("Created Official Weather Outpost");
                return new OfficialWeatherOutpost();
            
            case "Weather Station":
                System.out.println("Created Weather Station");
                return new WeatherStation();
                
            default :
                throw new IllegalArgumentException("Invalid weather system name: " + name);
        }
    }
}
