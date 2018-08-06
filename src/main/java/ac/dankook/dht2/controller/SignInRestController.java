package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.User;
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

    @RequestMapping(value = "/rest/get", method = RequestMethod.POST)
    public String signIn(@RequestParam String user_id,@RequestParam String user_password) {
        LOGGER.debug("Controller");
        User user =  new User();
        user.setUser_id(user_id);
        user.setUser_password(user_password);
        Boolean result=userService.checkPassword(user);
        if(result) {
            LOGGER.debug("Success");
            return "success";
        }
        else {
            LOGGER.debug("failed");
            return "fail";
        }
    }
}
