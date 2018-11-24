package com.spring.demo.annotations.coach.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class SoccerCoach implements Coach {

    @Autowired
    @Qualifier("goodDayFortuneService")
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Pass drills and corner kicks";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

}
