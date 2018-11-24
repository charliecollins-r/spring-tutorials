package spring.tutorials.demo.first;

/**
 * A {@link Coach} that specializes in baseball.
 *
 * @author Charlie Collins
 *
 */
public class BaseballCoach implements Coach {

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

}
