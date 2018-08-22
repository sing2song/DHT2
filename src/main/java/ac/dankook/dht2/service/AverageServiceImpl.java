package ac.dankook.dht2.service;

import ac.dankook.dht2.data.AverageData;
import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.repository.AverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AverageServiceImpl implements AverageService{
    @Autowired
    private AverageRepository averageRepository;

    public List<String> getTemperature(Data data) {
        return averageRepository.getTemperature(data);
    }
    public List<String> getHumidity(Data data) {
        return averageRepository.getHumidity(data);
    }
    public void setAverageData(AverageData averageData) {
        averageRepository.insertAverageData(averageData);
    }
}
