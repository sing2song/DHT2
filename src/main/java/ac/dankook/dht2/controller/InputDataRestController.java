package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputDataRestController {
    static final Logger LOGGER= LoggerFactory.getLogger(InputDataRestController.class);
    @Autowired
    private DataService dataService;

    @RequestMapping(value="/rest/insert", method= RequestMethod.GET )
    public void InputData(@RequestParam String user_id,@RequestParam short temperature, @RequestParam short humidity) {

        LOGGER.debug("InputDataRestController");
        Data data = new Data();
        data.setTemperature(temperature);
        data.setHumidity(humidity);
        dataService.insertData(data);
    }
}
