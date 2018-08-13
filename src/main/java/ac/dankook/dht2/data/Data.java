package ac.dankook.dht2.data;

public class Data {
    private short temperature;
    private short humidity;
    private String user_id;

    public String getUser_id() {return user_id;}

    public void setUser_id(String user_id) {this.user_id = user_id;}

    public short getTemperature() {return temperature;}

    public void setTemperature(short temperature) {this.temperature = temperature;}

    public short getHumidity() {return humidity;}

    public void setHumidity(short humidity) {this.humidity = humidity;}
}
