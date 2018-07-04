package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.SignIn;
import org.springframework.stereotype.Repository;

public interface SignInRepository {
    SignIn SignIn(String id);
}
