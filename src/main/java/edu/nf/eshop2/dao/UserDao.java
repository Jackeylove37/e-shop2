package edu.nf.eshop2.dao;

import edu.nf.eshop2.entity.Users;

import java.util.List;

public interface UserDao {

    void save(Users users);

    List<Users> list();

}
