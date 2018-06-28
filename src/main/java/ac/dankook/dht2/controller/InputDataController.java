package ac.dankook.dht2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/input")
public class InputDataController {
    @RequestMapping("")
    public String InputData() { return "input"; }
}
