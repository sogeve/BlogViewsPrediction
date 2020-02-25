package com.example.demo;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DatabaseService {

    private final EventRepository eventRepository;
//    private final StatsRepository statsRepository;


    public DatabaseService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event addEvent(String name, Integer activityIncrease) {
        Event event = new Event();
        event.setName(name);
        event.setActivityIncrease(activityIncrease);

        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }


    public void deleteEvent(String name) {
        eventRepository.deleteEvent(name);

    }

//    public Stats setNewIfEmpty() {
//        List<Stats>
//    }

}
