package com.spring.demo.annotations.coach.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
@Scope("prototype")
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("randomDayFortuneService")
    private FortuneService fortuneService;

    @PostConstruct
    public void doCleanup() {
        // TODO: clean up
    }

    public String getDailyWorkout() {
        return "Catch 30 footballs";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    @PreDestroy
    public void initialize() {
        // TODO: initialize object once it it constructed
    }

}
