package com.example.demo.controller;

import com.example.demo.entity.Sport;
import com.example.demo.service.SportService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class SportCotroller {

    private SportService sportService;

    @Autowired
    public SportCotroller(SportService sportService) {
        this.sportService = sportService;
    }

    @GetMapping("/sports")
    public List<Sport> showSports() {
        return this.sportService.findAll();
    }

    @GetMapping("/sports/by-name")
    public List<Sport> showSportsByName(@RequestParam("name") String name) {
        return this.sportService.findByName(name);
    }

    @DeleteMapping("/delete-sport/by-name")
    public ResponseEntity<String> deleteSportByName(@RequestParam("name") String name) {
        sportService.deleteSportByName(name);
        return new ResponseEntity<>("Sport deleted successfully", HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addSport(@RequestParam("name") String name,
                                           @RequestParam("country") String country,
                                           @RequestParam("region") String region,
                                           @RequestParam("location") String location,
                                           @RequestParam("period_start") String periodStart,
                                           @RequestParam("period_end") String periodEnd) {
        sportService.addSport(name, country, region, location, periodStart, periodEnd);
        return new ResponseEntity<>("Sport added successfully", HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateSport(@RequestParam("name") String name,
                                              @RequestParam("country") String country,
                                              @RequestParam("region") String region,
                                              @RequestParam("location") String location,
                                              @RequestParam("period_start") String periodStart,
                                              @RequestParam("period_end") String periodEnd) {
        sportService.updateSport(name, country, region, location, periodStart, periodEnd);
        return new ResponseEntity<>("Sport updated successfully", HttpStatus.OK);
    }
}
