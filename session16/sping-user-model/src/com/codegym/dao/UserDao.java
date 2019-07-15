package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAccount("hai");
        u1.setEmail("hai@gmail.com");
        u1.setName("Hai");
        u1.setPassword("hai123456");
        u1.setAge(27);
        users.add(u1);

        User u2 = new User();
        u2.setAccount("john");
        u2.setEmail("john@gmail.com");
        u2.setName("John");
        u2.setPassword("john123");
        u1.setAge(27);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
