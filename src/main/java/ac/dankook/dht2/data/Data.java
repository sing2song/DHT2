package ac.dankook.dht2.data;

public class Data {
    private int temperature;
    private int humidity;
    private String user_id;

    public String getUser_id() {return user_id;}

    public void setUser_id(String user_id) {this.user_id = user_id;}

    public int getTemperature() {return temperature;}

    public void setTemperature(int temperature) {this.temperature = temperature;}

    public int getHumidity() {return humidity;}

    public void setHumidity(int humidity) {this.humidity = humidity;}
}
