package ac.dankook.dht2.service;

//import ac.dankook.dht2.controller.SignInRestController;

import ac.dankook.dht2.data.User;
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

    public User getPost(String id) {
        User user = userRepository.getPassword(id);
        return user;
    }

    public Boolean checkPassword(User user) {
        String password = user.getUser_password();
        String selectedPassword = this.getPost(user.getUser_id()).getUser_password();
        LOGGER.debug("password: "+password);
        LOGGER.debug("selectedPassword: "+selectedPassword);
        if (password.equals(selectedPassword)) {
            return true;
        } else
            return false;
    }

}
