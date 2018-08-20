package ac.dankook.dht2.controller;

import ac.dankook.dht2.service.DataService;
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
    private DataService dataService;

    @RequestMapping(value="rest/average", method=RequestMethod.GET)
    public void AverageData(@RequestParam String user_id) {
        LOGGER.debug("AverageDataRestController");
    }


}
