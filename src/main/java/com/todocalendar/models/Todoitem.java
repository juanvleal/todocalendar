package com.todocalendar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Todoitem {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private boolean done;
    private String taskDateTime;
    private Long durationTime;

    public Todoitem() {
    }

    public Todoitem(Long id, String title, String description, boolean done, String taskDateTime, Long durationTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
        this.taskDateTime = taskDateTime;
        this.durationTime = durationTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTaskDateTime() {
        return taskDateTime;
    }

    public void setTaskDateTime(String taskDateTime) {
        this.taskDateTime = taskDateTime;
    }

    public Long getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Long durationTime) {
        this.durationTime = durationTime;
    }
}
