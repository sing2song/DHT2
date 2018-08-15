package ac.dankook.dht2.service;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.repository.AverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AverageServiceImpl implements AverageService{
    @Autowired
    private AverageRepository averageRepository;

    public void getTemperature(Data data) {
        averageRepository.getTemperature(data);
    }
    public void getHumidity(Data data) {
        averageRepository.getHumidity(data);
    }
}
