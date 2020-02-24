package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Events {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer viewsIncrease;

    @Override
    public int hashCode() {
        return Objects.hash(id, name, viewsIncrease);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getViewsIncrease() {
        return viewsIncrease;
    }

    public void setViewsIncrease(Integer viewsIncrease) {
        this.viewsIncrease = viewsIncrease;
    }

    @Override
    public String toString() {
        return "Events{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", viewsIncrease=" + viewsIncrease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return id.equals(events.id) &&
                name.equals(events.name) &&
                viewsIncrease.equals(events.viewsIncrease);
    }

}
