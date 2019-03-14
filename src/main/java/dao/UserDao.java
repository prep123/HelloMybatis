package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    // get a user by id
    public User selectOneById(int id);

    // update a user, require id field
    // if id field it omit, will not update any user
    public boolean updateOne(User user);

    // delete a user by id
    public boolean deleteOneById(int id);

    // select many user, will filter by
    // given user information.
    public List<User> selectMany(User user);

    // insert a user
    public boolean insertOne(User user);
}