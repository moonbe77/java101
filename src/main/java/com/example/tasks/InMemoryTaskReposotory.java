package src.main.java.com.example.tasks;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskReposotory implements TaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    @Override 
public void save (Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public Optional<Task> findById(Long id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }
}
