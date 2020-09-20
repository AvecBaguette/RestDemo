package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    private String region;
    private String location;
    private String periodStart;
    private String periodEnd;

    protected Sport() {
    }

    public Sport(String name, String country, String region, String location, String periodStart, String periodEnd) {
        this.name = name;
        this.country = country;
        this.region = region;
        this.location = location;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", location='" + location + '\'' +
                ", periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public String getPeriodStart() {
        return periodStart;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}