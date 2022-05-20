package com.example.FBMK;

import com.example.FBMK.models.PingRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/ping")
public class PingController {
    private HashMap<String, Integer> map = new HashMap<>();

    @GetMapping("/pingme")
    public Integer pingMe(@RequestBody PingRequest body){
        map.put(body.getId(), map.getOrDefault(body.getId(),0)+1);
        return map.get(body.getId());
    }
}
