package ac.dankook.dht2.data;

public class AverageData {
    private String user_id;
    private int average_temperature;
    private int average_humidity;
    private String update_date;

    public String getUpdate_date() { return update_date; }

    public void setUpdate_date(String update_date) { this.update_date = update_date; }

    public int getAverage_temperature() {
        return average_temperature;
    }

    public void setAverage_temperature(int average_temperature) {
        this.average_temperature = average_temperature;
    }

    public int getAverage_humidity() {
        return average_humidity;
    }

    public void setAverage_humidity(int average_humidity) {
        this.average_humidity = average_humidity;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}
