package com.example.demo;

import com.example.demo.controllers.AddController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ViewResolver;

import java.util.List;

@EnableJpaRepositories
@SpringBootApplication
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
//    private AddController addController = new AddController();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner clr(DatabaseService databaseService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                databaseService.addEvent("Example event", 200);
                databaseService.addEvent("Example event 2", 50);
                databaseService.addEvent("Example event 3", 50);

                List<Event> allEvents = databaseService.getAllEvents();
                log.info("Event: {}", allEvents);

                databaseService.deleteEvent("Example event 2");

                allEvents = databaseService.getAllEvents();
                log.info("Event: {}", allEvents);

                databaseService.editEvent("Example event", 500);

                allEvents = databaseService.getAllEvents();
                log.info("Event: {}", allEvents);



            }
        };
    }

}
