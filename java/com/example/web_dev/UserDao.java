package com.example.web_dev;

import  java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户服务数据接口类
 *
 * @author 杨高超
 * @since 2018-03-12
 */

//@Repository
public interface UserDao extends CrudRepository<UserDO, Long> {
    List<UserDO> findByname(String name);
}

