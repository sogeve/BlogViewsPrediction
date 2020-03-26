package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

    @Modifying
    @Query("DELETE FROM Event e WHERE e.name =:name")
    void deleteEvent(@Param("name") String name);

    @Modifying
    @Query("UPDATE Event e set e.activityIncrease =:value WHERE e.name =:name")
    void editEvent(@Param("name") String name, @Param("value") Integer value);

}
