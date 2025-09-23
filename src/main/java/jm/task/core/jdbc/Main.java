package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Tsarevich", (byte) 30);
        userService.saveUser("Rusalka", "Ivanovna", (byte) 25);
        userService.saveUser("Sergey", "Radonezhsky", (byte) 40);
        userService.saveUser("Anna", "Ioannovna", (byte) 22);

        List<User> allUsers = userService.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();



    }
}
