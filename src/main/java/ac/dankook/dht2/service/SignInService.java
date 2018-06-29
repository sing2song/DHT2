package ac.dankook.dht2.service;

import ac.dankook.dht2.data.SignIn;
import org.springframework.stereotype.Service;

public interface SignInService {
    SignIn getPost(Integer id);

}
