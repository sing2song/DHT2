package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.data.SignIn;

public interface DataRepository {
    SignIn insertData(Data data);
}
