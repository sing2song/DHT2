package ac.dankook.dht2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputDataRestController {

    @RequestMapping(value="/rest/insert", method= RequestMethod.POST)
    public void InputData(@RequestParam Integer temp,@RequestParam Integer Hum) {
        

    }
}
