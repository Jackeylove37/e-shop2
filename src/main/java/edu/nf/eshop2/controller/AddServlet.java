package edu.nf.eshop2.controller;

import edu.nf.eshop2.dao.UserDao;
import edu.nf.eshop2.dao.impl.UserDaoImpl;
import edu.nf.eshop2.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Administrator
 * @date 2020/11/29
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String e_mail = req.getParameter("e_mail");
        String pwd = req.getParameter("pwd");
        System.out.println("可以的");
        Users users = new Users();
        users.setUserName(userName);
        users.setE_mail(e_mail);
        users.setPwd(pwd);
        UserDao dao = new UserDaoImpl();
        dao.save(users);
    }
}