package edu.nf.eshop2.entity;

public class Users {

    private Integer id;
    private String userName;
    private String e_mail;
    private String pwd;

    public Users() {
    }

    public Users(String userName, String e_mail, String pwd) {
        this.userName = userName;
        this.e_mail = e_mail;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
