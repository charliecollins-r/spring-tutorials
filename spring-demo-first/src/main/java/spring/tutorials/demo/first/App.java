package spring.tutorials.demo.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main application
 */
public class App {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from Spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        // Call methods on the bean
        System.out.println(coach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
