package com.spring.demo.annotations.interfaces;

/**
 * A set of shared coach attributes and actions
 *
 * @author Charlie Collins
 */
public interface Coach extends FortuneService {

    /**
     * Returns the daily workout for the coach.
     *
     * @return the daily workout for the coach.
     */
    public String getDailyWorkout();

}
