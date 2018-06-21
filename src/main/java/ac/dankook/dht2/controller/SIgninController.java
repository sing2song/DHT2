package ac.dankook.dht2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SIgninController {
    @RequestMapping("")
    public String index() {
        return "signin";
    }

    @RequestMapping("signin")
    public String signin() {
        return "redirect:/average";
    }
}
