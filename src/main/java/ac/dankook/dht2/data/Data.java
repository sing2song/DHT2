package ac.dankook.dht2.data;

public class Data {
    private short temperature;
    private short humidity;
    private int airconditional;

    public short getTemperature() {
        return temperature;
    }

    public void setTemperature(short temperature) {
        this.temperature = temperature;
    }

    public short getHumidity() {
        return humidity;
    }

    public void setHumidity(short humidity) {
        this.humidity = humidity;
    }

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

    public int getDehumidifer() {
        return dehumidifer;
    }

    public void setDehumidifer(int dehumidifer) {
        this.dehumidifer = dehumidifer;
    }

    private int heater;
    private int humidifier;
    private int dehumidifer;
}
