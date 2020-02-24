package com.example.demo;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DatabaseService {

    private final EventRepository eventRepository;


    public DatabaseService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Events addEvent(String name, Integer viewIncrease) {
        Events events = new Events();
        events.setName(name);
        events.setViewsIncrease(viewIncrease);

        return eventRepository.save(events);
    }

    public List<Events> getAllEvents() {
        return (List<Events>) eventRepository.findAll();
    }

}
