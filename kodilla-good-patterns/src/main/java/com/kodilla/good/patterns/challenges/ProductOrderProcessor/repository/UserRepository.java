package com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository;

import com.kodilla.good.patterns.challenges.ProductOrderProcessor.config.Database;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.config.SimpleDAO;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.model.User;

import java.util.ArrayList;


public class UserRepository implements SimpleDAO<User> {

    private ArrayList<User> userDatabase = new Database().getUserDatabase();

    public ArrayList<User> getUserDatabase() {
        return userDatabase;
    }

    @Override
    public boolean save(User user) {
        User checkUser = findByPropertyName(user.getEmail());
        if (checkUser == null) {
            userDatabase.add(user);
            return true;
        } else {
            System.out.println("User with email address: " + user.getEmail() + " already exists in database");
            return false;
        }
    }

    @Override
    public boolean delete(User user) {
        for (User u : userDatabase) {
            if (u.getEmail().equals(user.getEmail())) {
                userDatabase.remove(user);
                System.out.println("User " + user.getEmail() + " deleted!");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(User user) {
        for (User u : userDatabase) {
            if (u.getEmail().equals(user.getEmail())) {
                u.setFirstName(user.getFirstName());
                u.setAddress(user.getAddress());
                u.setLastName(user.getLastName());
                u.setPassword(user.getPassword());
                System.out.println("User " + user.toString() + "updated!");
                return true;
            }
        }
        return false;
    }
    @Override
    public User findByPropertyName(String email) {
        User user = null;
        for (User u : userDatabase) {
            if (u.getEmail().equals(email))
                user = u;
        }
        return user;
    }

    @Override
    public User findById(long id) {
        User user = null;
        for (User u : userDatabase) {
            if (u.getId() == id)
                user = u;
        }
        return user;
    }

}
