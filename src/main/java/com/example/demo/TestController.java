package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("/{id}/{name}")
    TestAggregate test(@PathVariable Integer id, @PathVariable String name) {
        return testRepository.save(TestAggregate.builder()
//                .id(id)
                .name(name)
                .build());
    }

}
