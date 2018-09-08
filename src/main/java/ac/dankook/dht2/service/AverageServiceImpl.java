package ac.dankook.dht2.service;

import ac.dankook.dht2.data.AverageData;
import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.repository.AverageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AverageServiceImpl implements AverageService {
    @Autowired
    private AverageRepository averageRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(DataServiceImpl.class);

    public List<String> getTemperature(Data data) {
        return averageRepository.getTemperature(data);
    }

    public List<String> getHumidity(Data data) {
        return averageRepository.getHumidity(data);
    }

    public List<String> getDate(Data data) {
        return averageRepository.getDate(data);
    }

    public void setAverageData(Data data) {
        AverageData averageData;
        averageData = this.calculateAverage(data);
        averageRepository.insertAverageData(averageData);
    }

    public AverageData getAverageData(String user_id) {
        AverageData averageData = averageRepository.getAverageData(user_id);
        return averageData;
    }

    public AverageData calculateAverage(Data data) {
        List<String> getTempData = this.getTemperature(data);
        List<String> getHumidData = this.getHumidity(data);
        List<String> getDate = this.getDate(data);
        int tempSum = 0, humidSum = 0;
        int count = 0;
        LOGGER.debug("getTempData.size():" + getTempData.size());
        if (getTempData.size() == 0) {
            tempSum = 1;
            humidSum = 1;
            count = 1;
        }
        else {
            for (int i = 0; i < getTempData.size(); i++) {
                count++;
                tempSum += Integer.parseInt(getTempData.get(i));
                humidSum += Integer.parseInt(getHumidData.get(i));
                LOGGER.debug("tempSum: " + tempSum + ", humidSum: " + humidSum);
            }
        }
        tempSum /= count;
        humidSum /= count;
        LOGGER.debug("averageTemperatureSum: " + tempSum + ", AverageHumiditySum: " + humidSum);
        AverageData averageData = new AverageData();
        averageData.setUser_id(data.getUser_id());
        averageData.setUpdate_date(getDate.toString());
        averageData.setAverage_temperature(tempSum);
        averageData.setAverage_humidity(humidSum);
        return averageData;
    }
}
