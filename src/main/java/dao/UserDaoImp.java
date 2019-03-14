package dao;

import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.SqlSessionFactoryUtil;

import java.util.List;

// we use singleton but not static method because it can implement interface
public class UserDaoImp implements UserDao {
    private static UserDaoImp instance;
    private UserDaoImp(){}
    public static UserDaoImp getInstance(){
        if(instance == null) {
            synchronized (UserDaoImp.class){
                if(instance == null) {
                    instance = new UserDaoImp();
                }
            }
        }
        return  instance;
    }

    public List<User> selectMany(User user) {
        SqlSession session = SqlSessionFactoryUtil.getSqlSession();
        List<User> users = session.selectList("selectManyUsers", user);
        SqlSessionFactoryUtil.closeSqlSession(session);
        return users;
    }

    public User selectOneById(int id) {
        SqlSession session = SqlSessionFactoryUtil.getSqlSession();
        User user = session.selectOne("selectOneUser", 4);
        SqlSessionFactoryUtil.closeSqlSession(session);
        return user;
    }

    public boolean updateOne(User user) {
        if( user.getId() == null) {
            System.out.println("you have to give an id");
            return false;
        }
        SqlSession session = SqlSessionFactoryUtil.getSqlSession();
        int res = session.update("updateOneUser", user);
        session.commit();
        SqlSessionFactoryUtil.closeSqlSession(session);
        return res == 1;
    }

    public boolean deleteOneById(int id) {
        SqlSession session = SqlSessionFactoryUtil.getSqlSession();
        int res = session.delete("deleteOneUser", id);
        session.commit();
        SqlSessionFactoryUtil.closeSqlSession(session);
        return res == 1;
    }

    public boolean insertOne(User user) {
        if( user.getId() != null ){
            System.out.println("id is auto create, you should not give it");
            return false;
        }
        SqlSession session = SqlSessionFactoryUtil.getSqlSession();
        int res = session.insert("insertOneUser", user);
        session.commit();
        SqlSessionFactoryUtil.closeSqlSession(session);
        return res == 1;
    }
}
