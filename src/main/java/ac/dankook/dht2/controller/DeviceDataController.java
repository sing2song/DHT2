package ac.dankook.dht2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/device")
public class DeviceDataController {
    @RequestMapping("")
    public String device() { return "device"; }
}
