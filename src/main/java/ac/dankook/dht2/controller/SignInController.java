package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.data.User;
import ac.dankook.dht2.service.DataService;
import ac.dankook.dht2.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.CookieGenerator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class SignInController {
    @Autowired
    private UserService userService;
    private static final Logger LOGGER = LoggerFactory.getLogger(SignInController.class);
    DataService dataService;

    @RequestMapping("")
    public String index() {
        return "signin";
    }

    @RequestMapping("signin")
    @ResponseBody
    public  String signIn(@RequestParam String user_id, @RequestParam String user_password,HttpServletResponse response) {
        makeCookie(user_id,response);
        User user = new User();
        user.setUser_id(user_id);
        user.setUser_password(user_password);
        Boolean result = userService.checkPassword(user);
        LOGGER.debug("checkPassword");
        if (result) {
            LOGGER.debug("Success");
            return "input";
        } else {
            LOGGER.debug("failed");
            return null;
        }
    }
    private void makeCookie(String user_id, HttpServletResponse response) {
        Cookie cookie = new Cookie("name", user_id);
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
    }
}