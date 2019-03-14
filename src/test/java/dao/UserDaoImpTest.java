package dao;

import entity.User;
import org.junit.Test;
import utils.Printer;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoImpTest {

    @Test
    public void selectMany() {
        User user = new User();
        user.setName("Alice");
        user.setPassword("23333");
        List<User> users = UserDaoImp.getInstance().selectMany(user);
        Printer.usersList(users);
    }

    @Test
    public void selectOneById() {
        User user = UserDaoImp.getInstance().selectOneById(4);
        Printer.user(user);
    }

    @Test
    public void updateOne() {
        User user = new User();
        user.setName("Bob");
        user.setPassword("2342333");
        user.setUpdate_time(new Date());
        user.setId(2);
        boolean res = UserDaoImp.getInstance().updateOne(user);
        System.out.println(res);
        // failed to change update_time
    }

    @Test
    public void deleteOneById() {
        UserDaoImp.getInstance().deleteOneById(4);
    }

    @Test
    public void insertOne() {
        User user = new User();
        user.setName("Parry");
        user.setPassword("234514523");
        boolean res = UserDaoImp.getInstance().insertOne(user);
        System.out.println(res);
    }
}