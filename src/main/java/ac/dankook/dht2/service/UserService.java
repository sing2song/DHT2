package ac.dankook.dht2.service;

import ac.dankook.dht2.data.SignIn;

public interface UserService {
    SignIn getPost(String id);
    String checkPassword(SignIn signIn);
}
