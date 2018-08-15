package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.Data;

import java.util.List;

public interface AverageRepository {
    List<Data> getTemperature(Data data);
    List<Data> getHumidity(Data data);

}
