package spring.tutorials.demo.first;

/**
 * Main application
 */
public class App {
    public static void main(String[] args) {
        // Create the object
        Coach baseballCoach = new TrackCoach();

        // Use the object
        System.out.println(baseballCoach.getDailyWorkout());
    }
}
