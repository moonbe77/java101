package src.main.java.com.example.tasks;

public class Main {

    public static void main(String[] args) {
        TaskRepository repository = new InMemoryTaskReposotory();
        TaskService taskService = new TaskService(repository);

        Task task1 = new Task(1L,"Task 1", "Description for Task 1");
        Task task2 = new Task(2L,"Task 2", "Description for Task 2");

        taskService.addTask(task1);
        taskService.addTask(task2);

        System.out.println("Total tasks: " + taskService.getTaskCount());

        task1.complete();
        System.out.println("Completed tasks: " + taskService.getCompletedTaskCount());
    }
}
