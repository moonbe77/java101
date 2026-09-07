package src.test.java.com.example.tasks;

import src.main.java.com.example.tasks.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TasksTest {

    

    @Test
    void newlyCreatedTaskIsNotCompleted() {
        
        Task task = new Task(1332L,"Learn Java", "Practice JUnit");
        
        assertFalse(task.isCompleted());

    }
}
