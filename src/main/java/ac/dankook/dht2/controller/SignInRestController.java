package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.SignIn;
import ac.dankook.dht2.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInRestController {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SignInRestController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/rest/get", method = RequestMethod.GET)
    public SignIn signIn(@RequestParam String id) {
        LOGGER.debug("Controller");
        SignIn sign= userService.getPost(id);
        return sign;
    }
}
