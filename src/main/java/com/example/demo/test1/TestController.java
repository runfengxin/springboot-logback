package com.example.demo.test1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @RequestMapping("test")
    public String hello(){
        log.debug("5");
        log.info("5");
        log.warn("5");
        log.error("5");
        log.trace("5");
        return "hello";
    }
}
