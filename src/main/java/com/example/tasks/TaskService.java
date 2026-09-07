package src.main.java.com.example.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
    repository.save(task);
    }

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public int getTaskCount() {
        return repository.findAll().size();
    }

    public int getCompletedTaskCount() {

        // final List<Task> completed = tasks.stream().filter(task ->
        // task.isCompleted()).toList();
        final List<Task> completed = new ArrayList<>();

        for (Task task : repository.findAll()) {
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

        for (Task task : repository.findAll()) {
            if (task.isCompleted()) {
                completed.add(task);
            }

        }

        return completed;

    }
    
    public Optional<Task> getTaskById(Long id){

        return repository.findById(id);

    }


}
