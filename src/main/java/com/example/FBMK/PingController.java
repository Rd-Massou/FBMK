package com.example.FBMK;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {
    private Integer counter = 0;

    @GetMapping("/pingme")
    public Integer pingMe(){
        return ++counter;
    }
}
