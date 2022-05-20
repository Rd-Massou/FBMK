package com.example.FBMK;

import com.example.FBMK.models.OperationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    @PostMapping("/add")
    public Float add(@RequestBody OperationRequest body){
        return  1.0f;
    }

    @PostMapping("/multiply")
    public Float multiply(@RequestBody OperationRequest body){return body.getA()* body.getB();}
}
