package src.main.java.com.example.tasks;

public class Main {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        Task task1 = new Task("Task 1", "Description for Task 1");
        Task task2 = new Task("Task 2", "Description for Task 2");

        taskService.addTask(task1);
        taskService.addTask(task2);

        System.out.println("Total tasks: " + taskService.getTaskCount());

        task1.complete();
        System.out.println("Completed tasks: " + taskService.getCompletedTaskCount());
    }
}
