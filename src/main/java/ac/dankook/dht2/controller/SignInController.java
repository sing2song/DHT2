package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.SignIn;
import ac.dankook.dht2.service.SignInService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class SignInController {



    @RequestMapping("")
    public String index() {
        return "signin";
    }



//    @RequestMapping("signin")
//    public String signin() {
//        return "redirect:/average";
//    }
}
