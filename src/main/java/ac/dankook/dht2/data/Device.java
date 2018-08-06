package ac.dankook.dht2.data;

public class Device {
    public int getAirconditional() {
        return airconditional;
    }

    public void setAirconditional(int airconditional) {
        this.airconditional = airconditional;
    }

    public int getHeater() {
        return heater;
    }

    public void setHeater(int heater) {
        this.heater = heater;
    }   

    public int getHumidifier() {
        return humidifier;
    }

    public void setHumidifier(int humidifier) {
        this.humidifier = humidifier;
    }

    public int getDehumidifier() {
        return dehumidifier;
    }

    public void setDehumidifier(int dehumidifier) {
        this.dehumidifier = dehumidifier;
    }

    private int airconditional;
    private int heater;
    private int humidifier;
    private int dehumidifier;
}
