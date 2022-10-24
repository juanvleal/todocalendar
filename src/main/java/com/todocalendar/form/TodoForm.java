package com.todocalendar.form;

public class TodoForm {

    private String title;
    private String description;
    private boolean done =  false;
    private String taskDateTime;
    private Long durationTime;

    public TodoForm() {
    }

    public TodoForm(String title, String description, boolean done, String  taskDateTime, String taskHour, Long durationTime) {
        this.title = title;
        this.description = description;
        this.done = done;
        this.taskDateTime = taskDateTime;
        this.durationTime = durationTime;
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
