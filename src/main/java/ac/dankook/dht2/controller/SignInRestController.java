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

    @RequestMapping(value = "/rest/get", method = RequestMethod.GET)
    public String signIn(@RequestParam String id,@RequestParam String password) {
        LOGGER.debug("Controller");
        User user =  new User();
        user.setUser_id(id);
        user.setUser_password(password);
        String result=userService.checkPassword(user);
        if(result.equals("success"))
            return "input";
        else
            return "user";
//        User sign= userService.getPost(id);
    }
}
