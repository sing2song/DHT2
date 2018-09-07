package ac.dankook.dht2.controller;

import ac.dankook.dht2.data.AverageData;
import ac.dankook.dht2.service.AverageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AverageDataRestController {
    static final Logger LOGGER = LoggerFactory.getLogger(AverageDataRestController.class);

    @Autowired
    AverageService averageService;

    @RequestMapping(value = "/rest/average", method = RequestMethod.POST)
    public AverageData setAverageData(@RequestParam String user_id) {
        LOGGER.debug("AverageDataRestController");
        return averageService.getAverageData(user_id);
    }


}
