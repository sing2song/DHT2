package ac.dankook.dht2.service;

import ac.dankook.dht2.data.Data;

public interface DataService {
    void insertData(Data data);
    void setState(Data data);
}
