package com.spring.demo.annotations.fortune.service.impl;

import org.springframework.stereotype.Component;

import com.spring.demo.annotations.interfaces.FortuneService;

/**
 * Implementation of {@link FortuneService} that returns an okay day.
 *
 * @author Charlie Collins
 */
@Component
public class OkayDayFortuneService implements FortuneService {

    public String getFortune() {
        return "Okay day!";
    }

}
