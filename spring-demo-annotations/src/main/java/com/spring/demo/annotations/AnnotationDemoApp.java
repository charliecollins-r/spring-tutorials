package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Runs annotation demo application
 *
 * @author Charlie Collins
 */
public class AnnotationDemoApp {

    private static void createBeanFromSpecificAnnotation() {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container (specific annotation)
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // call method on the bean (specific annotation)
        System.out.println(tennisCoach.getDailyWorkout());

        // close container
        context.close();

    }

    private static void createBeansDependencyInjection() {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(((TennisCoach) tennisCoach).getFortune());

    }

    private static void createBeansFromDefaultAnnotation() {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container (default annotation)
        Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
        Coach footballCoach = context.getBean("footballCoach", Coach.class);

        // call method on the bean (default annotation)
        System.out.println(soccerCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyWorkout());

        // close container
        context.close();

    }

    public static void main(String[] args) {

        createBeanFromSpecificAnnotation();

        createBeansFromDefaultAnnotation();

        createBeansDependencyInjection();

    }

}
