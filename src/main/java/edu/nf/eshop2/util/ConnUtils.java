package edu.nf.eshop2.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class ConnUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try{
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession getsqlSession(boolean autoCommit){return sqlSessionFactory.openSession(autoCommit);}

}
