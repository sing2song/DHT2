package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.SignIn;
import ac.dankook.dht2.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signin")
public class SigninController {
//    @Autowired
//    private SignInService signin;

    @RequestMapping("signin")
    public String index() {
        return "signin";
    }

//    @RequestMapping("/signin")
//    public SignIn signIn(@RequestParam Integer id) {
//        SignIn sign =signin.getPost(id);
//        return sign;
//    }

//    @RequestMapping("signin")
//    public String signin() {
//        return "redirect:/average";
//    }
}
