package edu.nf.eshop2.dao.impl;

import edu.nf.eshop2.dao.UserDao;
import edu.nf.eshop2.entity.Users;
import edu.nf.eshop2.util.ConnUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(Users users) {
        try(SqlSession sqlSession = ConnUtils.getsqlSession(true)){
            sqlSession.getMapper(UserDao.class).save(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> list() {
        try(SqlSession sqlSession = ConnUtils.getsqlSession(true)){
            return sqlSession.getMapper(UserDao.class).list();
        }catch (RuntimeException e){
            throw e;
        }
    }
}
