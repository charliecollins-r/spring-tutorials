package com.spring.demo.annotations.fortune.service.impl;

import org.springframework.stereotype.Component;

import com.spring.demo.annotations.interfaces.FortuneService;

/**
 * Implementation of {@link FortuneService} that returns a good day.
 *
 * @author Charlie Collins
 */
@Component
public class GoodDayFortuneService implements FortuneService {

    public String getFortune() {
        return "GoodDay";
    }

}
