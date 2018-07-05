package ac.dankook.dht2.service;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.repository.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService{
    private static final Logger LOGGER = LoggerFactory.getLogger(DataServiceImpl.class);

    @Autowired
    private DataRepository dataRep;

    public void insertData(Data data) {
        LOGGER.debug("dataService");
        dataRep.insertData(data);
    }
}
