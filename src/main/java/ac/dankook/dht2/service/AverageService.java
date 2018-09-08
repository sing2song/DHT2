package ac.dankook.dht2.service;

import ac.dankook.dht2.data.AverageData;
import ac.dankook.dht2.data.Data;

import java.util.List;

public interface AverageService {
    List<String> getTemperature(Data data);
    List<String> getHumidity(Data data);
    void setAverageData(Data data);
    AverageData calculateAverage(Data data);
    AverageData getAverageData(String user_id);
}
