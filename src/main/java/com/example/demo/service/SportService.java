package com.example.demo.service;

import com.example.demo.entity.Sport;
import com.example.demo.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SportService {

    private SportRepository sportRepository;

    @Autowired
    public SportService(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    public List<Sport> findByName(String name) {
        return sportRepository.findByName(name);
    }

    public List<Sport> findAll() {
        return sportRepository.findAll();
    }

    public void deleteSportByName(String name) {
        sportRepository.deleteByName(name);
    }

    public void addSport(String name, String country, String region, String location, String periodStart, String periodEnd) {
        sportRepository.save(new Sport(name, country, region, location, periodStart, periodEnd));
    }

    public void updateSport(String name, String country, String region, String location, String periodStart, String periodEnd) {
        if (!sportRepository.findByName(name).isEmpty()) {
            Sport existingSport = sportRepository.findByName(name).get(0);
            existingSport.setCountry(country);
            existingSport.setRegion(region);
            existingSport.setLocation(location);
            existingSport.setPeriodEnd(periodEnd);
            existingSport.setPeriodStart(periodStart);

            sportRepository.save(existingSport);
        }

    }
}
