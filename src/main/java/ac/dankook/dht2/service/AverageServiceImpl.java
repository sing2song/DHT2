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
    public void setAverageData(Data data) {
        AverageData averageData;
        averageData = this.calculateAverage(data);
        averageRepository.insertAverageData(averageData);
    }
    public AverageData calculateAverage(Data data) {
        List<String> getTempData = this.getTemperature(data);
        List<String> getHumidData = this.getHumidity(data);
        int tempSum = 0, humidSum = 0;
        for (int i = 0; i < getTempData.size(); i++) {
            tempSum += Integer.parseInt(getTempData.get(i));
            humidSum += Integer.parseInt(getHumidData.get(i));
        }
        tempSum /= getTempData.size();
        humidSum /= getHumidData.size();
        AverageData averageData = new AverageData();
        averageData.setUser_id(data.getUser_id());
        averageData.setAverage_temperature(tempSum);
        averageData.setAverage_humidity(humidSum);
        return averageData;
    }

    public AverageData getAverageData(String user_id) {
        AverageData averageData = averageRepository.getAverageData(user_id);
        return averageData;
    }
}
