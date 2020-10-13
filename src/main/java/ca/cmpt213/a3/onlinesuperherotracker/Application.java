package ca.cmpt213.a3.onlinesuperherotracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application is the main class for superhero tracker
 * It starts the Spring Boot for this application
 */
@SpringBootApplication
public class Application {
    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
