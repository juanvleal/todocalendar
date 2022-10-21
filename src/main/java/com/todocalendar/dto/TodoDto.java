package com.todocalendar.dto;

import com.todocalendar.models.Todoitem;

import java.util.Date;
import java.util.Objects;

public class TodoDto {

    private Long id;
    private String title;
    private String description;
    private boolean done;
    private Date conclusionDate;
    private Date finishDate;
    private Long durationTime;

    public TodoDto() {
    }

    public TodoDto(Todoitem entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.description = entity.getDescription();
        this.done = entity.isDone();
        this.conclusionDate = entity.getConclusionDate();
        this.finishDate = entity.getFinishDate();
        this.durationTime = entity.getDurationTime();
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

    public void setDurationTime(Long durationTime) {
        this.durationTime = durationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoDto todoDto = (TodoDto) o;
        return done == todoDto.done && Objects.equals(id, todoDto.id) && Objects.equals(title, todoDto.title) && Objects.equals(description, todoDto.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, done);
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
