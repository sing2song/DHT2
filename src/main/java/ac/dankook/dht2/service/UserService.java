package ac.dankook.dht2.service;

import ac.dankook.dht2.data.User;

public interface UserService {
    User getPost(String id);
    String checkPassword(User user);
}
