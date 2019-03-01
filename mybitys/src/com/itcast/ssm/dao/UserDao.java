package itcast.ssm.dao;


import itcast.ssm.po.User;

public interface UserDao {
    public User findUserById(int id)throws Exception ;
}
