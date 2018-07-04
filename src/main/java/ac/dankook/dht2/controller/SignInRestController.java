package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.SignIn;
import ac.dankook.dht2.service.SignInService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInRestController {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SignInController.class);
    @Autowired
    private SignInService  signInService;

    @RequestMapping(value = "/rest/get", method = RequestMethod.GET)
    public SignIn signIn(@RequestParam String id) {
        LOGGER.debug("Controller");
        SignIn sign=signInService.getPost(id);
        return sign;
    }
}
