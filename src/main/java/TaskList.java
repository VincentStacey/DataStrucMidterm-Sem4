public class TaskList {
    private Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
        System.out.println("Task added successfully!");
    }

    public void markTaskCompleted(int index) {
        Task temp = head;
        int count = 1;

        while (temp != null) {
            if (count == index) {
                temp.markAsCompleted();
                System.out.println("Task marked as completed.");
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Invalid task number.");
    }

    public void printTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        Task temp = head;
        int index = 1;
        while (temp != null) {
            System.out.println(index + ". " + temp);
            temp = temp.next;
            index++;
        }
    }
}
