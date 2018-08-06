package ac.dankook.dht2.service;

import ac.dankook.dht2.data.User;
import ac.dankook.dht2.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    public User getPost(String id) {
        User sign= userRepository.getPassword(id);
        return sign;
    }
    public Boolean checkPassword(User user) {
        String password = user.getUser_password();
        String selectedPassword = this.getPost(user.getUser_id()).getUser_password();

        if(password.equals(selectedPassword)) {
            System.out.println(password);
            System.out.println(selectedPassword);
            return true;
        }
        else
            return false;
    }

}
