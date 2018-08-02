package ac.dankook.dht2.service;

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
        User sign= userRepository.getPassword(id);
        LOGGER.debug("test");
        return sign;
    }
    public String checkPassword(User user) {
        if(user.getUser_password()==getPost(user.getUser_id()).getUser_password()) {
            System.out.println(user.getUser_password());
            System.out.println(getPost(user.getUser_id()).getUser_password());
            return "success";
        }
        else
            return "false";
    }

}
