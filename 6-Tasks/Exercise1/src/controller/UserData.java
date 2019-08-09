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

    public void addUsers(List<User> users){
        this.users.addAll(users);
    }

    public List<User> getUsers() {
        return users;
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public String findUserByPass(String pass) {
        for (User user : users) {
            if (user.getPassword().equals(pass)) {
                return user.getPassword();
            }
        }
        return null;
    }
}
