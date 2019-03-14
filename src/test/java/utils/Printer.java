package utils;

import entity.User;

import java.util.List;

public class Printer {
    public static void user(User user){
        System.out.println(user.getId() + user.getName()
               + user.getPassword() + user.getEmail());
    }
    public static void usersList(List<User> users){
        for(User user : users){
            Printer.user(user);
        }
    }
}
