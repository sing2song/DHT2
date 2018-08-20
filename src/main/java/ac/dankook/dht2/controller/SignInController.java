package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.User;
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
    @Autowired private UserService userService;
    private static final Logger LOGGER = LoggerFactory.getLogger(SignInController.class);

    @RequestMapping("")
    public String index() {
        return "signin";
    }
    @RequestMapping("signin")
    @ResponseBody
    public  String signIn(@RequestParam String user_id, @RequestParam String user_password, HttpServletResponse response) {
        LOGGER.debug("Controller");
        Cookie cookie = new Cookie("name", user_id);
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
        User user = new User();
        user.setUser_id(user_id);
        user.setUser_password(user_password);
        Boolean result = userService.checkPassword(user);
        if (result) {
            LOGGER.debug("Success");
            return user_id;
        } else {
            LOGGER.debug("failed");
            return "fail";
        }
    }


//    @RequestMapping("signin")
//    public String signin(@RequestParam String user_id, @RequestParam String user_password) {
//        LOGGER.debug(user_id);
//        LOGGER.debug(user_password);
//
//        return "redirect:/average";
//    }
//    @RequestMapping(method = RequestMethod.GET)
//    public void testCookie(HttpServletResponse response) {
//        Cookie setCookie = new Cookie("name", "test");
//        setCookie.setMaxAge(60 * 60 * 1);
//        response.addCookie(setCookie);
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public void testCookie(HttpServletRequest request) {
//        Cookie[] getCookie = request.getCookies();
//        if (getCookie != null) {
//            for (int i = 0; i < getCookie.length; i++) {
//                Cookie c = getCookie[i];
//                String name = c.getName();
//                String value = c.getValue();
//            }
//        }
//    }
}

