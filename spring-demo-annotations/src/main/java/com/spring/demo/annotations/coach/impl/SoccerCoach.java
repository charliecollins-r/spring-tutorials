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
 * A {@link Coach} that specializes in soccer.
 *
 * @author Charlie Collins
 *
 */
@Component
@Scope("prototype")
public class SoccerCoach implements Coach {

    @Autowired
    @Qualifier("goodDayFortuneService")
    private FortuneService fortuneService;

    @PostConstruct
    public void doCleanup() {
        // TODO: clean up
    }

    public String getDailyWorkout() {
        return "Pass drills and corner kicks";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    @PreDestroy
    public void initialize() {
        // TODO: initialize object once it it constructed
    }

}
