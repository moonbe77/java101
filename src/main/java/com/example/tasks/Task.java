package src.main.java.com.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private String title;
    private String description;
    private boolean completed;

    public Task(String title , String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

}
