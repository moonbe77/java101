package src.main.java.com.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public int getCompletedTaskCount() {

        // final List<Task> completed = tasks.stream().filter(task ->
        // task.isCompleted()).toList();
        final List<Task> completed = new ArrayList<>();

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed.add(task);
            }

        }

        return completed.size();

    }

    public List<Task> getCompletedTasks() {

        // final List<Task> completed = tasks.stream().filter(task ->
        // task.isCompleted()).toList();

        final List<Task> completed = new ArrayList<>();

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed.add(task);
            }

        }

        return completed;

    }

}
