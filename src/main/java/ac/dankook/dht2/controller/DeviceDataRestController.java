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
public class DeviceDataRestController {
    static final Logger LOGGER = LoggerFactory.getLogger(DeviceDataRestController.class);

    @Autowired
    private DataService dataService;

    @RequestMapping(value="/rest/device", method= RequestMethod.GET)
    public void DeviceData(@RequestParam int airconditional, @RequestParam int heater, @RequestParam int humidifier, @RequestParam int dehumidifier){
        LOGGER.debug("DeviceDataRestController");
        Data data = new Data();
        data.setAirconditional(airconditional);
        data.setHeater(heater);
        data.setHumidifier(humidifier);
        data.setDehumidifer(dehumidifier);
        dataService.setState(data);
    }

}
