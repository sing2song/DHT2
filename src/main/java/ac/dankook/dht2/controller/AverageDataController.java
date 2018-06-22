package ac.dankook.dht2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/average")
public class AverageDataController {
    @RequestMapping("")
    public String index() {
        return "device";
    }
}
