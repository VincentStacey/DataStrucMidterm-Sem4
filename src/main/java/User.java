public class User {
    String name;
    TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public void markTaskCompleted(int index) {
        taskList.markTaskCompleted(index);
    }

    public void printTasks() {
        System.out.println("\nTasks for " + name + ":");
        taskList.printTasks();
    }
}