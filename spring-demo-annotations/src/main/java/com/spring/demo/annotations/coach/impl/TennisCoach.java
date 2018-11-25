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
 * A {@link Coach} that specializes in tennis.
 *
 * @author Charlie Collins
 *
 */
@Component
@Scope("prototype")
public class TennisCoach implements Coach, FortuneService {

    @Autowired
    @Qualifier("randomDayFortuneService")
    private FortuneService fortuneService;

    @PostConstruct
    public void doCleanup() {
        // TODO: clean up
    }

    public String getDailyWorkout() {
        return "Practice back hand volley";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    @PreDestroy
    public void initialize() {
        // TODO: initialize object once it it constructed
    }

    // Use for constructor dependency injection
    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    // this.fortuneService = fortuneService;
    // }

    // Use for method dependency injection
    // @Autowired
    // public void setFortuneService(FortuneService fortuneService) {
    // this.fortuneService = fortuneService;
    // }

}
