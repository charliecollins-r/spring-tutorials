package com.spring.demo.annotations.coach.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.demo.annotations.interfaces.Coach;
import com.spring.demo.annotations.interfaces.FortuneService;

/**
 * A {@link Coach} that specializes in football.
 *
 * @author Charlie Collins
 *
 */
@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("randomDayFortuneService")
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Catch 30 footballs";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

}
