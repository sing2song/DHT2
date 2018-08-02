package ac.dankook.dht2.repository;


import ac.dankook.dht2.data.User;


public interface UserRepository {
    User getPassword(String id);
}
