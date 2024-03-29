package com.example.web_dev;

import javax.persistence.*;

/**
 * 用户实体类
 *
 * @author 杨高超
 * @since 2018-03-12
 */
@Entity
//@Table(name = "AUTH_USER")
public class UserDO {
    @Id
    @GeneratedValue()
    private Long id;
    //@Column(length = 32)
    private String name;
    //@Column(length = 32)
    private String account;
    //@Column(length = 64)
    private String pwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

