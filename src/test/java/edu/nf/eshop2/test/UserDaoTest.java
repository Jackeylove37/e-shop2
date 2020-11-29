package edu.nf.eshop2.test;

import edu.nf.eshop2.dao.UserDao;
import edu.nf.eshop2.dao.impl.UserDaoImpl;
import edu.nf.eshop2.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void testSave(){
        Users users = new Users("ppp","tututu@qq.com","123456789");
        UserDao dao = new UserDaoImpl();
        dao.save(users);
    }

    @Test
    public void testList(){
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.list();
        list.forEach(li -> System.out.println(li.getUserName()));
    }

}
