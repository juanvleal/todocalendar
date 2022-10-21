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
    private Date conclusionDate;
    private Date finishDate;
    private Long durationTime;

    public Todoitem() {
    }

    public Todoitem(Long id, String title, String description, boolean done, Date conclusionDate, Date finishDate, Long durationTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
        this.conclusionDate = conclusionDate;
        this.finishDate = finishDate;
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

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Long getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Date d1, Date d2) {
        this.durationTime = d1.getTime() - d2.getTime();
    }
}
