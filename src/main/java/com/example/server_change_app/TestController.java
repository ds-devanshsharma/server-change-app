package com.example.server_change_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/ping")
    @ResponseBody
    String pongController(){

        logger.info("******** Entered into pongController in TestController ******** ");
        return "Pong !!!!!!!!!!!!!";
    }
}
