package com.example.demo.test1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @RequestMapping("test")
    public String hello(){
        for (int i = 0;i < 8; i++) {
            log.debug(i + "sssssssssssssssssssssssssssssssssssssssss");
        }
        return "hello";
    }
}
