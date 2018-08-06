package ac.dankook.dht2.service;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.data.Device;

public interface DataService {
    void insertData(Data data);
    void setState(Device device);
}
