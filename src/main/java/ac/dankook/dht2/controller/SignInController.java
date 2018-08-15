package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.CookieGenerator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class SignInController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SignInController.class);

    @RequestMapping("")
    public String index(HttpServletResponse response) {
        Cookie cookie = new Cookie("name", "bar");
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
        return "signin";
    }


    @RequestMapping("signin")
    public String signin(@RequestParam String user_id, @RequestParam String user_password) {
        LOGGER.debug(user_id);
        LOGGER.debug(user_password);

        return "redirect:/average";
    }
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

