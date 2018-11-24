package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

/**
 * Basic implementation of {@link FortuneService}.
 *
 * @author Charlie Collins
 */
@Component
public class BasicFortuneService implements FortuneService {

    public String getFortune() {
        return "Today is your lucky day!";
    }

}
