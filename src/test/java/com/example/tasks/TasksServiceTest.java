package src.test.java.com.example.tasks;

import src.main.java.com.example.tasks.Task;
import src.main.java.com.example.tasks.TaskRepository;
import src.main.java.com.example.tasks.TaskService;
import src.main.java.com.example.tasks.InMemoryTaskReposotory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksServiceTest {

    @Test
    void countsCompletedTasks() {
        TaskRepository repository = new InMemoryTaskReposotory();
        TaskService service = new TaskService(repository);

        Task task = new Task(1L,"Learn Java", "Practice JUnit");
        Task task2 = new Task(2L,"Learn Java", "Practice JUnit 2");
        // Act
        service.addTask(task);
        service.addTask(task2);
        assertEquals(2, service.getTaskCount());

        task.complete();

        assertEquals(1, service.getCompletedTaskCount());
    }

    @Test
    void returnsCompletedTasks() {
        TaskRepository repository = new InMemoryTaskReposotory();
        TaskService service = new TaskService(repository);

        Task task = new Task(1L,"Learn Java", "Practice JUnit");
        Task task2 = new Task(2L,"Learn Java", "Practice JUnit 2");
        // Act
        service.addTask(task);
        service.addTask(task2);
        assertEquals(2, service.getTaskCount());

        task.complete();
        assertEquals(1, service.getCompletedTaskCount());
        assertEquals(task, service.getCompletedTasks().get(0));
    }

    @Test
    void newlyCreatedTaskIsNotCompleted() {
        TaskRepository repository = new InMemoryTaskReposotory();
        TaskService service = new TaskService(repository);
        Task task = new Task(1L,"Learn Java", "Practice JUnit");
        service.addTask(task);
        assertEquals(0, service.getCompletedTaskCount());

    }

    @Test void findTaskById (){
        TaskRepository repository = new InMemoryTaskReposotory();
        TaskService service = new TaskService(repository);
        Task task = new Task(1L,"Learn Java", "Practice JUnit");
        service.addTask(task);
        assertEquals(task, service.getTaskById(1L).orElse(null));
    }
    @Test void returnsEmptyIfNotExists (){
        TaskRepository repository = new InMemoryTaskReposotory();
        TaskService service = new TaskService(repository);
        Task task = new Task(1L,"Learn Java", "Practice JUnit");
        service.addTask(task);
        assertEquals(null, service.getTaskById(2L).orElse(null));
    }
}
