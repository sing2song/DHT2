package ac.dankook.dht2.data;

public class Data {
    public double getHum() {
        return hum;
    }

    public void setHum(Integer hum) {
        this.hum = hum;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    private Integer temp;
    private Integer hum;

}
