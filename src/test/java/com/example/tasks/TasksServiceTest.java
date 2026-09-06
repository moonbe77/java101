package src.test.java.com.example.tasks;

import src.main.java.com.example.tasks.Task;
import src.main.java.com.example.tasks.TaskService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksServiceTest {

    @Test
    void countsCompletedTasks() {
        TaskService service = new TaskService();

        Task task = new Task("Learn Java", "Practice JUnit");
        Task task2 = new Task("Learn Java", "Practice JUnit 2");
        // Act
        service.addTask(task);
        service.addTask(task2);
        assertEquals(2, service.getTaskCount());

        task.complete();

        assertEquals(1, service.getCompletedTaskCount());
    }

    @Test
    void returnsCompletedTasks() {
        TaskService service = new TaskService();

        Task task = new Task("Learn Java", "Practice JUnit");
        Task task2 = new Task("Learn Java", "Practice JUnit 2");
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
        TaskService service = new TaskService();
        Task task = new Task("Learn Java", "Practice JUnit");
        service.addTask(task);
        assertEquals(0, service.getCompletedTaskCount());

    }
}
