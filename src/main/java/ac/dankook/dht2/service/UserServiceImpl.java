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
    public String checkPassword(SignIn signIn) {
        if(signIn.getUser_password()==getPost(signIn.getUser_id()).getUser_password()) {
            System.out.println(signIn.getUser_password());
            System.out.println(getPost(signIn.getUser_id()).getUser_password());
            return "success";
        }
        else
            return "false";
    }

}
