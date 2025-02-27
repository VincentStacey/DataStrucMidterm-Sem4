import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager manager = new UserManager(10);

        while (true) {
            System.out.println("\n=== To-Do List Manager ===");
            System.out.println("1. Add User");
            System.out.println("2. Select User");
            System.out.println("3. List Users");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    manager.addUser(userName);
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String selectedUser = scanner.nextLine();
                    User user = manager.getUser(selectedUser);
                    if (user == null) {
                        System.out.println("User not found.");
                        break;
                    }
                    while (true) {
                        System.out.println("\n=== " + user.name + "'s To-Do List ===");
                        System.out.println("1. Add Task");
                        System.out.println("2. Mark Task as Completed");
                        System.out.println("3. View Tasks");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter choice: ");
                        int userChoice = scanner.nextInt();
                        scanner.nextLine();
                        switch (userChoice) {
                            case 1:
                                System.out.print("Enter task description: ");
                                String taskDesc = scanner.nextLine();
                                user.addTask(taskDesc);
                                break;
                            case 2:
                                user.printTasks();
                                System.out.print("Enter task number to mark as completed: ");
                                int taskNum = scanner.nextInt();
                                user.markTaskCompleted(taskNum);
                                break;
                            case 3:
                                user.printTasks();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                        if (userChoice == 4) break;
                    }
                    break;
                case 3:
                    manager.listUsers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
