package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

/**
 * A {@link Coach} that specializes in soccer.
 *
 * @author Charlie Collins
 *
 */
@Component
public class SoccerCoach implements Coach {

    public String getDailyWorkout() {
        return "Pass drills and corner kicks";
    }

}
