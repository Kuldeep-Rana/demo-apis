package com.codersdesks.controller;

import com.codersdesks.SampleData;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/demo/")
public class DemoAPIsController {

    @GetMapping
    public String helloWorld() {
        return "Hello World, current time is " + LocalDateTime.now();
    }

    @PostMapping
    public SampleData save(@RequestBody SampleData sample){
        System.out.println(sample);
        sample.setId(UUID.randomUUID().toString());
        return sample;
    }
}
