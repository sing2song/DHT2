package ac.dankook.dht2.service;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.data.Device;
import ac.dankook.dht2.repository.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService{
    private static final Logger LOGGER = LoggerFactory.getLogger(DataServiceImpl.class);

    @Autowired
    private DataRepository dataRepository;

    public void insertData(Data data) {
        LOGGER.debug("insertData");
        dataRepository.insertData(data);
    }

    public void setState(Device device) {
        LOGGER.debug("insertState");
        dataRepository.setState(device);
    }
}
