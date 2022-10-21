package com.todocalendar.form;

public class TodoForm {

    private String title;
    private String description;
    private boolean done;
    private String conclusionDate;
    private String finishDate;

    public TodoForm() {
    }

    public TodoForm(String title, String description, boolean done, String  conclusionDate, String finishDate) {
        this.title = title;
        this.description = description;
        this.done = done;
        this.conclusionDate = conclusionDate;
        this.finishDate = finishDate;
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

    public String getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(String conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}
