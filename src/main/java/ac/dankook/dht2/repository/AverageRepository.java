package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.AverageData;
import ac.dankook.dht2.data.Data;

import java.util.List;

public interface AverageRepository {
    List<String> getTemperature(Data data);
    List<String> getHumidity(Data data);
    void insertAverageData(AverageData averageData);
    AverageData getAverageData(String user_id);
}
