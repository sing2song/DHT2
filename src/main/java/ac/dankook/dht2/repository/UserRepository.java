package ac.dankook.dht2.repository;


import ac.dankook.dht2.data.SignIn;


public interface UserRepository {
    SignIn signIn(String id);
}
