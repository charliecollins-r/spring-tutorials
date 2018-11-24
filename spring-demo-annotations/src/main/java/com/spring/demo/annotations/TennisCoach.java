package com.spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A {@link Coach} that specializes in tennis.
 *
 * @author Charlie Collins
 *
 */
@Component
public class TennisCoach implements Coach, FortuneService {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice back hand volley";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

}
