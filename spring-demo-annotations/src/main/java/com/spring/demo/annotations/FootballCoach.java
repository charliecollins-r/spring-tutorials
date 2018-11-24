package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

/**
 * A {@link Coach} that specializes in football.
 *
 * @author Charlie Collins
 *
 */
@Component
public class FootballCoach implements Coach {

    public String getDailyWorkout() {
        return "Catch 30 footballs";
    }

}
