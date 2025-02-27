public class UserManager {
    private User[] users;
    private int userCount;

    public UserManager(int maxUsers) {
        users = new User[maxUsers];
        userCount = 0;
    }

    public void addUser(String name) {
        if (userCount >= users.length) {
            System.out.println("User limit reached.");
            return;
        }
        for (int i = 0; i < userCount; i++) {
            if (users[i].name.equals(name)) {
                System.out.println("User already exists.");
                return;
            }
        }
        users[userCount++] = new User(name);
        System.out.println("User added successfully.");
    }

    public User getUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].name.equals(name)) {
                return users[i];
            }
        }
        return null;
    }

    public void listUsers() {
        if (userCount == 0) {
            System.out.println("No users found.");
            return;
        }
        System.out.println("\nUsers:");
        for (int i = 0; i < userCount; i++) {
            System.out.println("- " + users[i].name);
        }
    }
}