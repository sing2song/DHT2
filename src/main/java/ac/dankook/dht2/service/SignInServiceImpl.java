package ac.dankook.dht2.service;

import ac.dankook.dht2.data.SignIn;
import ac.dankook.dht2.repository.SignInRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInServiceImpl implements SignInService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SignInServiceImpl.class);
    @Autowired
    private SignInRepository signInRep;

    public SignIn getPost(String id) {
        SignIn sign=signInRep.SignIn(id);
        LOGGER.debug("test");
        return sign;
    }
}
