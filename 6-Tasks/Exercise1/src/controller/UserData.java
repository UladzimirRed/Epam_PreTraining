package controller;

import entity.Role;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private Role role;
    private List<User> users = new ArrayList<>();
    private static UserData instance;

    private UserData() {
    }

    public static UserData getInstance() {
        if (instance == null) {
            instance = new UserData();
        }
        return instance;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public void add(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }return null;
    }
}
