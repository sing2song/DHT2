package ac.dankook.dht2.service;

import ac.dankook.dht2.data.Data;

public interface AverageService {
    void getTemperature(Data data);
    void getHumidity(Data data);
}
