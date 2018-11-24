package com.spring.demo.annotations.fortune.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.spring.demo.annotations.interfaces.FortuneService;

@Component
public class RandomDayFortuneService implements FortuneService {

    private Collection<String> dayTypeSample;

    public String getFortune() {
        return getRandomDayType();
    }

    private String getRandomDayType() {

        dayTypeSample = new ArrayList<String>();
        dayTypeSample.add("Good day!");
        dayTypeSample.add("Okay Day.");
        dayTypeSample.add("Bad day :(");

        Random random = new Random();

        int randomNumber = random.nextInt(3);

        return (String) dayTypeSample.toArray()[randomNumber];

    }

}
