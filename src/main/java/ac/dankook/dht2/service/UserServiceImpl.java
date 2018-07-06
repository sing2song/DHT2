package ac.dankook.dht2.service;

import ac.dankook.dht2.data.SignIn;
import ac.dankook.dht2.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    public SignIn getPost(String id) {
        SignIn sign= userRepository.signIn(id);
        LOGGER.debug("test");
        return sign;
    }

}
