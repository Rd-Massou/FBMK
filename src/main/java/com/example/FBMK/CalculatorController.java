package com.example.FBMK;

import com.example.FBMK.models.AdditionRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    @PostMapping("/add")
    public Float add(@RequestBody AdditionRequest body){
        return body.getA() + body.getB();
    }
}
