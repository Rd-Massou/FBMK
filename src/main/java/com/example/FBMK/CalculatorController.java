package com.example.FBMK;

import com.example.FBMK.models.FactRequest;
import com.example.FBMK.models.OperationRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    @PostMapping("/add")
    public Float add(@RequestBody OperationRequest body){
        return body.getA() + body.getB();
      }

    @PostMapping("/multiply")
    public Float multiply(@RequestBody OperationRequest body){return body.getA()* body.getB();}

    @PostMapping("/divide")
    public Float divide(@RequestBody OperationRequest body){
        if(body.getB() == 0) throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ERROR: divisor is null");
        return body.getA() / body.getB();
    }


    @PostMapping("/factorial")
    public Integer factorial(@RequestBody FactRequest body) {
        int fact = 1;
        for (int i = 1; i<=body.getNumber(); i++) {
            fact *= i;
        }
        return fact;
    }

    

}
