package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.data.User;

public interface DataRepository {
    User insertData(Data data);
}
