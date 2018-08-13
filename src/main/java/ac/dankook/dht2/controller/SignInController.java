package ac.dankook.dht2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.CookieGenerator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class SignInController {

    @RequestMapping("")
    public String index() {
        return "signin";
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

