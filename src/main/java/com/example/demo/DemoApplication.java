package com.example.demo;

import com.example.demo.entity.Sport;
import com.example.demo.repository.SportRepository;
import com.example.demo.service.SportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
